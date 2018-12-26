package com.demo.lizejun.javamodule.inner;

/**
 * @author lizejun
 **/
public class InnerClose {

    public void doClose(final int a) {
        InnerInterface inner = new InnerInterface() {

            @Override
            public void call() {
                System.out.println("a=" + a);
            }
        };
        inner.call();
    }
}
