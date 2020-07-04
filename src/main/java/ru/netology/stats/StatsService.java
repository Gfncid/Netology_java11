package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] array) {
        int result = 0;
        for (int element : array) {
            result += element;
        }
        return result;
    }

    public int calculateAverage(int[] array) {
        int sum = calculateSum(array);
        return sum / array.length;
    }

    public int calculateMaxSellMonth(int[] array) {
        int max = 0;
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        int result = 0;
        int month = 0;
        for (int element : array) {
            month++;
            if (element == max) {
                result = month;
            }
        }
        return result;
    }

    public int calculateMinSellMonth(int[] array) {
        int min = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        int result = 0;
        int month = 0;
        for (int element : array) {
            month++;
            if (element == min) {
                result = month;
            }
        }
        return result;
    }

    public int calculateMonthBelowAverage(int[] array) {
        int monthCount = 0;
        int average = calculateAverage(array);
        for (int element : array) {
            if (element < average) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int calculateMonthAboveAverage(int[] array) {
        int monthCount = 0;
        int average = calculateAverage(array);
        for (int element : array) {
            if (element > average) {
                monthCount++;
            }
        }
        return monthCount;
    }
}
