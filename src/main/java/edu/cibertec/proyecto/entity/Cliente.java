package edu.cibertec.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tb_cliente")
public class Cliente {
	@Id
	private int id_cliente;
    private String noap_cliente;
    private String dni_cliente;
    private String tlf_cliente;

}
