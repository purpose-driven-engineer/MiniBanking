package com.eccl;

public class MiniBankingOperationImpl implements MiniBankingOperationInterf{

    MiniBanking miniBank = new MiniBanking();

    @Override
    public void viewBalance() {
        System.out.println("Current Balance: " + miniBank.getBalance());

    }

    @Override
    public void withdrawalAmount(double withdrawAmount) {

    }

    @Override
    public void depositedAmount(double depositAmount) {
        System.out.println("Deposit Successful!");
        miniBank.setBalance(miniBank.getBalance()+depositAmount);
        viewBalance();

    }

    @Override
    public void viewTransactionHistory() {

    }
}
