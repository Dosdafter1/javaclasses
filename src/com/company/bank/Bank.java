package com.company.bank;

public class Bank {
    private ATMable[] atms;
    public void initATMs(Money[] money, int count){
        atms = new ATMable[count];
        for (int index = 0;index<count;index++){
            atms[index]=new ATM(money);
        }
    }
    public int getTotalSum(){
        int result=0;
        for (ATMable atm:atms) {
            result+=atm.getATMTotalSum();
        }
        return result;
    }
}
