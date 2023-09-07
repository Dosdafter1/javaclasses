package com.company.bank;

public class Money {
    private final Denomination denomination;
    private int count=0;

    public Money(Denomination denomination, int count) {
        this.denomination = denomination;
        this.count = count;
    }

    public Denomination getDenomination() {
        return denomination;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Money{" +
                "denomination=" + denomination +
                ", count=" + count +
                '}';
    }
}
