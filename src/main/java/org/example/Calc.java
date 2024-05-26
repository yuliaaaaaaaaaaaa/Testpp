package org.example;

public class Calc {

    public int sum(int a, int b) {
        int result;
        result = a + b;
        //System.out.println("Сумма: " + a + " и " + b + " равно " + result);
        System.out.printf("Сумма %d и %d равна %d\n", a, b, result);
        return result;
    }
    public int minus(int a, int b) {
        int result;
        result = a - b;
        System.out.println("Разность: " + a + " и " + b + " равно " + result);
//        System.out.printf("Число %d и %d равно %d", a, b, result);
        return result;
    }
}
