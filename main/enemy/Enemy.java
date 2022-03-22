package main.enemy;

/*
 * Implementação do padrão Prototype
 * 
 * interface base de todos os prototipos que garante a existência da função copy
 * */
public interface Enemy extends Cloneable{
	
	public Enemy copy();

}
