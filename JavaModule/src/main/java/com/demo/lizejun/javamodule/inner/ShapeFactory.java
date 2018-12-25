package com.demo.lizejun.javamodule.inner;

import java.util.HashMap;

/**
 * @author lizejun
 **/
public abstract class ShapeFactory {

    private static HashMap<String, ShapeFactory> factories = new HashMap();

    public static void addFactory(String id, ShapeFactory factory) {
        factories.put(id, factory);
    }

    public static Shape createShape(String id) {
        if (!factories.containsKey(id)) {
            try {
                Class.forName(id);
            } catch (Exception e) {}
        }
        return factories.get(id).create();
    }

    protected abstract Shape create();

}
