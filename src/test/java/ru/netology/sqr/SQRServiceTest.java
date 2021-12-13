package ru.netology.sqr;



import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;


    class SQRServiceTest {
        @Test
        public void testCalculate() {
            SQRService service = new SQRService();
            int number = service.calculate(200, 300, 10);
            assertEquals(3, number);

        }

        @Test
        public void testCalculateLower() {
            SQRService service = new SQRService();
            int number = service.calculate(99, 300, 10);
            assertEquals(8, number);

        }

        @Test
        public void testCalculateCount() {
            SQRService service = new SQRService();
            int number = service.calculate(200, 300, 10);
            assertEquals(3, number);

        }

        @Test
        public void testCalculateSqr() {
            SQRService service = new SQRService();
            int number = service.calculate(150, 300, 12);
            assertEquals(5, number);

        }

        @Test
        public void testCalculateSqr2() {
            SQRService service = new SQRService();

            int number = service.calculate(0, 300, 0);
            assertEquals(17, number);

        }

        @Test
        public void testCalculateSqr3() {
            SQRService service = new SQRService();

            int number = service.calculate(150, 300, 0);
            assertEquals(5, number);

        }


    }
