package org.example;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        String line = "---------------------------------------------------------";

        // первая часть здания
        firstPart(line);


    }
    public static void firstPart(String line){
        Account account = new Account();

        // задаем параметры
        account.setId(1122);
        account.setBalance(20_000);
        account.setAnnualInterestRate(4.5);

        // снять 2 500р и положить 3 000р
        account.withDraw(2_500);
        account.deposit(3_000);

        System.out.println("\nитоговый баланс: " + Double.toString(account.getBalance()) + "руб.\n" +
                "ежемесячные проценты: " + Double.toString(account.getMonthlyInterest())+"%\n"+
                "дата создания счета: " + account.getDateCreated() +
                "\n" + line);
    }


}
