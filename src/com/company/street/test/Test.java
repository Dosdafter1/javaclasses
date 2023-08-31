package com.company.street.test;

import com.company.street.Street;

public class Test {
    public static void main(String[] args) {
        StreetInitializator init = new StreetInitializator();
        Street test = init.InitStreet(2,2,2,2);
        System.out.println(test.getBuildInfo(3));
    }
}
