package com.company.street.test;


import com.company.street.Shop;
import com.company.street.ShopType;

public class ShopInitializator {
    private Shop[] shops = {
            new Shop("st 1", ShopType.FOOD),
            new Shop("st 2", ShopType.SPECIALIZED),
            new Shop("st 3", ShopType.SUPERMARKET),
            new Shop("st 4", ShopType.FOOD),
            new Shop("st 5", ShopType.SUPERMARKET),
    };

    public Shop[] getShops (int count)
    {
        if(count==0){
            return null;
        }
        int size;
        if(count > shops.length){
            size = shops.length;
        }
        else {
            size = count;
        }
        Shop[] result = new Shop[size];
        for(int index=0;index < size;index++) {
            result[index]=shops[index];
        }
        return result;
    }
}
