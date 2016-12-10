package pl.sylwek.spaceattack.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;

import pl.sylwek.spaceattack.SpaceAttack;

public class Player extends Rectangle{

	
	private Texture texture;
	
	private boolean readyToShot=true;
	
	public Player(){
		init();
		
	}
	private void init() {
		this.texture= new Texture("gameobjects//cannon.png");
		this.x=0;
		this.y=0;
		this.width=texture.getWidth();
		this.height=texture.getHeight();
		
	}
	
	public void move(){
		
			if (Gdx.input.isKeyPressed(Keys.A)) {
				System.out.println("A");
				this.x -= 500 * Gdx.graphics.getDeltaTime();
				if(this.x<=0){
					this.x=0;
				}
				
			}
			if (Gdx.input.isKeyPressed(Keys.D)) {
				System.out.println("D");
				this.x += 500 * Gdx.graphics.getDeltaTime();
				if(this.x>=SpaceAttack.WINDOW_WIDTH-this.width){
					this.x=SpaceAttack.WINDOW_WIDTH-this.width;
				}
				
			}
			if (Gdx.input.isKeyPressed(Keys.W)) {
				System.out.println("W");
				this.y += 500 * Gdx.graphics.getDeltaTime();
				if(this.y>=SpaceAttack.WINDOW_HEIGHT-this.height){
					this.y=SpaceAttack.WINDOW_HEIGHT-this.height;
				}
			}
			if (Gdx.input.isKeyPressed(Keys.S)) {
				System.out.println("S");
				this.y -= 500 * Gdx.graphics.getDeltaTime();
				if(this.y<=0){
					this.y=0;
				}
			}
			
		}
	
	public void shoot(Projectile projectile){
		if(readyToShot){
			
			if(Gdx.input.isKeyJustPressed(Keys.SPACE)){
				projectile.getShotSound().play();
				
				
				
				projectile.x=this.x+this.width/2-20;
				projectile.y=this.y+this.height/2+20;
				readyToShot=false;
				System.out.println(readyToShot);
				}
				
				
			}
			
			projectile.y+=700*Gdx.graphics.getDeltaTime();
			System.out.println(projectile.y);
			
			if(projectile.y>=SpaceAttack.WINDOW_HEIGHT){
				projectile.y=SpaceAttack.WINDOW_HEIGHT+50;
				readyToShot=true;
				
			}
			
		}
	
	public Texture getTexture() {
		return texture;
	}
	
	
	
	}


