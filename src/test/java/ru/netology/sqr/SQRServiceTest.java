package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void testCalculate() {
        SQRService service = new SQRService();
        int numberofsquares = service.calculate(200, 300);
        assertEquals(3, numberofsquares);

    }

    @Test
    public void testCalculatelowerfail() {
        SQRService service = new SQRService();
        int numberofsquares = service.calculate(100, 300);
        assertEquals(8, numberofsquares);

    }

    @Test
    public void testCalculateacountfail() {
        SQRService service = new SQRService();
        int numberofsquares = service.calculate(200, 300);
        assertEquals(8, numberofsquares);

    }

    @Test
    public void testCalculatelower2() {
        SQRService service = new SQRService();
        int numberofsquares = service.calculate(150, 300);
        assertEquals(5, numberofsquares);

    }

}
