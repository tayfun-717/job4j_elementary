package ru.job4j;

public class Method {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }
    public static void main(String[] args) {
        Method.plus(1, 2);
        Method.plus(10, 11);
    }
}