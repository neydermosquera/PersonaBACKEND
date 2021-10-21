package com.spa.persona.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;


@Entity
@Table(name = "persona")

public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nombre;
	private String apellido;
	private int edad;
	
	@ManyToOne 
	@JoinColumn (name = "id_departamento")
	private Departamento departamento;
	@ManyToOne 
	@JoinColumn (name = "id_ciudad")
	private Ciudad ciudad;
	

	
//Constructor
	public Persona(String nombre, String apellido, int edad, Departamento departamento, Ciudad ciudad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.departamento = departamento;
		this.ciudad = ciudad;
	}
	
	//ConstructorVacio
	public Persona() {

	}
	
	
//Getter y Setter:
	
	public Long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public Departamento getCiudad() {
		return departamento;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	

	

}
