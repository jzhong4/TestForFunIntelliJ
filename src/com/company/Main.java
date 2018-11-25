package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        String a = "abc";
        if(a == "abc"){
            System.out.print(a.concat("abc"));
        }
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, a);
        map.get(1);
        int x;

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        ArrayList<Integer> list = new ArrayList<>();
        int b = 2;
        getTooMuch(b);

        int c = 123;

    }

    private static void getTooMuch(int a){
        int b = 123;
        int c = 345;
        int d= b + c;
    }
}
