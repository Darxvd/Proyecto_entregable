package edu.cibertec.proyecto.entity;

import jakarta.persistence.Column;
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
	
	@Column(name="nom_categoria")
	private String nom_categoria;

}
