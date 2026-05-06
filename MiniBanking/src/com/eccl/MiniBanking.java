package com.eccl;

public class MiniBanking {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;


    // constructor
    public MiniBanking(){ }

    // getters and setters: balance
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    // getters and setters: depositAmount
    public double getDepositAmount(){
        return depositAmount;
    }
    public void setDepositAmount(double depositAmount){
        this.depositAmount = depositAmount;
    }

    // getters and setters: withdrawAmount
    public double getWithdrawAmount(){
        return withdrawAmount;
    }
    public void setWithdrawAmount(double withdrawAmount){
        this.withdrawAmount = withdrawAmount;
    }

}
