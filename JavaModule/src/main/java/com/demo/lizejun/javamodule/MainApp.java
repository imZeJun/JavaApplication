package com.demo.lizejun.javamodule;

import com.demo.lizejun.javamodule.inner.Circle;
import com.demo.lizejun.javamodule.inner.Shape;
import com.demo.lizejun.javamodule.inner.ShapeFactory;


/**
 * @author lizejun
 */
public class MainApp {

    public static void main(String[] args) {
        Shape shape = ShapeFactory.createShape(Circle.ID);
        shape.draw();
    }
}
