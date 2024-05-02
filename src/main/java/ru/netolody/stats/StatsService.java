package ru.netolody.stats;

public class StatsService {
    public long sum(long[] sales) {
        long allSales = 0;
        for (int i = 0; i < sales.length; i++) {
            allSales = allSales + sales[1];
        }
        return allSales;
    }

    public long average(long[] sales) {
        long allSales = 0;
        for (int i = 0; i < sales.length; i++) {
            allSales = allSales + sales[1];
        }
        long averageSales = allSales / 12;
        return averageSales;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int belowAverage(long[] sales) {
        int count = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                count ++;
            }
        }
        return count;
    }

    public int aboveAverage(long[] sales) {
        int count = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                count ++;
            }
        }
        return count;
    }
}
