package com.kyan.demo02;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        stuinfo[] arr = new stuinfo[3];

        Scanner sc = new Scanner(System.in);
        System.out.println("1 add,2 del,3 search,4 change");
        switch (sc.nextInt()){
            case 1:
                Scanner sc1 = new Scanner(System.in);
                System.out.println("id");
                int a = sc1.nextInt();
                System.out.println("name");
                String b = sc1.next();
                System.out.println("age");
                int c = sc1.nextInt();

                stuinfo newstu = new stuinfo(a,b,c);

                if(checkid(a,arr)){
                    System.out.println("The id has existed.");
                    return;
                }else{
                    if(checkarr(arr) == arr.length) {
                        arr = newarr(arr);
                        arr[arr.length - 1] = newstu;
                    }else{
                        arr[checkarr(arr)] = newstu;
                    }
                }
                printarr(arr);
                break;
            case 2:
        }

    }

    //检查id是否重复
    public static boolean checkid(int id, stuinfo[] arr) {
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == null){
                    return false;
                }else if(arr[i].getId() == id) {
                    return true;
                }
            }
            return false;
        }else{
            return false;
        }
    }


    //创建一个新数组，使索引范围+1
    public static stuinfo[] newarr(stuinfo[] arr) {
        stuinfo[] newarr = new stuinfo[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }
        return newarr;
    }

    //打印数组内容
    public static void printarr(stuinfo[] arr) {
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null) {
                    System.out.println(arr[i].getId());
                    System.out.println(arr[i].getName());
                    System.out.println(arr[i].getAge());
                    System.out.println();
                }else{
                    System.out.println("arr[" + i +"] is null");
                    System.out.println();
                }
            }
        }else{
            System.out.println("The array is empty");
        }
    }

    //检查数组的null对应的索引
    public static int checkarr(stuinfo[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}
