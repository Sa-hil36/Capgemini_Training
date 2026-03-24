package org.example;

public class CalculatorMain {
    public static void main(String[] args) {
        ICalculator c = (i,j)->i+j;
        CalculatorService cService = new CalculatorService(c);
        System.out.println(cService.addService(5,10));
    }
}
