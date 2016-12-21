package pl.sylwek.spaceattack;

import pl.sylwek.spaceattack.entities.AbstractEnemy;
import pl.sylwek.spaceattack.entities.Alien;
import pl.sylwek.spaceattack.entities.FlyingThing;

public class GameObjectFactory {


	public AbstractEnemy getOrderedEnemyType(EnemyType type) {
		if(type==null){
			
			return null;
		}
		if(type.equals(EnemyType.ALIEN)){
			
			return new Alien();
			
		}
		
		if(type.equals(EnemyType.FLYING_THING)){
			
			return new FlyingThing();
		}
		
		return null;
			
	}
}
