package pl.sylwek.spaceattack.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import pl.sylwek.spaceattack.SpaceAttack;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width=SpaceAttack.WINDOW_WIDTH;
		config.height=SpaceAttack.WINDOW_HEIGHT;
		config.title=SpaceAttack.GAME_NAME+" by "+SpaceAttack.AUTHOR;
		config.resizable=false;
		new LwjglApplication(new SpaceAttack(), config);
	}
}
