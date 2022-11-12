package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticServiceTest {

    @Test
    public void amountSales() {
        StatisticService service = new StatisticService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.amountSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSales() {
        StatisticService service = new StatisticService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void peakSales() {
        StatisticService service = new StatisticService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.peakSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bottomSales() {
        StatisticService service = new StatisticService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;
        long actual = service.bottomSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowAverageSales() {
        StatisticService service = new StatisticService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.lowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void highAverageSales() {
        StatisticService service = new StatisticService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.highAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}