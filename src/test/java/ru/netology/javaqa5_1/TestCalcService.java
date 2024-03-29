package ru.netology.javaqa5_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalcService {
    @Test
    public void shouldFindSumm() {
        CalcService service = new CalcService();
        int[] summ = {8, 15, 13};
        int expected = 36;
        int actual = service.getSumm(summ);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMidSumm() {
        CalcService service = new CalcService();
        int[] midSumm = {8, 15, 13};
        int expected = 12;
        int actual = service.getMidSumm(midSumm);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinSaleMonth() {
        CalcService service = new CalcService();
        int[] minSale = {8, 15, 13, 8};
        int expected = 4;
        int actual = service.getMinSaleMonth(minSale) + 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxSaleMonth() {
        CalcService service = new CalcService();
        int[] maxSale = {8, 15, 13, 15};
        int expected = 4;
        int actual = service.getMaxSaleMonth(maxSale) + 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getCountMonthLessThanMidSumm() {
        CalcService service = new CalcService();
        int[] countLess = {10, 20, 10, 20};
        int expected = 2;
        int actual = service.getСountSalesLessThanMidSumm(countLess);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getCountMoreThanMidSumm() {
        CalcService service = new CalcService();
        int[] countMore = {10, 20, 10, 20};
        int expected = 2;
        int actual = service.getСountSalesMoreThanMidSumm(countMore);
        Assertions.assertEquals(expected, actual);
    }
}
