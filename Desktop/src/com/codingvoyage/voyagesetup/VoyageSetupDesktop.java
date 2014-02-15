package com.codingvoyage.voyagesetup;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/**
 * Project used to setup libgdx for CodingVoyage projects
 * @author Brian Yang
 */
public class VoyageSetupDesktop {

    public static void main(String[] args) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = "Water Droplets - CodingVoyage Test Project";
        cfg.useGL20 = true;
        cfg.width = 800;
        cfg.height = 480;
        new LwjglApplication(new VoyageSetup(), cfg);
    }
}
