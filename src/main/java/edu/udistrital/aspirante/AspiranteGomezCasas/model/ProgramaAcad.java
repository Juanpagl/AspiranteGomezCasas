package edu.udistrital.aspirante.AspiranteGomezCasas.model;

import java.io.Serializable;
import java.util.Objects;

public class ProgramaAcad implements Serializable{


	
	private static final long serialVersionUID = -7638059647762308333L;
	
	private int id_pro;
	private String nombre_pro;
	private int creditos_pro;
	
	public ProgramaAcad() {
		
	}
	
	public ProgramaAcad(int id_pro, String nombre_pro, int creditos_pro) {
		this.id_pro = id_pro;
		this.nombre_pro = nombre_pro;
		this.creditos_pro = creditos_pro;
	}

	public int getId_pro() {
		return id_pro;
	}

	public void setId_pro(int id_pro) {
		this.id_pro = id_pro;
	}

	public String getNombre_pro() {
		return nombre_pro;
	}

	public void setNombre_pro(String nombre_pro) {
		this.nombre_pro = nombre_pro;
	}

	public int getCreditos_pro() {
		return creditos_pro;
	}

	public void setCreditos_pro(int creditos_pro) {
		this.creditos_pro = creditos_pro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(creditos_pro, id_pro, nombre_pro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProgramaAcad other = (ProgramaAcad) obj;
		return creditos_pro == other.creditos_pro && id_pro == other.id_pro
				&& Objects.equals(nombre_pro, other.nombre_pro);
	}

	@Override
	public String toString() {
		return "ProgramaAcad [id_pro=" + id_pro + ", nombre_pro=" + nombre_pro + ", creditos_pro=" + creditos_pro + "]";
	}
	
	
	

}
