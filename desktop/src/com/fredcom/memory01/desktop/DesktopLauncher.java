package com.fredcom.memory01.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.fredcom.memory01.Main;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new Main(), config);


		config.width = 800;
		config.height = 600;
		config.resizable = false;
		config.title = "RANDOM !!";
		config.vSyncEnabled = true;
		config.backgroundFPS = 60;




	}
}
