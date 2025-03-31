package com.kyan.t0314;

public class Test {
    public static void main(String[] args) {
        Meal.main();
    }
}
/*某外卖商家的菜品单价如下:
        （1）.鱼香肉丝每份24元,油炸花生米每份8元,米饭每份3元。
        （2）.优惠方式:
总金额大于100元,总金额打9折,其它无折扣
 （3）.需求:
小明购买了3分鱼香肉丝,3份花生米,5份米饭,最终需要付多少钱?*/
class Meal{
    public static void main() {
        int fish = 24;
        int peanut = 8;
        int rice = 3;
        int total = fish * 3 + peanut * 3 + rice * 5;
        if(total > 100){
            total = (int)(total * 0.9);
        }
        System.out.println(total);
    }
}
