package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "100,200,5",
            "900,1000,2",
            "100,10000,90"
    })
    public void testSQR(int low, int high, int expected) {
        SQRService service = new SQRService();
        int number = service.calcsqrt(low, high);
        Assertions.assertEquals(expected, number);
    }


}
