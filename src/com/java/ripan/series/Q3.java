package com.java.ripan.series;

// sum = 1 + (1+2) + (1+2+3) + .... n

public class Q3 {
    public static void main(String[] args) {

        int n = 3;
        double sum = 0.0;

        for(int i = 1 ; i <= n ; i ++){
            for(int j = 1; j <= i ; j ++){
                sum += j;
            }
        }

        System.out.println("sum = "+sum);
    }
}