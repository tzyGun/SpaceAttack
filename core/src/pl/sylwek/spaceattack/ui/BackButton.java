package pl.sylwek.spaceattack.ui;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import pl.sylwek.spaceattack.SpaceAttack;

public class BackButton extends Image{
	private static final int WIDTH=250;
	private static final int HEIGHT=70;
	public BackButton(final IClickCallBack callBack){
		super(new Texture("buttons//back.png"));
		init(callBack);
	}
	private void init(final IClickCallBack callBack) {
		this.setWidth(WIDTH);
		this.setHeight(HEIGHT);
		this.setX(SpaceAttack.WINDOW_WIDTH/2-this.getWidth()/2);
		this.setY(100);
		this.addListener(new ClickListener(){
			
			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				// TODO Auto-generated method stub
				System.out.println("clicked about");
				callBack.onClick();
				
				return super.touchDown(event, x, y, pointer, button);
			}
		});
	}
}
