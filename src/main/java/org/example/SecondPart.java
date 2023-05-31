package org.example;

public class SecondPart {
    static Account[] accounts = new Account[10];

    /**
     * Создаем массив из 10 экземпляров класса Account и устанавливаем им начальные значения баланса и ID.
     */
    public static void createArray() {
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account();
            accounts[i].setId(i);
            accounts[i].setBalance(10_000);
        }
    }

    /**
     * Проверяем наличие заданного ID в созданном ранее массиве экземпляров класса Account.
     * @param id - ID аккаунта, наличие которого нужно проверить.
     * @return - true, если ID найден, false в ином случае.
     */
    public static boolean isIdExsists(int id) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                return true;
            }
        }
        return false;
    }

    /**
     * Снимаем заданную сумму со счёта с заданным ID.
     * @param id - ID аккаунта, с которого необходимо снять деньги.
     * @param sum - сумма, которую необходимо снять со счёта.
     * @param isSecond - флаг, который указывает на необходимость применения комиссии второго типа к снятию.
     */
    public static void withDrawThisAcc(int id, double sum, boolean isSecond) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                account.withDraw(sum, isSecond);
            }
        }
    }

    /**
     * Положить на счёт с заданным ID заданную сумму.
     *
     * @param id - ID аккаунта, на который нужно положить деньги.
     * @param sum - сумма, которую нужно положить на счёт.
     * @param isSecond - флаг, который указывает на необходимость применения комиссии второго типа к пополнению.
     */
    public static void depositThisAcc(int id, double sum, boolean isSecond) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                account.deposit(sum, isSecond);
            }
        }
    }

    /**
     * Получить баланс аккаунта с заданным ID.
     * @param id - ID аккаунта, баланс которого необходимо получить.
     * @return - текущий баланс аккаунта или -999.9, если аккаунт с заданным ID не найден.
     */
    public static double getBalanceThisAcc(int id) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                return account.getBalance();
            }
        }
        return -999.9;
    }
}