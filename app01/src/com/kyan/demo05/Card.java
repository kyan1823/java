package com.kyan.demo05;

public class Card {
    private int carId;
    private String name;
    private String phoneNumber;
    private double money;

    public Card() {
    }

    public Card(int carId, String name, String phoneNumber, double money) {
        this.carId = carId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.money = money;
    }

    public boolean consume(double cmoney) {
        if(this.money < cmoney) {
            System.out.println("qwe");
            return false;
        }
        this.money -= cmoney;
        return true;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "info \n" +
                "carId: " + carId +
                ", name :'" + name + '\'' +
                ", phoneNumber: '" + phoneNumber + '\'' +
                ", money: " + money +
                "\n";
    }
}
