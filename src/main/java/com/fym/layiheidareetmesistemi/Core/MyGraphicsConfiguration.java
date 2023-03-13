package com.fym.layiheidareetmesistemi.Core;

import org.springframework.stereotype.Component;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.ColorModel;

@Component
public class MyGraphicsConfiguration extends GraphicsConfiguration {

    private final GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice(); // get the default screen device

    @Override
    public GraphicsDevice getDevice() {
        return null;
    }

    @Override
    public ColorModel getColorModel() {
        return null;
    }

    @Override
    public ColorModel getColorModel(int transparency) {
        return null;
    }

    @Override
    public AffineTransform getDefaultTransform() {
        return null;
    }

    @Override
    public AffineTransform getNormalizingTransform() {
        return null;
    }

    @Override
    public Rectangle getBounds() {
        return null;
    }
}
