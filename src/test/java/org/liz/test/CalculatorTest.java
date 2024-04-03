package org.liz.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {
    private Calculator calculator;

//    @BeforeAll
//    public void initAll(){
//
//    }

    @Before
    public void init(){
        calculator = new Calculator();
    }

    @Test
    public void testCalculatorIMCWhen70lbAnd185Cm() throws InterruptedException {

//        GIVEN
        Double height = 175.0;
        Double weight = 70.0;

//        WHEN
        double imc = calculator.calculatedIMC(height, weight);

//        THEN
        Assertions.assertAll(
                () -> Assert.assertEquals(22.86, imc, 0.01),
                () -> Assert.assertTrue(imc > 0)
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculatorErrorByZero() throws InterruptedException {
//
//        GIVEN
        Double height = 0.0;
        Double weight = 70.0;

//        WHEN
        double imc = calculator.calculatedIMC(height,weight);

//        THEN
        Assert.assertEquals(22.86, imc, 0.01);

    }
    @Test(timeout = 3000)
    public void testCalculatorStopTime() throws InterruptedException {
//
//        GIVEN
        Double height = 175.0;
        Double weight = 70.0;

//        WHEN
        double imc = calculator.calculatedIMC(height,weight);

//        THEN
        Assert.assertEquals(22.86, imc, 0.01);

    }


}