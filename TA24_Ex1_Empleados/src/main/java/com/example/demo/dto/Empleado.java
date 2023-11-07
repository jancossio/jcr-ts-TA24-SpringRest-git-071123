package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Empleado")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="nomApel")
	private String nomApel;
	private ClasesTrabajo trabajo;
	private int salario;
	
	public enum ClasesTrabajo{
		TeamMember,
		ProjectManager,
		FunctionalManager
	}
	
	public Empleado() {

	}
	
	public Empleado(int id, String nomApel, ClasesTrabajo trabajo) {
		super();
		this.id = id;
		this.nomApel = nomApel;
		this.trabajo = trabajo;
		this.salario = determinarSalario(trabajo);
	}
	
	public int determinarSalario(ClasesTrabajo trabajo) {
		
		int salario = 0;
		
		switch(trabajo)
		{
			case TeamMember:
			{
				salario = 1000;
			break;
			}
			case ProjectManager:
			{
				salario = 1400;
			break;
			}
			case FunctionalManager:
			{
				salario = 2100;
			break;
			}
		}
		return salario;
	}
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomApel() {
		return nomApel;
	}

	public void setNomApel(String nombre) {
		this.nomApel = nombre;
	}

	public ClasesTrabajo getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(ClasesTrabajo trabajo) {
		this.trabajo = trabajo;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nomApel=" + nomApel + ", trabajo=" + trabajo + ", salario=" + salario + "]";
	}


}
