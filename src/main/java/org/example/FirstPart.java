package org.example;

public class FirstPart {
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
