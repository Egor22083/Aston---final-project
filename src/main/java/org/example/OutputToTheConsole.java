package org.example;

import java.nio.file.Path;

public class OutputToTheConsole {

    private static final String RED_BOLD = "\033[1;31m";
    private static final String RESET = "\033[0m";
    public static final String ORANGE = "\033[38;5;214m";
    public static final String ORANGE_BOLD = "\033[1;38;5;214m";
    public static final String GREEN_NEON = "\033[38;5;82m";

    public static  void sayHello(){

        System.out.println("   ██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗");
        System.out.println("   ██║    ██║██╔════╝██║     ██╔════╝ ██╔══██╗████╗ ████║██╔════╝");
        System.out.println("   ██║ █╗ ██║█████╗  ██║     ██║      ██║  ██║██╔████╔██║█████╗  ");
        System.out.println("   ██║███╗██║██╔══╝  ██║     ██║      ██║  ██║██║╚██╔╝██║██╔══╝  ");
        System.out.println("   ╚███╔███╔╝███████╗███████╗╚██████╗ ██████╔╝██║ ╚═╝ ██║███████╗");
        System.out.println("    ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝");
        System.out.println();
        System.out.println("   ╔══════════════════════════════════════════════════════╗");
        System.out.println("   ║     Программа предназначена для сортировки классов   ║");
        System.out.println("   ║     Приятного использования!                         ║");
        System.out.println("   ╚══════════════════════════════════════════════════════╝");

    }
    public static void sayChoice(int choice){
        System.out.println("\n──────────────────────────────────────────");
        System.out.println("          ТЕКУЩИЙ ВЫБОР: " + choice);
        System.out.println("──────────────────────────────────────────");
        System.out.println();
        System.out.println("   1  ОСТАВИТЬ");
        System.out.println("   2  ПОМЕНЯТЬ");
        System.out.println();
        System.out.println("──────────────────────────────────────────");
        System.out.print("   Введите номер варианта: ");

    }
    public static void choosingFillIn(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║      ВЫБОР СПОСОБА ВВОДА ДАННЫХ        ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println();
        System.out.println("    ┌─────────────────────────────────┐");
        System.out.println("    │ [1] ████████████████            │");
        System.out.println("    │     С ФАЙЛА                     │");
        System.out.println("    ├─────────────────────────────────┤");
        System.out.println("    │ [2] ████████████████            │");
        System.out.println("    │     В РУЧНУЮ                    │");
        System.out.println("    ├─────────────────────────────────┤");
        System.out.println("    │ [3] ████████████████            │");
        System.out.println("    │     СЛУЧАЙНЫЕ ДАННЫЕ            │");
        System.out.println("    └─────────────────────────────────┘");
        System.out.print("\t⮞  ");
    }

    public static void sayChoosingArraySize(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("║        ВЫБОР РАЗМЕРА СОЗДАВАЕМОГО МАССИВА      ║");
        System.out.println("╚════════════════════════════════════════════════╝");
        System.out.println();
        System.out.print("\t⮞  ");
    }

    public static void sayChoosingFieldsForSorting(){

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("║       ВЫБОР ПОЛЯ, ПО КОТОРОМУ СОРТИРОВАТЬ      ║");
        System.out.println("╚════════════════════════════════════════════════╝");
        System.out.println();
        System.out.println("    ┌─────────────────────────────────┐");
        System.out.println("    │ [1] ████████████████            │");
        System.out.println("    │     МОЩНОСТЬ                    │");
        System.out.println("    ├─────────────────────────────────┤");
        System.out.println("    │ [2] ████████████████            │");
        System.out.println("    │     МОДЕЛЬ                      │");
        System.out.println("    ├─────────────────────────────────┤");
        System.out.println("    │ [3] ████████████████            │");
        System.out.println("    │     ГОД ПРОИЗВОДСТВА            │");
        System.out.println("    └─────────────────────────────────┘");
        System.out.print("\t⮞  ");

    }

    public static void sayRecordSelection(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║       В КАКОМ ВИДЕ ПОЛУЧИТЬ ДАННЫЕ       ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println();
        System.out.println("    ┌─────────────────────────────────┐");
        System.out.println("    │ [1] ████████████████            │");
        System.out.println("    │     JSON                        │");
        System.out.println("    ├─────────────────────────────────┤");
        System.out.println("    │ [2] ████████████████            │");
        System.out.println("    │     ТЕКСТОВЫЙ ВИД               │");
        System.out.println("    └─────────────────────────────────┘");

        System.out.print("\t⮞  ");

    }

    public static void sayChoosingPath(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("╔═══════════════════════════════╗");
        System.out.println("║        ВЫБОР ПУТИ ЗАПИСИ      ║");
        System.out.println("╚═══════════════════════════════╝");
        System.out.println();
        System.out.print("\t⮞  ");
    }

