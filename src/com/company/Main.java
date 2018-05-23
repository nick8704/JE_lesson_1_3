package com.company;

public class Main {

    static int[] array = {8, 15, 0, -9, 56, 12, -7, 40, -25, 18};

    public static void main(String[] args) {
        System.out.printf("%.1f", average(array));
    }

    private static double average(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return 1.0 * sum / values.length;
    }
}