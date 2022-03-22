package main.enemy;

/*
 * Prototipo que implementa a interface Enemy
 * */
public class Zombie implements Enemy{

	public int healthPoints;
	public int damage;
	
	public Zombie() {
		this.healthPoints = 10;
		this.damage = 1;
	}
	
	@Override
	public Enemy copy() {
		
		Zombie newZombie = null;
		
		try {
			newZombie = (Zombie) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return newZombie;
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
		return "Ceeeeeeeerebro!";
	}

}
