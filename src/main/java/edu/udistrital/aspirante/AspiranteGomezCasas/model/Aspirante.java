package edu.udistrital.aspirante.AspiranteGomezCasas.model;

import java.util.Date;
import java.util.Objects;

public class Aspirante extends Persona {

    private static final long serialVersionUID = 1L;
    
    private ProgramaAcad programa; 
    private Date fechaInscripcion; 

    public Aspirante() {
        super();
    }

    public Aspirante(String identificacion, String nombres, String apellidos, String correo, String telefono, ProgramaAcad programa, Date fechaInscripcion) {
        super(identificacion, nombres, apellidos, correo, telefono);
        this.programa = programa;
        this.fechaInscripcion = fechaInscripcion;
    }

    

    public ProgramaAcad getPrograma() {
		return programa;
	}

	public void setPrograma(ProgramaAcad programa) {
		this.programa = programa;
	}

	public Date getFechaInscripcion() {
		return fechaInscripcion;
	}

	public void setFechaInscripcion(Date fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}

	@Override
    public int hashCode() {
        return Objects.hash(identificacion); 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aspirante other = (Aspirante) obj;
        return Objects.equals(identificacion, other.identificacion);
    }

    @Override
    public String toString() {
        return "Aspirante [identificacion=" + identificacion + ", nombres=" + nombres + ", apellidos=" + apellidos + ", programa=" + (programa != null ? programa.getNombre_pro() : "N/A") + "]";
    }
}