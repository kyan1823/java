package com.kyan.Test01;

public class Test02{
    public static void main(String[] args){
        Student st = new Student("张三", "男", 185.6, 18, "xx省xx市", true, 55.55);
        PrintInfo p = new PrintInfo(st);
        p.PrintStudentInfo();
    }
}

class Student{
    private String name;
    private String gender;
    private double height;
    private int age;
    private String address;
    private boolean school;
    private double money;

    public Student(){
    }

    public Student(String name, String gender, double height, int age,String address, boolean school, double money){
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.age = age;
        this.address = address;
        this.school = school;
        this.money = money;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setSchool(boolean school){
        this.school = school;
    }
    public boolean getSchool(){
        return school;
    }
    public void setMoney(double money){
        this.money = money;
    }
    public double getMoney(){
        return money;
    }
}

class PrintInfo{
    private Student st;

    public PrintInfo(Student st){
        this.st = st;
    }

    public void PrintStudentInfo(){
        System.out.println("************************");
        System.out.println("我的姓名是：" + st.getName());
        System.out.println("我的性别是：" + st.getGender());
        System.out.println("我的身高是：" + st.getHeight() + "cm");
        System.out.println("我的年龄是：" + st.getAge());
        System.out.println("我的地址是：" + st.getAddress());
        System.out.println("是否是本校学生：" + st.getSchool());
        System.out.println("我的饭卡余额是：" + st.getMoney() + "元");
        System.out.println("************************");
    }
}