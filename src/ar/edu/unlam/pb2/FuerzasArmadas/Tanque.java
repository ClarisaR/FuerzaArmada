package ar.edu.unlam.pb2.FuerzasArmadas;

public class Tanque extends Vehiculo implements Terrestre {
	private Double velocidad;
	
	public Tanque(Integer codigo, String tipo) {
		super(codigo, tipo);
		this.velocidad = 0.0;
	}

	@Override
	public double getVelocidad() {
		return velocidad;
	}

}

