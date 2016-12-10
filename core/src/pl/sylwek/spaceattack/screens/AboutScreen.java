package pl.sylwek.spaceattack.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import pl.sylwek.spaceattack.SpaceAttack;
import pl.sylwek.spaceattack.ui.BackButton;
import pl.sylwek.spaceattack.ui.IClickCallBack;

public class AboutScreen extends AbstractScreen{

	
	private BackButton backButton;
	
	private Image backGroundImage;
	public AboutScreen(SpaceAttack game) {
		super(game);
		init();
	}

	@Override
	protected void init() {
		initBackGroundImage();
		initBackButton();
		
	}
	
	@Override
	public void render(float delta) {
		
		super.render(delta);
		update();
		spriteBatch.begin();
		stage.draw();
		spriteBatch.end();
	}

	private void update() {
		stage.act();
		
	}

	

	private void initBackGroundImage() {
		backGroundImage = new Image(new Texture("img//author.png"));
		stage.addActor(backGroundImage);
	}
	
	private void initBackButton() {
		backButton= new BackButton(new IClickCallBack() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				game.setScreen(new MenuScreen(game));
			}
		});
		stage.addActor(backButton);
		
	}

}
