package ua.edson.season;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

//Ввести с косоли месяц года (числом или текстом). Вывести время года.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер месяца года: ");
        int month = scanner.nextInt();

//         winter = 12, 1 , 2
//         spring = 3, 4, 5
//         summer = 6, 7, 8
//         autumn = 9, 10, 11

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Месяц был введён не корректно!");
        }
    }
}
