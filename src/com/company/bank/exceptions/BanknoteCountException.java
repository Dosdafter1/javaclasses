package com.company.bank.exceptions;

import com.company.bank.Issuanceable;
import com.company.bank.Money;

import java.util.ArrayList;

public class BanknoteCountException extends Exception {
    private Money[] monies;
    private int maxBanknoteCount=20;
    private int inputSum;

    public BanknoteCountException(String message, Money[] money, int inputSum) {
        super(message);
        this.monies = money;
        this.inputSum=inputSum;
    }

    public BanknoteCountException(String message, Money[] money, int inputSum, int maxBanknoteCount) {
        this(message,money,inputSum);
        this.maxBanknoteCount = maxBanknoteCount;
    }

    private Money[] issuance() {
        ArrayList<Money> result = new ArrayList<>();
        int banknoteCount = 0;
        int prevIndex = monies.length-1;
        Money temp = null;
        while(inputSum>0){
            for(int index = monies.length-1; index>-1;){
                if(inputSum>monies[index].getDenomination().getNumber()){
                    inputSum-=monies[index].getDenomination().getNumber();
                    ++banknoteCount;
                    if(result.size()>0){
                        if(index==prevIndex){
                            temp = result.get(result.size()-1);
                            temp.setCount(temp.getCount()+1);
                            //result.set(result.size()-1,temp);
                        }
                        else {
                            prevIndex = index;
                            result.add(new Money(monies[index].getDenomination(), 1));
                        }
                    }
                    else {
                        result.add(new Money(monies[index].getDenomination(), 1));
                    }
                }
                else {
                    prevIndex = index;
                    index--;
                }
                if(inputSum==0 || banknoteCount==maxBanknoteCount){
                    break;
                }
            }
        }
        return result.toArray(new Money[result.size()]);
    }

    // повертає список видач
    public ArrayList<Money[]> getCoupleIssuance()  {
        ArrayList<Money[]> result = new ArrayList<>();
        while (inputSum>0){
            result.add(issuance());
        }
        return result;
    }


}
