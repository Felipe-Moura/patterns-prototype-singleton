package main.enemy;

/*
 * Implementa��o do padr�o Prototype
 * 
 * interface base de todos os prototipos que garante a exist�ncia da fun��o copy
 * */
public interface Enemy extends Cloneable{
	
	public Enemy copy();

}
