package com.kyan.demo05;

public class SilverCard extends Card {
    public SilverCard() {}
    @Override
    public boolean consume(double cmoney) {
        double money = getMoney();
        if(money < cmoney) {
            System.out.println("qwe");
            return false;
        }
        money -= cmoney * 0.9;
        setMoney(money);
        return true;
    }
}
