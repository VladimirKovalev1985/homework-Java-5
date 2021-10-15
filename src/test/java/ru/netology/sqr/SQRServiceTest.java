package ru.netology.sqr;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void shouldSelection() {
        SQRService service = new SQRService();

        int first = 100;
        int second = 200;
        int expected = 5;

        int counter = service.selection(first, second);

        assertEquals(expected, counter);

    }
}