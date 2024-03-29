package ru.netology.javaqa5_1;

public class Main {
    public static void main(String[] args) {
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        CalcService service = new CalcService();
        int summ = service.getSumm(arr);
        int midSumm = service.getMidSumm(arr);
        int minSaleMonth = service.getMinSaleMonth(arr) + 1;
        int maxSaleMonth = service.getMaxSaleMonth(arr) + 1;
        int saleLessThanMidSumm = service.getСountSalesLessThanMidSumm(arr);
        int saleMoreThanMidSumm = service.getСountSalesMoreThanMidSumm(arr);
        System.out.println("Сумма всех продаж: " + summ);
        System.out.println("Средняя сумма продаж в месяц: " + midSumm);
        System.out.println("Месяц с минимальной продажей: " + minSaleMonth);
        System.out.println("Месяц с максимальной продажей: " + maxSaleMonth); //если значений несколько - выводится значение первого по счёту месяца с максимальной продажей.
        System.out.println("Месяцев с продажами меньше среднего: " + saleLessThanMidSumm);
        System.out.println("Месяцев с продажами выше среднего: " + saleMoreThanMidSumm);
    }
}