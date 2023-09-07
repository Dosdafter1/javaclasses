package com.company.bank.exceptions;

public class BigSumException extends Exception {
    private final int maxSum;

    public BigSumException(String message, int maxSum) {
        super(message);
        this.maxSum = maxSum;
    }

    public int getMaxSum(int remainder) {
        return maxSum - remainder;
    }
}
