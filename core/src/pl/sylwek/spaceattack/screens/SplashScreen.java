package pl.sylwek.spaceattack.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;

import pl.sylwek.spaceattack.SpaceAttack;

public class SplashScreen extends AbstractScreen{

	
	private Texture splashImage;
	public SplashScreen(final SpaceAttack game) {
		super(game);
		init();
		Timer.schedule(new Task(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				game.setScreen(new MenuScreen(game));
			}
			
		}, 1);
	}
	@Override
	public void render(float delta) {
		
		super.render(delta);
		
		spriteBatch.begin();
		spriteBatch.draw(splashImage,0,0);
		spriteBatch.end();
	}

	@Override
	protected void init() {
		splashImage= new Texture("img//spaceSplash.png");
		
	}

}
