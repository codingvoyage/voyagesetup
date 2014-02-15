package com.codingvoyage.voyagesetup;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

/**
 * Util class
 * @author Brian Yang
 *
 * Stores useful constants that can be used throughout all classes
 */
public final class Util {

    /** Global font - Roboto Light by Google */
    public static BitmapFont FONT =
      new BitmapFont(Gdx.files.internal("fonts/DroidSans.fnt"), Gdx.files.internal("fonts/DroidSans.tga"), false);
    static {
        FONT.setColor(1,1,1,1);
    }

}
