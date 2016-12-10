package pl.sylwek.spaceattack.ui;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import pl.sylwek.spaceattack.SpaceAttack;

public class ExitButton extends Image {

	private static final int WIDTH=250;
	private static final int HEIGHT=70;
	
	 public ExitButton(final IClickCallBack callBack){
		 
		 	super(new Texture("buttons//exit.png"));
		 	init(callBack);
			
	 }

	private void init(final IClickCallBack callBack) {
		this.setWidth(WIDTH);
		this.setHeight(HEIGHT);
		this.setX(SpaceAttack.WINDOW_WIDTH/2-this.getWidth()/2);
		this.setY(30);
		
		this.addListener(new ClickListener(){
			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				// TODO Auto-generated method stub
				System.out.println("Exit Clicked");
				callBack.onClick();
				return super.touchDown(event, x, y, pointer, button);
			}
		});
	}
	
}
