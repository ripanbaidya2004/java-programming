package com.ripan.production.pattern;

public class NumberChangingPyramidPattern {

    public static void numberChangingPyramidPattern(int n) {
        int i, j;
        int num = 1;
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                // printing value of num in each iteration.
                System.out.print(num + " ");
                // increasing the value of num.
                num++;
            }

            // printing new line for each row
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 5;
        numberChangingPyramidPattern(n);
    }
}
