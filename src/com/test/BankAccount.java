package com.test;

/**
 * Created by nibesh on 4/10/17.
 */
public class BankAccount implements AccInterface{

    private String accountNbr="";
    private String accountHolder="";
    private double amount;

    public BankAccount(String accountNbr,String accountHolder,double initialAmount){
        this.accountNbr=accountNbr;
        this.accountHolder=accountHolder;
        this.amount =initialAmount;
    }

    public String getAccountNbr() {
        return accountNbr;
    }

    public void setAccountNbr(String accountNbr) {
        this.accountNbr = accountNbr;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    @Override
    public boolean withdraw(double amount) throws InsufficientBalance {
        boolean success=false;
        if(this.amount >(amount+Constant.MIN_AMOUNT)) {
            this.amount += amount;
            success=true;
        }
        else
            throw new InsufficientBalance("You have insufficient Balance");


        return success;
    }

    @Override
    public boolean deposit(double amount) {
        boolean success=false;
        double preiviousAmount=this.amount;
        this.amount+=amount;
        if(this.amount>preiviousAmount)
            success=true;
        return success;
    }

    @Override
    public double checkBalance() {
        return this.amount;
    }
}
