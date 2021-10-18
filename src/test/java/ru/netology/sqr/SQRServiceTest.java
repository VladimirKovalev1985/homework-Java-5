package ru.netology.sqr;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void shouldPickNumbers() {
        SQRService service = new SQRService();

        int first = 100;
        int second = 200;
        int expected = 5;

        int counter = service.pickNumbers(first, second);

        assertEquals(expected, counter);

    }


    @org.junit.jupiter.api.Test
    void ShouldPickNumbersUnderBoard() {

        SQRService service = new SQRService();

        int first = 100;
        int second = 101;
        int expected = 1;
        int counter = service.pickNumbers(first, second);

        assertEquals(expected, counter);

    }

    @org.junit.jupiter.api.Test
    void ShouldPickNumbersOverBoard() {

        SQRService service = new SQRService();

        int first = 100;
        int second = 90;
        int expected = 0;
        int counter = service.pickNumbers(first, second);

        assertEquals(expected, counter);

    }
}