package com.demo.lizejun.javamodule.inner;

/**
 * @author lizejun
 **/
public class Outer extends BaseOuter {

    private class InnerImpl implements InnerInterface {

        @Override
        public void call() {
            //内部类可以无条件地访问。
            System.out.println("call inner");
        }

    }

    public InnerInterface getInnerInterface() {
        return new InnerImpl();
    }
}
