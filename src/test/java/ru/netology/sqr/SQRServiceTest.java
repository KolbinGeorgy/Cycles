package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    void countSquaresUnderRange() {
        SQRService service = new SQRService();
        int expected = 90;
        int actual = service.countSquares(100, 9801);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void countSquaresAboveBoundaryRange() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.countSquares(9802, 12345);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void countSquaresBelowBoundaryRange() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.countSquares(64, 99);
        Assertions.assertEquals(expected, actual);
    }

}