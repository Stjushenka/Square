package ru.netology.sqr;



public class Numberofsquares {
    public static void summ(String[] args) {
        SQRService service = new SQRService();
        int lower = 200;
        int hight = 300;
        int numberofsquares;
        numberofsquares = service.calculate(lower, hight);

    }
    }
