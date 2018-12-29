package com.demo.lizejun.javamodule.reflect;

/**
 * @author lizejun
 **/
public class ReflectHolder {

    public String openValue;

    private String closeValue;

    private ReflectHolder() {}

    public ReflectHolder(String openValue, String closeValue) {
        this.openValue = openValue;
        this.closeValue = closeValue;
    }

    public void setOpenValue(String openValue) {
        this.openValue = openValue;
    }

    private void setCloseValue(String closeValue) {
        this.closeValue = closeValue;
    }

    @Override
    public String toString() {
        return "ReflectHolder{" +
                "openValue='" + openValue + '\'' +
                ", closeValue='" + closeValue + '\'' +
                '}';
    }
}
