package org.example.homework.homework3.ex2;

public class Iphone extends Phone  {
    protected int model;

    public Iphone(int model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Iphone{"
                + "model='" + model + '\''
                + ", os='" + getOsName() + '\''
                + ", motherboard= " + getNameMother() + "size:" + getWidth() + "x"
                + getHeight() + "x" + getLength() + '\''
                + ", camera='" + getNameCamera() + "(" + getZoom() + "x "
                + (isFlash() ? "вспышка есть" : "вспышки нет") + ")";
    }
}

