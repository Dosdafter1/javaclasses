package com.company.classes;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator=1;
        this.denominator=2;
    }
    public Fraction(int numerator, int denominator) {
        this.numerator=numerator;
        this.denominator=denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        Fraction result =  new Fraction();
        result.setNumerator(newNumerator);
        result.setDenominator(newDenominator);
        return result;
    }

    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        Fraction result =  new Fraction();
        result.setNumerator(newNumerator);
        result.setDenominator(newDenominator);
        return result;
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        Fraction result =  new Fraction();
        result.setNumerator(newNumerator);
        result.setDenominator(newDenominator);
        return result;
    }

    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            Fraction err =  new Fraction();
            err.setNumerator(0);
            err.setDenominator(0);
            return err;
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        Fraction result =  new Fraction();
        result.setNumerator(newNumerator);
        result.setDenominator(newDenominator);
        return result;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

}
