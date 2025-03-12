package com.kyan.demo05;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<>();
        use u = new use();
        u.register(cards);
        System.out.println("****************");
        u.consume(cards);
    }
}

class use {
    private Card card;

    public use() {
    }

    public void consume(ArrayList cards) {
        Scanner sc = new Scanner(System.in);
        boolean c;
        do {
            System.out.println("input carId");
            int carId = sc.nextInt();
            sc.nextLine();
            Card tmp = select(carId, cards);
            if (tmp != null) {
                this.card = tmp;
                c = false;
            }else{
                c=true;
            }
        }while (c);
        boolean flag;
        do {
        System.out.println("input money");
        double cmoney = sc.nextInt();
        sc.nextLine();
            flag = card.consume(cmoney);
        }while (!flag);
        System.out.println(card);
    }

    public void register(ArrayList cards) {
        Scanner sc = new Scanner(System.in);
        boolean c;
        int carId;
        do{
            System.out.println("input carId");
            carId = sc.nextInt();
            sc.nextLine();
            c = check(carId, cards);
            if(c) {
                System.out.println("carId is already in use");
            }
        }while(c);
        System.out.println("input name");
        String name = sc.nextLine();
        System.out.println("input phoneNumber");
        String phoneNumber = sc.nextLine();
        System.out.println("input money");
        double money = sc.nextDouble();
        sc.nextLine();

        if(money >= 5000){
            this.card = new GoldCard();
        } else if (money >= 2000) {
            this.card = new SilverCard();
        }else{
            this.card = new Card();
        }
        card.setCarId(carId);
        card.setName(name);
        card.setPhoneNumber(phoneNumber);
        card.setMoney(money);
        System.out.println(card);
        cards.add(card);
    }

    private static boolean check(int carId,ArrayList<Card> cards) {
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getCarId() == carId) {
                return true;
            }
        }
        return false;
    }

    private static Card select(int carId,ArrayList<Card> cards) {
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getCarId() == carId) {
                return cards.get(i);
            }else {
                System.out.println("no such card");
            }
        }
        return null;
    }

}