package ar.edu.unlam.pb2.FuerzasArmadas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FuerzaArmada {
	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;
	
	public FuerzaArmada() {
		convoy = new HashSet<Vehiculo>();
		batallas = new HashMap<String, Batalla>();
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		this.convoy.add(vehiculo);
	}

	public Integer getCapacidadDeDefensa() {
		return this.convoy.size();
	}

	public void crearBatalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		this.batallas.put(nombre, new Batalla(nombre, tipo, latitud, longitud));
	}

	public boolean enviarALaBatalla(String batalla, Integer codVehiculo) throws VehiculoInexistente, VehiculoIncompatible {
		if(batallas.get(batalla).agregarVehiculoALaBatalla(buscarVehiculo(codVehiculo))) {
			return true;
		}
		return false;
	}

	private Vehiculo buscarVehiculo(Integer codVehiculo) throws VehiculoInexistente {
		for(Vehiculo actual : convoy) {
			if(actual.getCodigo().equals(codVehiculo)) {
				return actual;
			}
		}
		throw new VehiculoInexistente();
	}

	public Batalla getBatalla(String nombre) {
		return batallas.get(nombre);
	}
}
