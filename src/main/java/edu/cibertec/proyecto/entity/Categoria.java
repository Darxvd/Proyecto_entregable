package edu.cibertec.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tb_categoria")
public class Categoria {
	@Id
	private int id_categoria;
	private String nom_categoria;

}
