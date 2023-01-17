package ru.netology.sqr;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {
    @Test
    public void calcSQRWhenLimitsPositive () {
        SQRService service = new SQRService();

        int lowLimit = 0;
        int upperLimit = 300;
        int expected = 8;

        int actual = service.calcSQR(lowLimit, upperLimit);

        assertEquals(expected, actual);
    }

    @Test
    public void calcSQRWhenLimitsNegative () {
        SQRService service = new SQRService();

        int lowLimit = -100;
        int upperLimit = -300;
        int expected = 0;

        int actual = service.calcSQR(lowLimit, upperLimit);

        assertEquals(expected, actual);
    }

    @Test
    public void calcSQRWhenLimitsEqual0 () {
        SQRService service = new SQRService();

        int lowLimit = 0;
        int upperLimit = 0;
        int expected = 0;

        int actual = service.calcSQR(lowLimit, upperLimit);

        assertEquals(expected, actual);
    }
    @Test
    public void calcSQRWhenLowLimitNegativeUpperlimitPositive () {
        SQRService service = new SQRService();

        int lowLimit = -100;
        int upperLimit = 1000;
        int expected = 22;

        int actual = service.calcSQR(lowLimit, upperLimit);

        assertEquals(expected, actual);
    }
}
