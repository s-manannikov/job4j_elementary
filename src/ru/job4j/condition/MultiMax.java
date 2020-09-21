package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first > second ? first : second;
        return result > third ? result : third;
    }

    public static void main(String[] args) {
        int result = MultiMax.max(1, 11, 10);
        System.out.println(result);
    }
}
