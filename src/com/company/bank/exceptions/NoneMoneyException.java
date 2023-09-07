package com.company.bank.exceptions;

public class NoneMoneyException extends Exception{
    public NoneMoneyException(String message) {
        super(message);
    }
}
