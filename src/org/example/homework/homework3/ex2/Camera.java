package org.example.homework.homework3.ex2;

public abstract class Camera {

    private String nameCamera;
    private int zoom;
    private boolean flash;

    public String getNameCamera() {
        return nameCamera;
    }

    public void setNameCamera(String nameCamera) {
        this.nameCamera = nameCamera;
    }

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }

    public boolean isFlash() {
        return flash;
    }

    public void setFlash(boolean flash) {
        this.flash = flash;
    }
}
