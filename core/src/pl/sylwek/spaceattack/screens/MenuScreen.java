package pl.sylwek.spaceattack.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import pl.sylwek.spaceattack.SpaceAttack;
import pl.sylwek.spaceattack.ui.AboutButton;
import pl.sylwek.spaceattack.ui.ExitButton;
import pl.sylwek.spaceattack.ui.IClickCallBack;
import pl.sylwek.spaceattack.ui.StartButton;

public class MenuScreen extends AbstractScreen {

	private AboutButton aboutButton;
	private ExitButton exitButton;
	private StartButton startButton;

	
	
	private Image menuScreen;
	public MenuScreen(SpaceAttack game) {
		super(game);
		init();
			
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




	@Override
	protected void init() {
		initMenuBackGroundImage();
		initStartButton();
		initAboutButton();
		initExitButton();
	}
	
	private void initStartButton() {
		startButton= new StartButton(new IClickCallBack() {
			
			@Override
			public void onClick() {
				game.setScreen(new GamePlayScreen(game));
				
			}
		});
		stage.addActor(startButton);
	}
	



	private void initAboutButton() {
		aboutButton =new AboutButton(new IClickCallBack() {
			
			@Override
			public void onClick() {
				game.setScreen(new AboutScreen(game));
				
			}
		});
		stage.addActor(aboutButton);
		
	}




	private void initExitButton() {
		exitButton =new ExitButton(new IClickCallBack() {
			
			@Override
			public void onClick() {
				Gdx.app.exit();
				
				
			}
		});
		stage.addActor(exitButton);
		
	}
	
	private void initMenuBackGroundImage() {
		menuScreen= new Image(new Texture("img//spacehires.jpg"));
		stage.addActor(menuScreen);
	}




	

}
