/**
 * 
 */
package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "cientificos")
public class Cientifico {

	@Id
	@Column(name = "DNI")
	private String dni;

	@Column(name = "NomApels")
	private String nomApels;

	@ManyToMany(mappedBy = "cientificos")
	@JsonIgnoreProperties("cientificos")
	private List<Proyecto> proyectos;

	/**
	 * 
	 */
	public Cientifico() {
	}

	/**
	 * @param dni
	 * @param nomApels
	 */
	public Cientifico(String dni, String nomApels) {
		this.dni = dni;
		this.nomApels = nomApels;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @return the nomApels
	 */
	public String getNomApels() {
		return nomApels;
	}

	/**
	 * @return the proyectos
	 */
	public List<Proyecto> getProyectos() {
		return proyectos;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @param nomApels the nomApels to set
	 */
	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	/**
	 * @param proyectos the proyectos to set
	 */
	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

}
