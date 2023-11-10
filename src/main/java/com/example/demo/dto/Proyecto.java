/**
 * 
 */
package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "proyectos")
public class Proyecto {

	@Id
	@Column(name = "Id")
	private String id;

	@Column(name = "Nombre")
	private String nombre;

	@Column(name = "Horas")
	private int horas;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "asignados_A", joinColumns = { @JoinColumn(name = "Cientifico") }, inverseJoinColumns = {
			@JoinColumn(name = "Proyecto") })

	@JsonIgnoreProperties("proyectos")
	private List<Cientifico> cientificos = new ArrayList<>();

	/**
	 * 
	 */
	public Proyecto() {
	}

	/**
	 * @param id
	 * @param nombre
	 * @param horas
	 * @param cientificos
	 */
	public Proyecto(String id, String nombre, int horas, List<Cientifico> cientificos) {
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
		this.cientificos = cientificos;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the horas
	 */
	public int getHoras() {
		return horas;
	}

	/**
	 * @return the cientificos
	 */
	public List<Cientifico> getCientificos() {
		return cientificos;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param horas the horas to set
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}

	/**
	 * @param cientificos the cientificos to set
	 */
	public void setCientificos(List<Cientifico> cientificos) {
		this.cientificos = cientificos;
	}

}
