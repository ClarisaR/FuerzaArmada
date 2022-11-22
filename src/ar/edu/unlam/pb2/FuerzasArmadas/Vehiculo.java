package ar.edu.unlam.pb2.FuerzasArmadas;

import java.util.Objects;

public abstract class Vehiculo{
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	


	
	
}
