package com.laz.dpad.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.laz.dpad.DPadScratch;

public class DesktopLauncher {

    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "DPad Scratch";
        config.width = 800;
        config.height = 480;
        new LwjglApplication(new DPadScratch(), config);
    }
}
