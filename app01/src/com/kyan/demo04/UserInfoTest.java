package com.kyan.demo04;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInfoTest {
    public static void main(String[] args) {
        ArrayList<UserInfo> list = new ArrayList<>();
        UserInfo u1 = new UserInfo("2020001","aaa","123456");
        list.add(u1);
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        do {
            System.out.println("1 insert, 2 check, 3 search, 4 exit");
            switch (sc.nextInt()) {
                case 1:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("input id,username,password");
                    String id = sc1.nextLine();
                    UserInfo u = new UserInfo(id, sc1.nextLine(), sc1.nextLine());
                    if(check(id,list)){
                        System.out.println("id has contained in list");
                    }else{
                        list.add(u);
                        System.out.println("data updated");
                    }
                    break;
                case 2:
                    if(list.isEmpty()) {
                        System.out.println("list is empty");
                    }else {
                        Scanner sc2 = new Scanner(System.in);
                        System.out.println("input id");
                        if(check(sc2.nextLine(), list)){
                            System.out.println("contained in list");
                        }else{
                            System.out.println("not contained in list");
                        }
                    }
                    break;
                case 3:
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("input id");
                    String rs = search(sc3.nextLine(), list);
                    if(rs == null){
                        System.out.println("id not exist");
                    }else{
                        System.out.println("index | username | password");
                        System.out.println(rs);
                    }
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }while (flag);
    }

    private static boolean check(String id,ArrayList<UserInfo> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    private static String search(String id,ArrayList<UserInfo> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i + " " + list.get(i).getUsername() + " " + list.get(i).getPassword();
            }
        }
        return null;
    }
}
