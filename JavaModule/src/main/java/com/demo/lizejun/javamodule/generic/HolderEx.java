package com.demo.lizejun.javamodule.generic;

/**
 * @author lizejun
 **/
public class HolderEx<T extends Parent> {

    private T value;

    public T getValue() {
        return value;
    }
}
