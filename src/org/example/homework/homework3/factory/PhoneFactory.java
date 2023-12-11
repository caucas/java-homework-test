package org.example.homework.homework3.factory;

public class PhoneFactory {
    protected String factory;

    public void assemblingSamsung(Samsung model, String os, Motherboard motherboard, String camera) {
        System.out.printf("%s ос:%s материнка:%s камера: %s", model, os, motherboard, camera);
    }

    public void assemblingSamsung(Iphone model, String os, Motherboard motherboard, String camera) {

    }
}
