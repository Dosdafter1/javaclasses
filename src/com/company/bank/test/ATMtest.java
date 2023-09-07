package com.company.bank.test;

import com.company.bank.ATM;
import com.company.bank.Denomination;
import com.company.bank.Money;
import com.company.bank.exceptions.BanknoteCountException;
import com.company.bank.exceptions.BigSumException;
import com.company.bank.exceptions.MinIssuanceSumException;
import com.company.bank.exceptions.NoneMoneyException;

public class ATMtest {
    public static void main(String[] args) {
        Money[] m = new Money[]{
                new Money(Denomination.ONE,20),
                new Money(Denomination.TWO,20),
                new Money(Denomination.FIVE,20),
                new Money(Denomination.TEN,20),
                new Money(Denomination.TWENTY,20),
                new Money(Denomination.FIFTY,20),
                new Money(Denomination.HUNDRED,20),
                new Money(Denomination.TWO_HUNDRED,20),
                new Money(Denomination.FIVE_HUNDRED,20),
        };
        ATM a = new ATM(m);
        System.out.println("total sum: "+a.getATMTotalSum());
        Money[] t=null;
        try {
             t = a.issuance(205);
        }
        catch (MinIssuanceSumException ex){
            System.out.println(ex.getMessage());
        }
        catch (BigSumException ex) {
            System.out.println(ex.getMessage());
        }
        catch (BanknoteCountException ex) {
            System.out.println(ex.getMessage());
        }
        catch (NoneMoneyException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(t);
        if(t!=null){
            for (Money mon : t
                 ) {
                System.out.println(mon);
            }
        }
    }
}
