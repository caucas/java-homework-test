package org.example.homework.homework3.ex2;

public class PhoneFactory {
    public void assemblingPhone(Samsung samsung) {
        samsung.setOsName("Android");
        samsung.setNameCamera("Samsung");
        samsung.setHeight(13);
        samsung.setLength(12);
        samsung.setWidth(10);
        samsung.setZoom(20);
        samsung.setNameMother("j-108");
        samsung.setFlash(false);
    }

    public void assemblingPhone(Iphone iphone) {
        iphone.setOsName("Ios");
        iphone.setNameCamera("Samsung");
        iphone.setHeight(13);
        iphone.setLength(12);
        iphone.setWidth(15);
        iphone.setZoom(20);
        iphone.setNameMother("7uik");
        iphone.setFlash(true);

    }
}
