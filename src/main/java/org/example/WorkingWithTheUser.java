package org.example;

import org.example.comparators.strategy.Comparisons;
import org.example.console.OutputToTheConsole;
import org.example.domain.Car;
import org.example.domain.CarBuilder;
import org.example.file.WritingToFile;
import org.example.fill.FillHandler;
import org.example.fill.FillOption;
import org.example.fill.strategy.FillStrategy;
import org.example.sorting.special.SpecialSort;
import org.example.sorting.special.SpecialSortStrategy;
import org.example.sortings.sorting.Sorting;
import org.example.sortings.sorting.SortingStrategy;
import org.example.sortings.sorting.Sortings;

import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class WorkingWithTheUser {
    private static final int EXIT_CHOICE = 2;
    private static final int FILL_IN_CHOICE = 4;
    private static final int RECORD_SELECTION_CHOICE = 2;
    private static final int FIELDS_FOR_SORTING_CHOICE = 4;
    private static final int CHOOSE_SORTING_METHOD = 4;

    private static final Scanner scanner = new Scanner(System.in);

    private int choiceExit(int choice) {
        boolean flag = true;
        int exit = 0;
        while(flag) {
            try {
                OutputToTheConsole.sayChoice(choice);
                exit = scanner.nextInt();

                if(exit > EXIT_CHOICE || exit < 1) {
//                    System.out.println("Вы ввели вариант, которого нет\nПожалуйста, выберите из предложенных\n ");
                    OutputToTheConsole.sayNonExistentOption();
                }else {
                    flag = false;
                }
            } catch (InputMismatchException e) {
//                System.out.println("Вы ввели неправильный формат данных");
                OutputToTheConsole.sayAboutTheWrongFormat();
                scanner.next();
            }
        }
        return exit;
    }

    public int choosingFillIn() {
        boolean flag = true;
        int choice = 0;
        while (flag) {
            try {
                OutputToTheConsole.choosingFillIn();
                choice = scanner.nextInt();
                scanner.nextLine();
                if(choice > FILL_IN_CHOICE || choice < 1) {
//                    System.out.println("Вы ввели вариант, которого нет\nПожалуйста, выберите из предложенных\n ");
                    OutputToTheConsole.sayNonExistentOption();
                } else {

                    flag = choiceExit(choice) != 1;
                }
            } catch (InputMismatchException e){
//                System.out.println("Вы ввели неправильный формат данных");
                OutputToTheConsole.sayAboutTheWrongFormat();
                scanner.next();
            }
        }
        return choice;
    }
    public int lengthArray() {
        boolean flag = true;
        int length = 0;
        while (flag) {
//            System.out.println("Теперь введи размер создаваемого массива");
            OutputToTheConsole.sayChoosingArraySize();
            try {
            length = scanner.nextInt();

            flag = choiceExit(length) != 1;
            } catch (InputMismatchException e) {
//                System.out.println("Вы ввели неправильный формат данных");
                OutputToTheConsole.sayAboutTheWrongFormat();
                scanner.next();

            }

        }
        return length;
    }

    public List<Car> fillings(List<Car> cars, int choice) {
        FillHandler fillHandler = new FillHandler();
        FillStrategy fillStrategy = null;

        if(choice == 1){
            //Логика для заполнения с файла
            fillStrategy = fillHandler.get(FillOption.FILE);
        } else if(choice == 2){
            //Логика для заполнения в ручную
            fillStrategy = fillHandler.get(FillOption.MANUAL);
        } else if(choice == 3){
            //Логика для заполнения рандомными данными
            fillStrategy = fillHandler.get(FillOption.RANDOM);
        } else if(choice == 4){
            //Логика для заполнения через Json
            fillStrategy = fillHandler.get(FillOption.JSON);
        }
        cars = fillStrategy.fill(cars);
        return cars;
    }

    public  int recordSelection() {
        boolean flag = true;
        int record = 0;
        while (flag) {
            try {
//                System.out.println("Ваш отсортированные данные готовы!\n" +
//                        "В каком виде вы хотите их получить:\n" +
//                        "1. JSON\n" +
//                        "2. Текстовый вид");
                OutputToTheConsole.sayRecordSelection();

                record = scanner.nextInt();
                if(record > RECORD_SELECTION_CHOICE || record < 0) {
//                    System.out.println("Вы ввели вариант, которого нет\nПожалуйста, выберите из предложенных\n ");
                    OutputToTheConsole.sayNonExistentOption();
                } else {
                    flag = choiceExit(record) != 1;
                }
            } catch (InputMismatchException e){
//                System.out.println("Вы ввели неправильный формат данных");
                OutputToTheConsole.sayAboutTheWrongFormat();
                scanner.next();
            }
        }
        return record;
    }

    public boolean isExit() {
        boolean exit = false;
//        System.out.println("Хотите ли выйти из программы \n" +
//                "1. Да\n" +
//                "2. Нет");
        OutputToTheConsole.sayIsExist();
        if(scanner.nextInt() !=1) {
            exit = true;
        }
        return exit;
    }

    public int selectingFieldsForSorting() {
        boolean flag = true;
        int field = 0;
        while (flag) {
            try {

//                System.out.println("По какому из полей хотите отсортировать:\n" +
//                        "1. Мощность\n" +
//                        "2. Модель\n" +
//                        "3. Год производства");

                OutputToTheConsole.sayChoosingFieldsForSorting();
                field = scanner.nextInt();
                if(field > FIELDS_FOR_SORTING_CHOICE || field < 0) {
//                    System.out.println("Вы ввели вариант, которого нет\nПожалуйста, выберите из предложенных\n ");
                    OutputToTheConsole.sayNonExistentOption();
                } else {
                    flag = choiceExit(field) != 1;
                }
            } catch (InputMismatchException e) {
//                System.out.println("Вы ввели неправильный формат данных");
                OutputToTheConsole.sayAboutTheWrongFormat();
                scanner.next();
            }
        }
        return field;
    }

    public List<Car> sortObjects(List<Car> cars, int field, int method) {
        Comparisons comparisons = null;
        Sortings sortings;
        switch (field) {
            case 1:
                comparisons = Comparisons.BY_POWER;
                break;
            case 2:
                comparisons = Comparisons.BY_MODEL;
                break;
            case 3:
                comparisons = Comparisons.BY_YEAR;
                break;
            case 4:
                comparisons = Comparisons.STANDARD;
                break;
        }

        if (method % 2 == 1) {
            sortings = Sortings.BUBBLE;
        } else {
            sortings = Sortings.QUICK;
        }
        if (method < 3) {
            SortingStrategy sortingStrategy = new SortingStrategy();
            Sorting sorting;

            sorting = sortingStrategy.get(sortings, comparisons);
            return sorting.sort(cars);
        } else {
            SpecialSortStrategy specialSortStrategy = new SpecialSortStrategy();
            SpecialSort specialSort;

            specialSort = specialSortStrategy.get(sortings);
            return specialSort.sort(cars);
        }
    }

    public Path choosingPath() {
        boolean flag = true;
        String path = null;
        Path pathObj = null;
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
        while (flag) {
            try {
//                System.out.println("Напишите путь, куда сохранить файл");
                OutputToTheConsole.sayChoosingPath();
                path = scanner.nextLine().trim();
                pathObj = Paths.get(path);

                if (path.isEmpty()) {
//                    System.out.println("Путь не может быть пустым");
                    OutputToTheConsole.sayPathIsEmpty();
                    continue;
                }
                if (!Files.exists(pathObj)) {
//                    System.out.println("Путь не существует");
//                    System.out.println("Пожалуйста, введите существующий путь");
                    OutputToTheConsole.sayPathDoesNotExist();
                    continue;
                }

                flag = false;
            } catch (InvalidPathException e){
//                System.out.println("Путь введен неправильно! Исправьте.");
                OutputToTheConsole.sayPathIsWrong();
            }
        }
        return pathObj;
    }

    public String choosingFileName() {
//        System.out.println("Введите название файла");
        OutputToTheConsole.sayChoosingFileName();
        return scanner.nextLine().trim();
    }

    public void recordCars(int record, List<Car> cars, Path path) {
        WritingToFile writingToFile = new WritingToFile();
        switch (record) {
            case 1:
                //Json
                writingToFile.toJsonFile(cars, path);
                break;
            case 2:
                //текстовый файл
                writingToFile.toTextFile(cars, path);
                break;
        }
    }

    public int chooseSortingMethod() {
        boolean flag = true;
        int method = 0;
        while (flag) {
            try {

//                System.out.println("Ваш отсортированные данные готовы!\n" +
//                        "В каком виде вы хотите их получить:\n" +
//                        "1. JSON\n" +
//                        "2. Текстовый вид");
                OutputToTheConsole.sayChooseSortingMethod();

                method = scanner.nextInt();
                if(method > CHOOSE_SORTING_METHOD || method < 0) {
//                    System.out.println("Вы ввели вариант, которого нет\nПожалуйста, выберите из предложенных\n ");
                    OutputToTheConsole.sayNonExistentOption();
                } else {
                    flag = choiceExit(method) != 1;
                }
            } catch (InputMismatchException e){
//                System.out.println("Вы ввели неправильный формат данных");
                OutputToTheConsole.sayAboutTheWrongFormat();
                scanner.next();

            }
        }
        return method;
    }

    public String selectingTheElementCount() {
        boolean flag = true;
        String countE = null;
        while (flag) {
            try {
//                System.out.println("Ваш отсортированные данные готовы!\n" +
//                        "В каком виде вы хотите их получить:\n" +
//                        "1. JSON\n" +
//                        "2. Текстовый вид");
                OutputToTheConsole.saySelectingTheElementCount();
                scanner.nextLine();

                countE = scanner.nextLine().trim().toLowerCase();
                if(countE.equals("yes")
                        || countE.equals("да")
                        || countE.equals("no")
                        || countE.equals("нет") ) {
                    flag = false;
//                    System.out.println("Вы ввели вариант, которого нет\nПожалуйста, выберите из предложенных\n ");
                } else {
                    OutputToTheConsole.sayNonExistentOption();
                }
            } catch (InputMismatchException e){
//                System.out.println("Вы ввели неправильный формат данных");
                OutputToTheConsole.sayAboutTheWrongFormat();
                scanner.next();

            }
        }
        return countE;
    }

    public int countElement(List<Car> cars) {
        boolean flag = true;

        double power = 0.0;
        String model = "";
        int year = 0;
        int count = 0;
        while (flag) {
            try {
                OutputToTheConsole.sayEnterPower();
                power = scanner.nextDouble();
                OutputToTheConsole.sayEnterModel();
                scanner.nextLine();
                model = scanner.nextLine().trim().toLowerCase();
                OutputToTheConsole.sayEnterYear();
                year = scanner.nextInt();

                if(power < -1 || year < 0) {
//                    System.out.println("Вы ввели вариант, которого нет\nПожалуйста, выберите из предложенных\n ");
                    OutputToTheConsole.sayLimitations();
                } else {
                    flag = false;
                }
            } catch (InputMismatchException e){
//                System.out.println("Вы ввели неправильный формат данных");
                OutputToTheConsole.sayAboutTheWrongFormat();
                scanner.next();
            }
        }

        //ЗДЕСЬ УЖЕ ВЫЧИСЛЯЕТСЯ
        Car car = CarBuilder.name(model).year(year).power(power).build();
        count = ElementCounter.countOccurrencesSimple(cars, car);

        OutputToTheConsole.sayResultTheElementCount(count);

        return count;
    }
}
