package ru.netology.sqr;


import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;



class SQRServiceTest {
    @Test
    public void testCalculate() {
        SQRService service = new SQRService();
        int number = service.calculate(200, 300);
        assertEquals(3, number);

    }

    @Test
    public void testCalculateLower() {
        SQRService service = new SQRService();
        int number = service.calculate(99, 300);
        assertEquals(8, number);

    }

    @Test
    public void testCalculateSqr() {
        SQRService service = new SQRService();
        int number = service.calculate(150, 300);
        assertEquals(5, number);

    }

    @Test
    public void testCalculateSqr2() {
        SQRService service = new SQRService();

        int number = service.calculate(0, 300);
        assertEquals(8, number);

    }

    @Test
    public void testCalculateSqr3() {
        SQRService service = new SQRService();

        int number = service.calculate(200, 600);
        assertEquals(10, number);

    }

    @Test
    public void testCalculateSqr0() {
        SQRService service = new SQRService();

        int number = service.calculate(260, 285);
        assertEquals(0, number);

    }


}
