package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int count = 0;
        int rest = money - price;
        int[] rsl = new int[100];
        int size = 0;
        while (rest > 0) {
            int temp = rest - coins[count];
            if (temp >= 0) {
                rest = temp;
                rsl[size++] = coins[count];
            } else {
                count++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
