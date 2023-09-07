package com.company.bank;

public interface ATMable extends Replenishmentable, Issuanceable{
    int getATMTotalSum();
}

