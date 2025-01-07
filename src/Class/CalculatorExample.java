package src.Class;

import org.w3c.dom.ls.LSOutput;

public class CalculatorExample {
    public static void main(String[] args) {

    Calculator myCal = new Calculator();

    double result1 = myCal.areaRectangle(10);

    double result2  = myCal.areaRectangle(10, 20);
        System.out.println(result1);
        System.out.println(result2);
    }
}
