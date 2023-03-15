package ru.netology.hw51.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalendarServiceTest {

    @Test
    public void testA() {
        CalendarService service = new CalendarService();

        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testB() {
        CalendarService service = new CalendarService();

        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}
