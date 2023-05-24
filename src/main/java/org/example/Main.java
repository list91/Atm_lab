package org.example;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class Main {
    public static void printLine(){
        String line = "---------------------------------------------------------";
        System.out.println(line);
    }
    public static void main(String[] args) {


        ////////// первая часть здания
        firstPart();

        printLine();

        ////////// вторая часть задания
        //создаем массив 10 экземпляров с которым нужно работать
        SecondPart.createArray();

        startMenu();
    }

    public static void startMenu(){
        boolean flag;
        Scanner scanner = new Scanner(System.in);
        while (true){
            flag = true;
            System.out.println("Введиде ID: ");
            int id = scanner.nextInt();
            if (SecondPart.isIdExsists(id)){
                while (flag){
                    printLine();
                System.out.println("\nОсновное меню идентификатора - "+Integer.toString(id)+"\n" +
                        "1: проверить баланс счета\n" +
                        "2: снять со счета\n" +
                        "3: положить на счет\n" +
                        "4: выйти\n" +
                        "Введите пункт меню: ");
                int num = scanner.nextInt();
                    if (num==1) {
                            System.out.println("Баланс - "+SecondPart.getBalanceThisAcc(id)+"руб.");}
                    else if (num==2) {
                        System.out.println("Введите сумму снятия: ");
                        double sum = scanner.nextDouble();
                        SecondPart.withDrawThisAcc(id, sum, true);
                    }
                    else if (num==3) {
                        System.out.println("Введите сумму которую нужно положить: ");
                        double sum = scanner.nextDouble();
                        SecondPart.depositThisAcc(id, sum, true);
                    }
                    else if (num==4) {
                        flag = false;
                        break;
                    }
                    else {
                        System.out.println("Неправильный пункт меню");
                    }


                }
            }else {
                System.out.println("Идентификатора "+Integer.toString(id)+" не существует.\n");
            }
        }
    }

    public static void firstPart(){
        Account account = new Account();

        // задаем параметры
        account.setId(1122);
        account.setBalance(20_000);
        account.setAnnualInterestRate(4.5);

        // снять 2 500р и положить 3 000р
        account.withDraw(2_500, false);
        account.deposit(3_000, false);

        System.out.println("\nитоговый баланс: " + Double.toString(account.getBalance()) + "руб.\n" +
                "ежемесячные проценты: " + Double.toString(account.getMonthlyInterest())+"%\n"+
                "дата создания счета: " + account.getDateCreated() +
                "\n");
    }


}
