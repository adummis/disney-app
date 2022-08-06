package com.alkemy.disney.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "personaje")
@Getter
@Setter

public class PersonajeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String imagen;
	private String nombre;
	private Long edad;
	private Double peso;
	private String historia;
	
	@ManyToMany(mappedBy = "personajes", cascade = CascadeType.ALL)
	private List<PeliculaEntity> peliculas = new ArrayList<>();
	
}
