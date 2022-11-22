package ar.edu.unlam.pb2.FuerzasArmadas;

public class Portaviones extends Vehiculo implements Acuatico {

	private Double profundidad;
	
	public Portaviones(Integer codigo, String tipo) {
		super(codigo, tipo);
		this.profundidad = 0.0;
		
	}

	@Override
	public double getProfundidad() {
		return profundidad;
	}

}
