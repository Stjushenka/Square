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
        int add = service.calculate(200, 300);
        assertEquals(3, add);

    }

    @Test
    public void testCalculatelowerfail() {
        SQRService service = new SQRService();
        int add = service.calculate(100, 300);
        assertEquals(8, add);

    }

    @Test
    public void testCalculateacountfail() {
        SQRService service = new SQRService();
        int add = service.calculate(200, 300);
        assertEquals(8, add);

    }

    @Test
    public void testCalculatelower2() {
        SQRService service = new SQRService();
        int add = service.calculate(150, 300);
        assertEquals(5, add);

    }

}
