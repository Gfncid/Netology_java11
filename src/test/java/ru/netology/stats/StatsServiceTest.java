package ru.netology.stats;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    int[] array = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldReturnSum() {
        int expected = 180;
        int actual = service.calculateSum(array);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnAverage() {
        int expected = 15;
        int actual = service.calculateAverage(array);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthWithMaxSell() {
        int expected = 8;
        int actual = service.calculateMaxSellMonth(array);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthWithMinSell() {
        int expected = 9;
        int actual = service.calculateMinSellMonth(array);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthsBelowAverage() {
        int expected = 5;
        int actual = service.calculateMonthBelowAverage(array);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthsAboveAverage() {
        int expected = 5;
        int actual = service.calculateMonthAboveAverage(array);
        assertEquals(expected, actual);
    }
}
