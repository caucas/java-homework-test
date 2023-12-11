package org.example.homework.homework3.factory;

public abstract class Phone extends PhoneFactory {
    @Override
    public void assemblingSamsung(Samsung model, String os, Motherboard motherboard, String camera) {
        super.assemblingSamsung(model, os, motherboard, camera);
    }

    @Override
    public void assemblingSamsung(Iphone model, String os, Motherboard motherboard, String camera) {
        super.assemblingSamsung(model, os, motherboard, camera);
    }
}
