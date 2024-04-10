package es.rodal.tienda;

public class Ordenador extends Producto {
	private int memoria;
	private int discoDuro;
	
	public Ordenador(int codigo, String modelo, double precio, int cantidad, int memoria, int discoDuro) {
		super(codigo, modelo, precio, cantidad);
		this.memoria = memoria;
		this.discoDuro = discoDuro;
	}
	
}
