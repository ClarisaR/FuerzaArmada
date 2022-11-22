package ar.edu.unlam.pb2.FuerzasArmadas;

public class HidroAvion extends Vehiculo implements Volador, Acuatico {

	private Double profundidad;
	private Double altura;
	
	public HidroAvion(Integer codigo, String tipo) {
		super(codigo, tipo);
		this.profundidad = 0.0;
		this.altura = 0.0;
	}

	@Override
	public double getProfundidad() {
		return this.profundidad;
	}

	@Override
	public double getAltura() {
		return this.altura;
	}

}
