package org.example;

import java.util.Date;

public class Account {

    private int id = 0;

    private double balance = 0;

    // годовая процентная ставка
    private  double annualInterestRate = 0;

    // дата создания счета
    private Date dateCreated;

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

    public double getMonthlyInterest(){
        return (balance * (annualInterestRate / 12)) / 100;
    }

    public void withDraw(double sumToBeWithDrawn){
        balance -=sumToBeWithDrawn;
    }
    public void deposit(double sumToBeDeposit){
        balance +=sumToBeDeposit;
    }
}
