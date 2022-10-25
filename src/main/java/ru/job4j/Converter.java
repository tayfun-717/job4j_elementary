package ru.job4j;

public class Converter {
    public static float sumToDollar(float summa) {
        float rsl = summa / 11000;
        return rsl;
    }

    public static void main(String[] args) {
        float dollar = Converter.sumToDollar(1000000);
        System.out.println("1000000sum are " + dollar + " $");
    }
}
