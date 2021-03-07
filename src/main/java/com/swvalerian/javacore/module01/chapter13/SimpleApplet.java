package com.swvalerian.javacore.module01.chapter13;

import java.awt.*;
import java.applet.*;

public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Привет, друг!", 30, 30);
    }
}
