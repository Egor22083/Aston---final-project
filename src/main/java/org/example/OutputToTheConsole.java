package org.example;

public class OutputToTheConsole {
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
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║      ВЫБОР СПОСОБА ВВОДА ДАННЫХ       ║");
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
        System.out.println();
    }
}
