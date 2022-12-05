package ru.netology.sqr;

public class SQRService {
    int count = 0;

    public int calcsqrt(int lowbord, int highbord) {
        for (int i = 10; i < 100; i++) {
            if (i * i >= lowbord & i * i <= highbord) {
                count++;
            }
        }
        return count;
    }
}
