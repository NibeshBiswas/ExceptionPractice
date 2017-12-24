package com.test;

/**
 * Created by nibesh on 4/10/17.
 */
public class InsufficientBalance extends Exception{
    public InsufficientBalance(String msg){
        super(msg);
    }
}
