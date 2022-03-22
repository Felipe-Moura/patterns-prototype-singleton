package main.enemy;

/*
 * Prototipo que implementa a interface Enemy
 * */
public class Ghost implements Enemy{
	
	public int healthPoints;
	public int damage;
	
	public Ghost() {
		this.healthPoints = 5;
		this.damage = 3;
	}

	@Override
	public Enemy copy() {
		
		Ghost newGhost = null;
		
		try {
			newGhost = (Ghost) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return newGhost;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public String toString() {
		return "Booooooooo!";
	}

}
