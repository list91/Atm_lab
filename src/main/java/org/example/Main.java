package org.example;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // первая часть здания
        FirstPart.firstPart();
        printLine();

        // вторая часть задания - создание массива экземпляров класса Account
        SecondPart.createArray();

        // запуск меню для работы с экземплярами класса Account
        startMenu();
    }

    /**
     * Метод startMenu() вызывает меню для работы с экземплярами класса SecondPart.
     * Он запрашивает идентификатор экземпляра, затем выводит меню,
     * дает возможность получить баланс, снять деньги со счета,
     * положить деньги на `счет` и выйти из меню.
     */
    public static void startMenu() {
        boolean flag;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            flag = true;
            System.out.println("Введиде ID: ");
            int id = scanner.nextInt();
            if (SecondPart.isIdExsists(id)) {
                while (flag) {
                    printLine();
                    System.out.println("\nОсновное меню идентификатора - " + Integer.toString(id) + "\n" +
                            "1: проверить баланс счета\n" +
                            "2: снять со счета\n" +
                            "3: положить на счет\n" +
                            "4: выйти\n" +
                            "Введите пункт меню: ");
                    int num = scanner.nextInt();
                    if (num == 1) {
                        System.out.println("Баланс - " + SecondPart.getBalanceThisAcc(id) + "руб.");
                    } else if (num == 2) {
                        System.out.println("Введите сумму снятия: ");
                        double sum = scanner.nextDouble();
                        SecondPart.withDrawThisAcc(id, sum, true);
                    } else if (num == 3) {
                        System.out.println("Введите сумму, которую нужно положить: ");
                        double sum = scanner.nextDouble();
                        SecondPart.depositThisAcc(id, sum, true);
                    } else if (num == 4) {
                        flag = false;
                        break;
                    } else {
                        System.out.println("Неправильный пункт меню");
                    }
                }
            } else {
                System.out.println("Идентификатора " + Integer.toString(id) + " не существует.\n");
            }
        }
    }

    // метод для печати разделительной линии
    public static void printLine() {
        System.out.println("---------------------------------------------------------");
    }
}