package com.test;

/**
 * Created by nibesh on 4/10/17.
 */
public interface AccInterface {
    boolean withdraw(double amount) throws InsufficientBalance;
    boolean deposit(double amount);
    double checkBalance();

}
