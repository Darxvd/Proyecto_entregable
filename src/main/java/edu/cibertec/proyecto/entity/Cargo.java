package edu.cibertec.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tb_cargo")
public class Cargo {
	@Id
	private int id_cargo;
	private String nom_cargo;

}
