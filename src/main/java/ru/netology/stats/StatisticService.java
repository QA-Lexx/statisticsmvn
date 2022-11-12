package ru.netology.stats;

public class StatisticService {

    public long amountSales(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long averageSales(long[] sales) {
        long result = amountSales(sales);
        return result / sales.length;
    }

    public int peakSales(long[] sales) {
        int peakMonth = 0;
        long maxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[peakMonth]) {
                peakMonth = i;
            }
        }
        return peakMonth + 1;
    }

    public int bottomSales(long[] sales) {
        int bottomMonth = 0;
        long minSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[bottomMonth]) {
                bottomMonth = i;
            }
        }
        return bottomMonth + 1;
    }

    public int lowAverage(long[] sales) {
        int counter = 0;
        long averageSale = averageSales(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int highAverage(long[] sales) {
        int counter = 0;
        long averageSale = averageSales(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}
