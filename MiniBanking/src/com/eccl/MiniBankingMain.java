package com.eccl;

import java.util.Scanner;

/** This is basically an implementation of a Banking (or ATM) system
 * 1. Use Bank Number and PIN for Auth
 * 2. Check Available Balance
 * 3. Make Deposit
 * 4. Make Withdrawals
 * 5. Print Mini Transaction History
 * 6. Log out of account
 * */

public class MiniBankingMain {
    public static void main(String[] args) throws IllegalStateException {
        System.out.println("\nWelcome to London MiniBanking\n==============================\n");

        MiniBankingOperationInterf bankingOps = new MiniBankingOperationImpl();

        // instantiate authentications variables
        int customerNumber = 98765;
        final int PIN = 1982;

        // request customer credentials
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Your Customer Number: ");
        int customerInput = userInput.nextInt();
        System.out.print("Enter Customer PIN: ");
        int customerPin = userInput.nextInt();

        //validate credentials
        if ((customerInput == customerNumber) && (customerPin == PIN)){
            System.out.println("Customer Account confirmed!\n");
            while(true){

                System.out.println("What would you like to do today? ");
                System.out.print("1. Check Account Balance.\n2. Make Deposit.\n3. Make Withdrawal. \n4. Print Transaction History. \n5. Log out of account. \n");
                int choice = userInput.nextInt();

                switch(choice){
                    case 1:
                        System.out.println("Your Account balance is: ");
                        bankingOps.viewBalance();
                        break;

                    case 2:
                        System.out.println("How much do you want to deposit now? ");
                        double deposit = userInput.nextDouble();
                        bankingOps.depositedAmount(deposit);
                        break;

                    case 3:
                        System.out.println("How much would you like to withdraw now? ");
                        double withdraw = userInput.nextDouble();
                        bankingOps.withdrawalAmount(withdraw);
                        break;

                    case 4:
                        System.out.println("Here is your transaction history. ");
                        bankingOps.viewTransactionHistory();
                        break;

                    case 5:
                        System.out.println("Account Logged Off.\n Thank you for using London MiniBanking");
                        break;

                    default:
                        System.out.println("Unexpected value: " + choice + ". Please enter between 1 and 5.");
                        break;
                }

            }
        } else {
            System.out.println("Customer has no account with us!");
        }

    }
}
