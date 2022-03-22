package main;

import main.boss.Necromant;
import main.enemy.Enemy;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Usar Prototype para gerar inimigos
		 * Usar Singleton para gerar um boss
		 * 
		 * */
		
		Necromant necromant1 = Necromant.getInstance();
		Necromant necromant2 = null;
		Enemy[] minions1 = null;
		Enemy[] minions2 = null;
		
		/*
		 * O necromant1 cria um exercito e salva na variavel minions1
		 * */
		necromant1.raiseArmy();
		minions1 = necromant1.getArmy();
		
		/*
		 * Demonstração do exercito do necromant1
		 * */
		System.out.println("O Necromante1 invocou seu exercito: \n");
		
		for(int i = 0; i < 10; i++) {
			System.out.println("O minion " + minions1[i].hashCode() + " diz " + minions1[i]);
		}
		
		/*
		 * "Criação" do necramente2,
		 * por ser um segleton, necromant1 e necromant2 teram o mesmo exercito, já que são o mesmo objeto
		 * */
		necromant2 = Necromant.getInstance();
		minions2 = necromant2.getArmy();
		
		System.out.println("\nO Necromante2 invocou seu exercito: \n");
		
		for(int i = 0; i < 10; i++) {
			System.out.println("O minion " + minions2[i].hashCode() + " diz " + minions2[i]);
		}

	}

}
