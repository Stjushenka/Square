package ru.netology.sqr;

public class SQRService {
    public int calculate(int lower, int hight) {
        int count = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= lower & i * i <= hight) {
                count++;
                System.out.println("Квадрат " + i);
            }
        }
        System.out.println("Количество подходящих квадратов чисел - " + count);
        return count;
    }


}

