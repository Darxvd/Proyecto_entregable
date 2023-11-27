package edu.cibertec.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tb_proveedor")
public class Proveedor {
	@Id
	private int id_proveedor;
	private String nom_proveedor;

}
