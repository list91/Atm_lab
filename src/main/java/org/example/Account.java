package org.example;

import java.util.Date;

public class Account {

    private int id = 0;

    private double balance = 0;

    // годовая процентная ставка
    private  double annualInterestRate = 0;

    // дата создания счета
    private Date dateCreated;

    // Конструктор "Account()" создает новый экземпляр
    // класса "Account" с нулевыми значениями для полей
    // id и balance, а также датой создания, которая
    // устанавливается текущей датой.
    public Account() {
        id = 0;
        balance = 0;
        dateCreated = new Date();
    }

    public Account( int id, double balance) {
        this.id = 0;
        this.balance = 0;
        dateCreated = new Date();
    }

    // ID
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    // BALANCE
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // AnnualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //DATE
    public Date getDateCreated() {
        return dateCreated;
    }

    // возвращает десятичную дробь, соответствующую месячной процентной ставке
    public double getMonthlyInterest(){
        return (balance * (annualInterestRate / 12)) / 100;
    }

    // Методы "withDraw()" и "deposit()" используются для снятия и пополнения счета соответственно.
    // Если операция проводится успешно, то выводится сообщение "[Операция выполнена]".
    // Если операция не может быть выполнена, то выводится сообщение "Недостаточно средств" или "Недопустимое значение" соответственно.
    // Флаг "isSecond" используется для вывода сообщения только для второй части задания.
    public void withDraw(double sumToBeWithDrawn, boolean isSecond){
        if (sumToBeWithDrawn <= getBalance()){
            balance -=sumToBeWithDrawn;
            if (isSecond){
                System.out.println("[Операция выполнена]");
            }
        } else {
            System.out.println("Недостаточно средств");
        }
    }
    public void deposit(double sumToBeDeposit, boolean isSecond){
        if (sumToBeDeposit > 0){
            balance +=sumToBeDeposit;
            if (isSecond){
                System.out.println("[Операция выполнена]");
            }
        } else {
            System.out.println("Недопустимое значение");
        }
    }
}
