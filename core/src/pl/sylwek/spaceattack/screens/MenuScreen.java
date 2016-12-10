package pl.sylwek.spaceattack.screens;

import com.badlogic.gdx.graphics.Texture;

import pl.sylwek.spaceattack.SpaceAttack;

public class MenuScreen extends AbstractScreen {

	
	private Texture menuScreen;
	public MenuScreen(SpaceAttack game) {
		super(game);
		
	}

	
	
	@Override
	public void render(float delta) {
		
		super.render(delta);
		
		spriteBatch.begin();
		spriteBatch.draw(menuScreen,0,0);
		spriteBatch.end();
	}

	@Override
	protected void init() {
		menuScreen= new Texture("img//spacehires.jpg");
		
	}

}
