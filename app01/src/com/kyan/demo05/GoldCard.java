package com.kyan.demo05;

public class GoldCard extends Card {
    public GoldCard() {}
    @Override
    public boolean consume(double cmoney) {
        double money = getMoney();
        if(money < cmoney) {
            System.out.println("qwe");
            return false;
        }
        money -= cmoney * 0.8;
        setMoney(money);
        if (cmoney*0.8 > 200){
            ticket();
        }
        return true;
    }

    public void ticket(){
        System.out.println("qwe");
    }
}
