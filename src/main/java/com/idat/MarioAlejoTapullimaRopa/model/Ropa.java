package com.idat.MarioAlejoTapullimaRopa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "Estudiante")
@Entity
public class Ropa {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idRopa;
	private String tipoRopa;
	private String descripcion;
	
}
