package edu.udistrital.aspirante.AspiranteGomezCasas.model;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("unused")
public abstract class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    
    protected String identificacion; 
    protected String nombres; 
    protected String apellidos; 
    protected String correo; 
    protected String telefono; 

    public Persona() {
    }

    public Persona(String identificacion, String nombres, String apellidos, String correo, String telefono) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

   
}