package pl.sylwek.spaceattack.ui;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

import pl.sylwek.spaceattack.SpaceAttack;

public class ScoreLabel {

	
	private static final int POSITION_X=100;
	private static final int POSITION_Y=SpaceAttack.WINDOW_HEIGHT-100;
	private BitmapFont label;
	public ScoreLabel(){
		init();
	}
	private void init() {
		
			label = new BitmapFont();
			label.setColor(Color.WHITE);
			
		
	}
	
	public static int getPositionX() {
		return POSITION_X;
	}
	public static int getPositionY() {
		return POSITION_Y;
	}
	public BitmapFont getLabel() {
		return label;
	}
	
}
