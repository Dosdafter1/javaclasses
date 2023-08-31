package com.company.street;

public class Shop extends Building{
    private ShopType shopType;

    public ShopType getShopType() {
        return shopType;
    }

    public void setShopType(ShopType shopType) {
        this.shopType = shopType;
    }

    public Shop() {
        this.shopType = null;
    }

    public Shop(String address, ShopType shopType) {
        super(address);
        this.shopType = shopType;
    }

    @Override
    public String toString() {
        return "Shop |" + address + " | " + shopType;
    }
}
