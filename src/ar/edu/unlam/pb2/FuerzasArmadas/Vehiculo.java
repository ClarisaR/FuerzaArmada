package ar.edu.unlam.pb2.FuerzasArmadas;

import java.util.Objects;

public abstract class Vehiculo implements Comparable<Vehiculo> {
	protected String tipo;
	protected Integer codigo;

	
	public Vehiculo(Integer codigo, String tipo) {
		this.codigo = codigo;
		this.tipo = tipo;
	}
	
	public Integer getCodigo(){
		return this.codigo;
	}

	@Override
	public int compareTo(Vehiculo vehiculo) {
		int resultadoComparacion = this.codigo.compareTo(vehiculo.getCodigo());
		return resultadoComparacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
	
}
