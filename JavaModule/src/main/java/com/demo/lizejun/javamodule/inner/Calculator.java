package com.demo.lizejun.javamodule.inner;

/**
 * @author lizejun
 **/
public class Calculator extends PlusCalculator {

    class MultiCalculatorImpl extends MultiCalculator {

        @Override
        public int multi(int a, int b) {
            return super.multi(a, b);
        }
    }

    public int multi(int a, int b) {
        return new MultiCalculatorImpl().multi(a, b);
    }
}
