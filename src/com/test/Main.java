package com.test;

/**
 * Created by nibesh on 4/10/17.
 */
public class Main {
    public static void main(String[] args) {
        BankAccount newAcc=new BankAccount("20171004","NIBESH",500);
        try{
            if(newAcc.withdraw(100)){
                System.out.println("Amount withdraw successful");
            }
        }
        catch (InsufficientBalance insufficientBalance){
            System.out.println(insufficientBalance.getMessage());
        }

    }
}
