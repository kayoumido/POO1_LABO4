package com.company;

import com.company.Int;

public class Main {

    public static void main(String[] args) {

        int[] integers = new int[args.length];
        for (int i = 0; i < args.length; ++i) {

            char[] number = args[i].toCharArray();
            int multiplier = 1;
            for (int j = number.length - 1, power = 0; j >= 0; --j) {

                if (!Character.isDigit(number[j]))
                    continue;

                if (number[0] == '-') {
                    multiplier = -1;
                }

                int digit = multiplier * (int)Math.pow(10, power) * (number[j] - '0');

                integers[i] +=  digit;
                ++power;
            }
        }

        bubbleSort(integers);

        for (int integer : integers) {
            System.out.println(integer);
        }
    }

    private static void bubbleSort(int[] sortable) {

        for (int i = 0; i < sortable.length; ++i) {
            for (int j = 1; j < sortable.length - i; ++j) {
                if (sortable[j-1] > sortable[j]) {
                    int tmp = sortable[j-1];
                    sortable[j-1] = sortable[j];
                    sortable[j] = tmp;
                }
            }
        }
    }
}
