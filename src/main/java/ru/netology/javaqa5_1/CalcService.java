package ru.netology.javaqa5_1;

public class CalcService {

    public int getSumm(int[] arr) {
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ = summ + arr[i];
        }
        return summ;
    }

    public int getMidSumm(int[] arr) {
        int summ = 0;
        int midSumm;
        for (int i = 0; i < arr.length; i++) {
            summ = summ + arr[i];
        }
        midSumm = summ / arr.length;
        return midSumm;
    }

    public int getMinSaleMonth(int[] arr) {
        int minSaleMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[minSaleMonth]) {
                minSaleMonth = i + 1; // +1 т.к. подсчёт ячеек в массиве идёт с 0, а хочу вести подсчёт месяцев с 1
            }
        }
        return minSaleMonth;
    }

    public int getMaxSaleMonth(int[] arr) {
        int maxSaleMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[maxSaleMonth]) {
                maxSaleMonth = i + 1; // +1 аналогично, из-за нумерации ячеек массивов.
            }
        }
        return maxSaleMonth;
    }

    public int getСountSalesLessThanMidSumm(int[] arr) {
        int countSalesLessThanMidSumm = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < getMidSumm(arr)) {
                countSalesLessThanMidSumm = countSalesLessThanMidSumm + 1;
            }
        }
        return countSalesLessThanMidSumm;
    }

    public int getСountSalesMoreThanMidSumm(int[] arr) {
        int countSalesMoreThanMidSumm = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > getMidSumm(arr)) {
                countSalesMoreThanMidSumm = countSalesMoreThanMidSumm + 1;
            }
        }
        return countSalesMoreThanMidSumm;
    }
}

