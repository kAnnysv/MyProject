package org.example.hw4;

public class AreaTriangle {


    public double someMethod (int a, int b, int c  ) throws MyException {
        double p = (a + b + c)/2;
        if((p - a) <= 0 || (p - b) <= 0 || (p - c) <= 0) throw new MyException("Не корректны стороны треугольника");
        double result = Math.sqrt(p * (p -a) * (p -b) * (p -c));
        return result;



    }



}
