package org.example;

public class SecondPart {
    static Account[] accounts = new Account[10];

    // создаем массив из 10 экземпляров
    public static void createArray() {

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account();
            accounts[i].setId(i);
            accounts[i].setBalance(10_000);
        }
    }
    // проверка наличия заданного ID
    public static boolean isIdExsists(int id){
        for (Account account: accounts){
            if (account.getId()==id){
                return true;
            }
        }
        return false;
    }

    // снимаем деньги у заданного ID заданную сумму
    public static void withDrawThisAcc(int id, double sum, boolean isSecond){
        for (Account account : accounts) {
            if (account.getId() == id) {
                account.withDraw(sum, isSecond);
            }
        }
    }
    // закидываем деньги заданному ID заданную сумму
    public static void depositThisAcc(int id, double sum, boolean isSecond){
        for (Account account : accounts) {
            if (account.getId() == id) {
                account.deposit(sum, isSecond);
            }
        }
    }

    // вернуть баланс заданного ID
    public static double getBalanceThisAcc(int id){
        for (Account account : accounts){
            if (account.getId() == id){
                return account.getBalance();
            }
        }
        return -999.9;
    }

}
