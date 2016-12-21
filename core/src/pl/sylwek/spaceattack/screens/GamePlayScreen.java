package pl.sylwek.spaceattack.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;

import pl.sylwek.spaceattack.EnemyType;
import pl.sylwek.spaceattack.GameObjectFactory;
import pl.sylwek.spaceattack.SpaceAttack;
import pl.sylwek.spaceattack.entities.AbstractEnemy;
import pl.sylwek.spaceattack.entities.Alien;
import pl.sylwek.spaceattack.entities.FlyingShit;
import pl.sylwek.spaceattack.entities.Player;
import pl.sylwek.spaceattack.entities.Projectile;
import pl.sylwek.spaceattack.ui.ScoreLabel;

public class GamePlayScreen extends AbstractScreen{

	private Texture backGroundImage;
	private Player player;
	private AbstractEnemy enemy;
	private GameObjectFactory gameObjectFactory;
	private Projectile projectile;
	private ScoreLabel scoreLabel;
	private Music gameMusic;
	
	
	public GamePlayScreen(SpaceAttack game) {
		super(game);
		init();
		gameMusic.play();
		gameMusic.setVolume(0.1f);
		
		
	}

	@Override
	protected void init() {
		gameObjectFactory= new GameObjectFactory();
		initBackGroundImage();
		initPlayer();
		initEnemy();
		initProjectile();
		initScoreLabel();
		initBackGroundMusic();
	}
	

	

	private void initScoreLabel() {
		scoreLabel= new ScoreLabel();
		
	}

	private void initBackGroundImage() {
		backGroundImage= new Texture("img//spacehires.jpg");
	}
	
	private void initPlayer() {
		player= new Player();
		
		
	}
	
	private void initProjectile() {
		projectile = new Projectile();
		
	}

	private void initEnemy() {

		if(MathUtils.randomBoolean()==true){
		enemy = gameObjectFactory.getOrderedEnemyType(EnemyType.ALIEN);
		}else{
		enemy = gameObjectFactory.getOrderedEnemyType(EnemyType.FLYING_SHIT);
		}

	}


	@Override
	public void render(float delta) {
		
		super.render(delta);
		update();
		spriteBatch.begin();
		spriteBatch.draw(backGroundImage, 0,0);
		spriteBatch.draw(player.getTexture(),player.x,player.y);
		spriteBatch.draw(projectile.getTexture(),projectile.x,projectile.y);
		spriteBatch.draw(enemy.getTexture(),enemy.x,enemy.y);
		scoreLabel.getLabel().draw(spriteBatch,"Trafienia : "+
		Projectile.getCounter(),scoreLabel.getPositionX(),scoreLabel.getPositionY());
		spriteBatch.end();
	}
	
	private void initBackGroundMusic() {
		gameMusic = Gdx.audio.newMusic(Gdx.files.internal("sounds//codex.mp3"));
		
	}

	private void update() {
		if(!gameMusic.isPlaying()){
			gameMusic.play();
		}
		
		player.move();
		player.shoot(projectile);
		if(projectile.collision(enemy)){
			if(MathUtils.randomBoolean()==true){
				enemy = gameObjectFactory.getOrderedEnemyType(EnemyType.ALIEN);
				}else{
				enemy = gameObjectFactory.getOrderedEnemyType(EnemyType.FLYING_SHIT);
				}
		};
	}

}
