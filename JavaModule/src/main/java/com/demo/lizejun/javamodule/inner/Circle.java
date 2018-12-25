package com.demo.lizejun.javamodule.inner;

/**
 * @author lizejun
 **/
public class Circle implements Shape {

    public static final String ID = Circle.class.getSimpleName();

    static {
        ShapeFactory.addFactory(ID, new Factory());
    }

    private static class Factory extends ShapeFactory {

        @Override
        protected Shape create() {
            return new Circle();
        }
    }

    @Override
    public void draw() {
        System.out.println("Circle Draw");
    }
}
