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
import lombok.Data;

/**
 * 
 */
@Entity
@Table(name = "proyectos")
public @Data class Proyecto {

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
}
