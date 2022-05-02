package com.practice;

public class KangarooJump {

    public static void main(String[] args) {

    }

    String Kangaroo(int x1, int v1, int x2, int v2){
        if(x1==x2){
            return "YES";
        }
        if(x1<x2) {
            while (x1 <= x2) {
                if (x1 == x2) {
                    return "YES";
                }
                x1 = x1 + v1;
                x2 = x2 + v2;
            }
        }
        if(x2<x1){
            while (x2 <= x1) {
                if (x1 == x2) {
                    return "YES";
                }
                x1 = x1 + v1;
                x2 = x2 + v2;
            }

        }
        return "NO";
    }
}
