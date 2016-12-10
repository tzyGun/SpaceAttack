package pl.sylwek.spaceattack.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;

import pl.sylwek.spaceattack.SpaceAttack;

public class Enemy extends Rectangle{

	private Texture texture;
	
	private Sound destroySound;
	
	public Enemy(){
		init();
	}

	private void init() {
		initEnemy();
		initEnemyDestroySound();
		
	}

	private void initEnemyDestroySound() {
		destroySound = Gdx.audio.newSound(Gdx.files.internal("sounds//prt.ogg"));
		
	}

	private void initEnemy() {
		this.texture= new Texture("gameobjects//alien.png");
		
		this.x=SpaceAttack.WINDOW_WIDTH-this.width/2-
				MathUtils.random(0,SpaceAttack.WINDOW_WIDTH);
		this.y=SpaceAttack.WINDOW_HEIGHT-this.width/2-
				MathUtils.random(0,SpaceAttack.WINDOW_HEIGHT);
		this.width=texture.getWidth();
		this.height=texture.getHeight();
	}

	public Sound getDestroySound() {
		return destroySound;
		
	}
	
	public Texture getTexture(){
		return texture;
	}
	
	
	
}
