package ar.edu.unlam.pb2.FuerzasArmadas;

public class Destructor extends Vehiculo implements Acuatico {
	
	private Double profundidad;
	
	public Destructor(Integer codigo, String tipo) {
		super(codigo, tipo);
		this.profundidad = 0.0;
	}

	@Override
	public double getProfundidad() {
		return this.profundidad;
	}

}
