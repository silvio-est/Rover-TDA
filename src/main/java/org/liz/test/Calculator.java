package org.liz.test;

public class Calculator {
    public  double calculatedIMC(Double height, Double weight) throws InterruptedException {
        if (height == 0 || weight ==0)
            throw new IllegalArgumentException("Not zero");

        Thread.sleep(2000);

        return 10000 * (weight / (Math.pow(height, 2)));
    }
}