    public static void sayChoosingFileName(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║        ВЫБОР НАЗВАНИЯ СОХРАНЯЕМОГО ФАЙЛА      ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
        System.out.println();
        System.out.print("\t⮞  ");
    }
    public static void sayNonExistentOption(){

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(RED_BOLD + "┌──────────────────────────────────────────────────┐");
        System.out.println(RED_BOLD + "│                 ⚠  ВНИМАНИЕ! ⚠                   │");
        System.out.println(RED_BOLD + "├──────────────────────────────────────────────────┤");
        System.out.println(RED_BOLD + "│   Вы ввели вариант, которого нет в системе       │");
        System.out.println(RED_BOLD + "│   Пожалуйста, выберите из предложенных вариантов │");
        System.out.println(RED_BOLD + "└──────────────────────────────────────────────────┘" + RESET);
        System.out.println();
    }
    public static void sayAboutTheWrongFormat(){

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(RED_BOLD + "┌──────────────────────────────────────────────────┐");
        System.out.println(RED_BOLD + "│                 ⚠  ВНИМАНИЕ! ⚠                   │");
        System.out.println(RED_BOLD + "├──────────────────────────────────────────────────┤");
        System.out.println(RED_BOLD + "│   Вы ввели вариант, которого нет в системе       │");
        System.out.println(RED_BOLD + "│   Пожалуйста, выберите из предложенных вариантов │");
        System.out.println(RED_BOLD + "└──────────────────────────────────────────────────┘" + RESET);
        System.out.println();
    }

    public static void sayIsExist(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("    ╔══════════════════════════╗");
        System.out.println("    ║       Хотите выйти       ║");
        System.out.println("    ╚══════════════════════════╝");
        System.out.println();
        System.out.println(" ┌─────────────────────────────────┐");
        System.out.println(" │ [1] ████████████████            │");
        System.out.println(" │     ДА                          │");
        System.out.println(" ├─────────────────────────────────┤");
        System.out.println(" │ [2] ████████████████            │");
        System.out.println(" │     ПРОДОЛЖАЕМ                  │");
        System.out.println(" └─────────────────────────────────┘");

        System.out.print("\t⮞  ");
    }

    public static void sayPathDoesNotExist(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(RED_BOLD + "┌──────────────────────────────────────────────────┐");
        System.out.println(RED_BOLD + "│                 ⚠  ВНИМАНИЕ! ⚠                   │");
        System.out.println(RED_BOLD + "├──────────────────────────────────────────────────┤");
        System.out.println(RED_BOLD + "│   Путь не существует                             │");
        System.out.println(RED_BOLD + "│   Пожалуйста, введите существующий путь          │");
        System.out.println(RED_BOLD + "└──────────────────────────────────────────────────┘" + RESET);
        System.out.println();
    }

    public static void sayPathIsEmpty(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(RED_BOLD + "┌──────────────────────────────────────────────────┐");
        System.out.println(RED_BOLD + "│                 ⚠  ВНИМАНИЕ! ⚠                   │");
        System.out.println(RED_BOLD + "├──────────────────────────────────────────────────┤");
        System.out.println(RED_BOLD + "│  Путь не может быть пустым                       │");
        System.out.println(RED_BOLD + "└──────────────────────────────────────────────────┘" + RESET);
        System.out.println();
    }
    public static void sayPathIsWrong(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(RED_BOLD + "┌──────────────────────────────────────────────────┐");
        System.out.println(RED_BOLD + "│                 ⚠  ВНИМАНИЕ! ⚠                   │");
        System.out.println(RED_BOLD + "├──────────────────────────────────────────────────┤");
        System.out.println(RED_BOLD + "│   Путь введен неправильно!                       │");
        System.out.println(RED_BOLD + "│   Исправьте!                                     │");
        System.out.println(RED_BOLD + "└──────────────────────────────────────────────────┘" + RESET);
        System.out.println();
    }
    //WritingToFile

    public static void sayFileExists(Path path){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(ORANGE_BOLD + "┌───────────────────────────────────────────────────────┐");
        System.out.println(ORANGE_BOLD + "│                 ⚠  ВНИМАНИЕ! ⚠                        │");
        System.out.println(ORANGE_BOLD + "└───────────────────────────────────────────────────────┘");
        System.out.println(ORANGE_BOLD + "    Файл \"" + path.getFileName() + "\" уже существует "+ RESET);
        System.out.println();
        System.out.print(ORANGE_BOLD +"\tДобавить данные в конец? (да/нет)⮞  "+ RESET);
    }

    public static void sayDataAdded(){
        System.out.println();
        System.out.println(GREEN_NEON + "Данные добавлены"+ RESET);
    }
    public static void sayCancelRecording(){
        System.out.println();
        System.out.println(RED_BOLD + "Отмена записи"+ RESET);
    }
    public static void sayFileWasCreatedSuccessfully(){
        System.out.println();
        System.out.println(GREEN_NEON + "Файл успешно создан"+ RESET);
    }

    public static void sayChooseSortingMethod(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║      ВЫБОР АЛГОРИТМА СОРТИРОВКИ        ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println();
        System.out.println("    ┌──────────────────────────────────────────────┐");
        System.out.println("    │ [1] ████████████████                         │");
        System.out.println("    │     ОБЫЧНАЯ СОРТИРОВКА ПУЗЫРЬКОМ             │");
        System.out.println("    ├──────────────────────────────────────────────┤");
        System.out.println("    │ [2] ████████████████                         │");
        System.out.println("    │     ОБЫЧНАЯ БЫСТРАЯ СОРТИРОВКА               │");
        System.out.println("    ├──────────────────────────────────────────────┤");
        System.out.println("    │ [3] ████████████████                         │");
        System.out.println("    │     ОСОБАЯ СОРТИРОВКА ПУЗЫРЬКОМ              │");
        System.out.println("    ├──────────────────────────────────────────────┤");
        System.out.println("    │ [2] ████████████████                         │");
        System.out.println("    │     ОСОБАЯ БЫСТРАЯ СОРТИРОВКА                │");
        System.out.println("    └──────────────────────────────────────────────┘");

        System.out.print("\t⮞  ");
    }


}
