package com.eccl;

import java.util.HashMap;
import java.util.Map;

public class MiniBankingOperationImpl implements MiniBankingOperationInterf{

    MiniBanking miniBank = new MiniBanking();
    Map<Double, String> transactionHistory = new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Current Balance: " + miniBank.getBalance());

    }

    @Override
    public void withdrawalAmount(double withdrawAmount) {
        if (withdrawAmount <= miniBank.getBalance()){
            transactionHistory.put(withdrawAmount, " Withdrawn");
            System.out.println(withdrawAmount + " Withdrawal Successful!");
            miniBank.setBalance(miniBank.getBalance() - withdrawAmount);
            viewBalance();
        } else {
            System.out.println("You do not have sufficient balance.");
        }
    }

    @Override
    public void depositedAmount(double depositAmount) {
        transactionHistory.put(depositAmount, " Deposited");
        System.out.println(depositAmount + " Deposit Successful!");
        miniBank.setBalance(miniBank.getBalance() + depositAmount);
        viewBalance();

    }

    @Override
    public void viewTransactionHistory() {
        for(Map.Entry<Double,String> t:transactionHistory.entrySet()){
            System.out.println(t.getKey() +""+ t.getValue());
        }

    }
}
