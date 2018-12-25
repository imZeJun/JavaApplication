package com.demo.lizejun.javamodule.inner;

/**
 * @author lizejun
 **/
public class Factory {

    public void doWork(InnerWorker worker) {
        try {
            worker.work();
        } catch (Exception exception) {
            System.out.println("exception!");
        } finally {
            System.out.println("finally!");
        }
    }
}
