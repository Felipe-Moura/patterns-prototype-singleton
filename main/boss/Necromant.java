package main.boss;

import java.util.Random;

import main.enemy.Enemy;
import main.enemy.Ghost;
import main.enemy.Zombie;

/*
 * Implementa��o do padr�o Singleton
 * */
public class Necromant {
	
	private static Necromant bossNecromant = null;
	private Enemy[] army = new Enemy[10];
	
	private Necromant() {}
	
	/*
	 * Fun��o que garante a exist�ncia de apenas uma instancia do objeto
	 * */
	public static Necromant getInstance() {
		if(bossNecromant == null) {
			bossNecromant = new Necromant();
		}
		
		return bossNecromant;
	}
	
	/*
	 * Quando chamada essa fun��o cria e retorna um array de clones
	 * */
	public void raiseArmy () {
		
		Random aux = new Random();
		Enemy minion = null;
		
		if(aux.nextInt(100) % 2 == 0) {
			minion = new Zombie();
		}
		else {
			minion = new Ghost();
		}
		
		for(int i = 0; i < 10; i++) {
			this.army[i] = minion.copy();
		}
		
		
	}

	public Enemy[] getArmy() {
		return army;
	}

}
