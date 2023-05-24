package org.example;

public class SecondPart {
    static Account[] accounts = new Account[10];
    public static void createArray(int len) {

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
    public static void withDrawThisAcc(int id, double sum){
        for (Account account : accounts) {
            if (account.getId() == id) {
                account.withDraw(sum);
            }
        }
    }
    // закидываем деньги заданному ID заданную сумму
    public static void depositThisAcc(int id, double sum){
        for (Account account : accounts) {
            if (account.getId() == id) {
                account.deposit(sum);
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
