package ru.job4j.converter;

import java.io.PrintStream;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static double rubleToDollar(double value) {
        double rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        double expected2 = 2.33;
        double out2 = Converter.rubleToDollar(in);
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 2,33. Test result : " + passed2);

        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        double dollar = Converter.rubleToDollar(140);
        System.out.printf("140 rubles are %.2f dollars.%n", dollar);
    }
}
