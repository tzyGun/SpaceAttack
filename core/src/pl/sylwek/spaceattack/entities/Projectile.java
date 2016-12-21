package pl.sylwek.spaceattack.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;

import pl.sylwek.spaceattack.SpaceAttack;

public class Projectile extends Rectangle{

	private  static int counter=0;
	

	private Texture texture;
	
	private Sound shotSound;
	public Projectile (){
		init();
		
	}
	private void init() {
		initProjectile();
		initProjectileShotSound();
		
	}
	private void initProjectileShotSound() {
		shotSound = Gdx.audio.newSound(Gdx.files.internal("sounds//meh.ogg"));
		
	}
	private void initProjectile() {
		this.texture= new Texture("gameobjects//bullet.png");
		this.x=-50;
		this.y=-50;
		this.width=texture.getWidth();
		this.height=texture.getHeight();
	}
	
	public Sound getShotSound(){
		return shotSound;
	}
	
	public Texture getTexture(){
		return texture;
	}
	
	public boolean collision(AbstractEnemy enemy) {
		if (this.overlaps(enemy)) {
			counter++;
			enemy.getDestroySound().play();
			enemy.x=MathUtils.random(SpaceAttack.WINDOW_WIDTH-enemy.width/2);
			enemy.y=MathUtils.random(SpaceAttack.WINDOW_HEIGHT-enemy.height/2);
			return true;
		}
			return false;
		
		}
	
	public static int getCounter() {
		return counter;
	}
	
}
