package ru.netology.javaqa5_1;

public class CalcService {

    public long getSumm(long[] arr) {
        long summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ = summ + arr[i];
        }
        return summ;
    }

    public long getMidSumm(long[] arr) {
        long summ = getSumm(arr);
        long midSumm = summ / 12;
        return midSumm;
    }

    public int getMinSaleMonth(long[] arr) {
        int minSaleMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[minSaleMonth]) {
                minSaleMonth = i + 1; // +1 т.к. подсчёт ячеек в массиве идёт с 0, а хочу вести подсчёт месяцев с 1
            }
        }
        return minSaleMonth;
    }

    public int getMaxSaleMonth(long[] arr) {
        int maxSaleMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[maxSaleMonth]) {
                maxSaleMonth = i + 1; // +1 аналогично, из-за нумерации ячеек массивов.
            }
        }
        return maxSaleMonth;
    }

    public int getСountSalesLessThanMidSumm(long[] arr) {
        int countSalesLessThanMidSumm = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < getMidSumm(arr)) {
                countSalesLessThanMidSumm = countSalesLessThanMidSumm + 1;
            }
        }
        return countSalesLessThanMidSumm;
    }

    public int getСountSalesMoreThanMidSumm(long[] arr) {
        int countSalesMoreThanMidSumm = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > getMidSumm(arr)) {
                countSalesMoreThanMidSumm = countSalesMoreThanMidSumm + 1;
            }
        }
        return countSalesMoreThanMidSumm;
    }
}

