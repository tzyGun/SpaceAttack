package pl.sylwek.spaceattack;

import com.badlogic.gdx.Game;

import pl.sylwek.spaceattack.screens.SplashScreen;

public class SpaceAttack extends Game {

	public final static String GAME_NAME="Space Attack";
	public final static String AUTHOR="Sylwester Denko";
	public final static String AUTHOR_MAIL="sylwester.denko@gmail.com";
	public final static int WINDOW_WIDTH=1280;
	public final static int WINDOW_HEIGHT=720;
	
	protected boolean paused;
	
	@Override
	public void create() {
		this.setScreen(new SplashScreen(this));
		init();
	}

	private void init() {
		
		
	}
	
	public boolean isPaused() {
		return paused;
	}
	
	public void setPaused(boolean paused) {
		this.paused = paused;
	}
	
	
	
	
	
}
