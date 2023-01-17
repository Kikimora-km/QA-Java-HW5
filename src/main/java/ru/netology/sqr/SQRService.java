package ru.netology.sqr;

public class SQRService {
    public int calcSQR(int lowLimit, int upperLimit) {

        int number = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowLimit & i * i <= upperLimit) {
                number++;
            }
        }

        return number;

    }
}
