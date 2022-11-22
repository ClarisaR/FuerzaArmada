package ar.edu.unlam.pb2.FuerzasArmadas;

public class Anfibio extends Vehiculo implements Acuatico, Terrestre {

	private Double profundidad;
	private Double velocidad;
	
	public Anfibio(Integer codigo, String tipo) {
		super(codigo, tipo);
		this.velocidad = 0.0;
		this.profundidad = 0.0;
	}

	@Override
	public double getVelocidad() {
		return this.velocidad;
	}

	@Override
	public double getProfundidad() {
		return this.profundidad;
	}

	

}
