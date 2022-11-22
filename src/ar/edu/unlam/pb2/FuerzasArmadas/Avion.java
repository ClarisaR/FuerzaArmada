package ar.edu.unlam.pb2.FuerzasArmadas;

public class Avion extends Vehiculo implements Volador {

	private Double altura;
	
	public Avion(Integer codigo, String tipo) {
		super(codigo, tipo);
		this.altura = 0.0;
	}

	@Override
	public double getAltura() {
		return altura;
	}
	
	
}
