package com.company.bank;

import com.company.bank.exceptions.BanknoteCountException;
import com.company.bank.exceptions.BigSumException;
import com.company.bank.exceptions.MinIssuanceSumException;
import com.company.bank.exceptions.NoneMoneyException;

public interface Issuanceable {
    Money[] issuance(int sum) throws MinIssuanceSumException, BanknoteCountException, BigSumException, NoneMoneyException;
}
