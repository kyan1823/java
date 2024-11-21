package com.kyan.demo02;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        stuinfo[] arr = new stuinfo[1];

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        boolean exit = true;
        do {
            int id;
            int rs;
            int a,c;
            String b;
            System.out.println("menu: 1 add,2 delete,3 search,4 change,5 exit");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("id int");
                    a = sc1.nextInt();
                    System.out.println("name String");
                    b = sc1.next();
                    System.out.println("age int");
                    c = sc1.nextInt();

                    stuinfo newstu = new stuinfo(a, b, c);

                    //检查id是否重复
                    if (checkid(a, arr)) {
                        System.out.println("The id has existed.");
                        return;
                    } else {
                        //当arr满时新建，否则使用最靠前为null的
                        if (checkarr(arr) == arr.length) {
                            arr = newarr(arr);
                            arr[arr.length - 1] = newstu;
                        } else {
                            arr[checkarr(arr)] = newstu;
                        }
                    }
                    printarr(arr);
                    break;
                case 2:
                    System.out.println("input id");
                    id = sc1.nextInt();
                    rs = searchid(arr, id);
                    if (rs == -1) {
                        System.out.println("No such id.");
                    }else{
                        arr[rs] = null;
                    }
                    System.out.println("info updated");
                    printarr(arr);
                    break;
                case 3:
                    System.out.println("input id");
                    id = sc1.nextInt();
                    rs = searchid(arr, id);
                    System.out.print("the index of arr where id = " + id +" is");
                    System.out.println(rs);
                    if(rs == -1) {
                        System.out.println("not found");
                    }
                    break;
                case 4:
                    System.out.println("input id");
                    id = sc1.nextInt();
                    rs = searchid(arr, id);
                    if(rs == -1) {
                        System.out.println("No such id");
                    }else {
                        System.out.println("input a new age");
                        int newage = sc1.nextInt();
                        arr[rs].setAge(newage);
                        System.out.println("info updated");
                        printarr(arr);
                    }
                    break;
                case 5:
                    exit = false;
                    break;
            }
        }while (exit);

    }

    //检查id是否重复
    public static boolean checkid(int id, stuinfo[] arr) {
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] != null){
                    if(arr[i].getId() == id) {
                        return true;
                    }
                }
            }
        }
        return false;
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
        System.out.println();
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

    //检查并返还数组的null对应的索引
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

    public static int searchid(stuinfo[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
