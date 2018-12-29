package com.demo.lizejun.javamodule;

import com.demo.lizejun.javamodule.reflect.ReflectHolder;

import java.lang.reflect.Constructor;

/**
 * @author lizejun
 */
public class MainApp {

    public static void main(String[] args) {
        constructor();
    }

    private static void constructor() {
        //获取所有的构造函数。
        Constructor<?>[] constructors = ReflectHolder.class.getDeclaredConstructors();
        System.out.println("count=" + constructors.length);
        for (Constructor constructor : constructors) {
            System.out.print("[");
            //获取构造函数的参数类型。
            Class<?>[] clazzs = constructor.getParameterTypes();
            for (Class<?> clazz : clazzs) {
                System.out.print(" " + clazz.getName() + ",");
            }
            System.out.print("]\n");
        }
    }

}
