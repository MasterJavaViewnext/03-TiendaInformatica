package es.rodal.tienda;

public class Telefono extends Producto{
	private String operadora;

	public Telefono(int codigo, String modelo, double precio, int cantidad, String operadora) {
		super(codigo, modelo, precio, cantidad);
		this.operadora = operadora;
	}
	
}
