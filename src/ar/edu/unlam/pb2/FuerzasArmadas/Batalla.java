package ar.edu.unlam.pb2.FuerzasArmadas;

import java.util.HashSet;
import java.util.Set;

public class Batalla {
	private String nombre;
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	Set<Vehiculo> vehiculosEnLaBatalla;
	
	public Batalla(String nombre,  TipoDeBatalla tipo, Double latitud, Double longitud) {
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
		this.tipo = tipo;
		this.vehiculosEnLaBatalla =  new HashSet<Vehiculo>();
	}

	public Boolean agregarVehiculoALaBatalla(Vehiculo vehiculo) throws VehiculoIncompatible {
		switch(this.tipo) {
		case TERRESTRE:
			if(vehiculo instanceof Terrestre) {
				this.vehiculosEnLaBatalla.add(vehiculo);
				return true;
			}
			else {
				throw new VehiculoIncompatible("La batalla es en tierra");
			}
		case NAVAL:
			if(vehiculo instanceof Acuatico) {
				this.vehiculosEnLaBatalla.add(vehiculo);
				return true;
			}
			else {
				throw new VehiculoIncompatible("La batalla es en agua");
			}
		case AEREA:
			if(vehiculo instanceof Volador) {
				this.vehiculosEnLaBatalla.add(vehiculo);
				return true;
			}
			else {
				throw new VehiculoIncompatible("La batalla es en aire");
			}
		}
		return false;
	}

	public double getLatitud() {
		return this.latitud;
	}

	public double getLongitud() {
		return this.longitud;
	}
}
