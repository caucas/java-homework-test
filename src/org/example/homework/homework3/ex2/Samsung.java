package org.example.homework.homework3.ex2;

public class Samsung extends Phone {
    protected String model;

    public Samsung(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Samsung{"
                + "model='" + model + '\''
                + ", os='" + getOsName() + '\''
                + ", motherboard= " + getNameMother() + "size:" + getWidth() + "x"
                + getHeight() + "x" + getLength() + '\''
                + ", camera='" + getNameCamera() + "(" + getZoom() + "x"
                + (isFlash() ? "вспышка есть" : " вспышки нет" + ")");
    }
}

