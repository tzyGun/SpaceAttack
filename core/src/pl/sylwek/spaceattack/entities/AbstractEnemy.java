package pl.sylwek.spaceattack.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;

import pl.sylwek.spaceattack.SpaceAttack;

public abstract class AbstractEnemy extends Rectangle{
private Texture texture;
	
	private Sound destroySound;
	

	public void init(String sound, String image) {
		initEnemy(image);
		initEnemyDestroySound(sound);
		
	}

	private void initEnemyDestroySound(String sound) {
		destroySound = Gdx.audio.newSound(Gdx.files.internal("sounds//"+sound+".ogg"));
		
	}

	private void initEnemy(String image) {
		this.texture= new Texture("gameobjects//"+image+".png");
		
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
