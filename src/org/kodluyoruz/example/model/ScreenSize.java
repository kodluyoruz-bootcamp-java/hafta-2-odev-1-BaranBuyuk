package org.kodluyoruz.example.model;

import org.kodluyoruz.example.model.enums.ScreenSizeTypeEnum;

public class ScreenSize {

    private float size;
    private ScreenSizeTypeEnum screenSizeType;

    public ScreenSize(float size, ScreenSizeTypeEnum screenSizeType) {
        this.size = size;
        this.screenSizeType = screenSizeType;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public ScreenSizeTypeEnum getScreenSizeType() {
        return screenSizeType;
    }

    public void setScreenSizeType(ScreenSizeTypeEnum screenSizeType) {
        this.screenSizeType = screenSizeType;
    }

    @Override
    public String toString() {
        return "ScreenSize{" +
                "size=" + size +
                ", screenSizeType=" + screenSizeType +
                '}';
    }
}
