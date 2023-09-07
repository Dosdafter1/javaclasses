package com.company.bank.exceptions;

public class MinIssuanceSumException extends Exception{
    private int minIssuanceSum = 50;
    private int inputSum;

    public MinIssuanceSumException(String message,  int inputSum) {
        super(message);
        this.inputSum = inputSum;
    }
    public MinIssuanceSumException(String message, int minIssuanceSum, int inputSum) {
        this(message,inputSum);
        this.minIssuanceSum = minIssuanceSum;
    }
    public int getDivSum() {
        return minIssuanceSum-inputSum;
    }
}
