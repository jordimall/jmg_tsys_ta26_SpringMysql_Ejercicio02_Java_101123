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
import lombok.Data;

/**
 * 
 */
@Entity
@Table(name = "cientificos")
public @Data class Cientifico {

	@Id
	@Column(name = "DNI")
	private String dni;

	@Column(name = "NomApels")
	private String nomApels;

	@ManyToMany(mappedBy = "cientificos")
	@JsonIgnoreProperties("cientificos")
	private List<Proyecto> proyectos;

}
