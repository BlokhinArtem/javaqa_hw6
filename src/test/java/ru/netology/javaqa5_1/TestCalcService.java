package ru.netology.javaqa5_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalcService {
    @Test
    public void shouldFindSumm() {
        CalcService service = new CalcService();
        long[] summ = {8, 15, 13};
        int expected = 36;
        long actual = service.getSumm(summ);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMidSumm() {
        CalcService service = new CalcService();
        long[] midSumm = {40, 60, 20};
        long expected = 10;
        long actual = service.getMidSumm(midSumm);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinSaleMonth() {
        CalcService service = new CalcService();
        long[] minSale = {8, 15, 13, 8};
        int expected = 4;
        int actual = service.getMinSaleMonth(minSale);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxSaleMonth() {
        CalcService service = new CalcService();
        long[] maxSale = {8, 15, 13, 15};
        int expected = 4;
        int actual = service.getMaxSaleMonth(maxSale) ;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getCountMonthLessThanMidSumm() {
        CalcService service = new CalcService();
        long[] countLess = {140, 20, 10, 10, 60};
        int expected = 2;
        int actual = service.getСountSalesLessThanMidSumm(countLess);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getCountMoreThanMidSumm() {
        CalcService service = new CalcService();
        long[] countMore = {140, 20, 10, 10, 60};
        int expected = 2;
        int actual = service.getСountSalesMoreThanMidSumm(countMore);
        Assertions.assertEquals(expected, actual);
    }
}
