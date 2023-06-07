package org.example;
import java.util.Date;

import static org.example.SecondPart.accounts;

public class Account {

    private int id = 0;

    private double balance = 0;

    /**
     * Годовая процентная ставка
     */
    private double annualInterestRate = 0;

    // Дата создания счета
    private Date dateCreated;

    /**
     * Конструктор "Account()" создает новый экземпляр
     * класса "Account" с нулевыми значениями для полей
     * id и balance, а также датой создания, которая
     * устанавливается текущей датой.
     */
    public Account() {
        id = 0;
        balance = 0;
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    /**
     * @return ID Клиента
     */
    public int getId() {
        return id;
    }

    /**
     * Устанавливает ID клиента
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return Баланс счета
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Устанавливает баланс счета
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return Годовая процентная ставка
     */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * Устанавливает годовую процентную ставку
     * @param annualInterestRate
     */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * @return Дата создания счета
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * Возвращает десятичную дробь, соответствующую месячной процентной ставке.
     * @return
     */
    public double getMonthlyInterest() {
        return (balance * (annualInterestRate / 12)) / 100;
    }

    /**
     * Методы "withDraw()" и "deposit()" используются для снятия и пополнения счета соответственно.
     * Если операция проводится успешно, то выводится сообщение "[Операция выполнена]".
     * Если операция не может быть выполнена, то выводится сообщение "Недостаточно средств" или "Недопустимое значение" соответственно.
     * Флаг "isSecond" используется для вывода сообщения только для второй части задания.
     * @param sumToBeWithDrawn - сумма, которую нужно снять со счета
     * @param isSecond - флаг для вывода сообщения об успешном выполнении операции только для второй части задания
     */
    public void withDraw(double sumToBeWithDrawn, boolean isSecond) {
        if (sumToBeWithDrawn <= getBalance()) {
            balance -= sumToBeWithDrawn;
            if (isSecond) {
                System.out.println("[Операция выполнена]");
            }
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    /**
     * Метод для пополнения счета.
     * Если операция проводится успешно, то выводится сообщение "[Операция выполнена]".
     * Если операция не может быть выполнена, то выводится сообщение "Недопустимое значение".
     * Флаг "isSecond" используется для вывода сообщения об успешном выполнении операции только для второй части задания.
     * @param sumToBeDeposit - сумма, на которую нужно пополнить счет
     * @param isSecond - флаг для вывода сообщения об успешном выполнении операции только для второй части задания
     */
    public void deposit(double sumToBeDeposit, boolean isSecond) {
        if (sumToBeDeposit > 0) {
            balance += sumToBeDeposit;
            if (isSecond) {
                System.out.println("[Операция выполнена]");
            }
        } else {
            System.out.println("Недопустимое значение");
        }
    }

    /**
     * @param id
     * @return true/false
     * Проверка наличия указанного ID в массиве объектов класса
     */
    public static boolean isIdExsists(int id) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                return true;
            }
        }
        return false;
    }
}