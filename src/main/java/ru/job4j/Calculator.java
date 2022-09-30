package ru.job4j;

import org.w3c.dom.ls.LSOutput;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);

        String test = sixDivTwo == fiveMinusTwo ?  "RAVNO" : "asdasd";
        System.out.println(test);
        }
    }

