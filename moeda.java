package Empresa;

public abstract class moeda {//classe mãe das moedas são convertidas
	
	protected double value;
	
	public abstract void info();
	public abstract double converter();
	
}
