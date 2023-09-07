package com.company.bank;

import com.company.bank.exceptions.BanknoteCountException;
import com.company.bank.exceptions.BigSumException;
import com.company.bank.exceptions.MinIssuanceSumException;
import com.company.bank.exceptions.NoneMoneyException;

import java.util.ArrayList;
import java.util.Arrays;

public class ATM implements ATMable{
    private Money[] monies;
    private int maxBanknoteCount=20;
    private int minIssuanceSum=50;

    public ATM(Money[] monies) {
        this.monies = monies;
    }
    public ATM(Money[] monies, int maxMoneyCount, int minIssuanceSum) {
        this(monies);
        this.maxBanknoteCount = maxMoneyCount;
        this.minIssuanceSum = minIssuanceSum;
    }

    public void initATM(Money[] money){
        this.monies=money;
    }

    @Override
    public int getATMTotalSum() {
        int result=0;
        for (Money money:monies) {
            result+=(money.getDenomination().getNumber() * money.getCount());
        }
        return result;
    }

    @Override
    public Money[] issuance(int sum) throws MinIssuanceSumException, BanknoteCountException, BigSumException, NoneMoneyException {
        if(getATMTotalSum()==0){
            throw new NoneMoneyException("The money has run out");
        }
        if(sum<minIssuanceSum){
            throw new MinIssuanceSumException("The amount entered is too small",minIssuanceSum,sum);
        }
        if(sum>getATMTotalSum()){
            throw new BigSumException("The amount is too large",getATMTotalSum());
        }
        ArrayList<Money> result = new ArrayList<>();
        int banknoteCount = 0;
        int tempSum = sum;
        int prevIndex = monies.length-1;
        Money temp = null;
        while(tempSum>0){
            for(int index = monies.length-1; index>-1;){
                if(tempSum>=monies[index].getDenomination().getNumber()){
                    tempSum-=monies[index].getDenomination().getNumber();
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
                if(banknoteCount>maxBanknoteCount){
                    throw new BanknoteCountException("Banknote limit exceeded",monies, sum, maxBanknoteCount);
                }
                if(tempSum==0){
                    break;
                }
                else if (tempSum<monies[index].getDenomination().getNumber()) {
                    prevIndex = index;
                    index--;
                }
            }
        }
        return result.toArray(new Money[result.size()]);
    }

    @Override
    public void replenishment(Money... m) {
        int index=0;
        int count;
        for (Money money:m) {
            index = Arrays.binarySearch(monies, money, (a,b)->a.getDenomination().compareTo(b.getDenomination()));
            count = monies[index].getCount();
            monies[index].setCount(count+money.getCount());
        }
    }
}
