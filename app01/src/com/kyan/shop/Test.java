package com.kyan.shop;

public class Test {
    public static void main(String[] args) {
        Goods goods1 = new Goods(1,"aaa",23.3,"aaaaaa",999);
        Goods goods2 = new Goods(2,"bbb",57.88,"bbbbbb",3);
        Goods goods3 = new Goods(3,"ccc",5999,"cccccc",65);
        Goods goods4 = new Goods(4,"ddd",3,"dddddd",9999);

        Goods[] goods = new Goods[4];
        goods[0] = goods1;
        goods[1] = goods2;
        goods[2] = goods3;
        goods[3] = goods4;

        for (int i = 0; i < goods.length; i++) {
            System.out.println(goods[i].getId() + ", " + goods[i].getName() + ", " + goods[i].getPrice());
        }
    }
}
