package edu.cibertec.proyecto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tb_cliente")
public class Cliente {
	@Id
	private int id_cliente;
	
	@Column(name = "noap_cliente")
    private String noap_cliente;

    @Column(name = "edad_cliente")
    private int edad_cliente;

    @Column(name = "dni_cliente")
    private String dni_cliente;

    @Column(name = "dir_cliente")
    private String dir_cliente;

    @Column(name = "tlf_cliente")
    private String tlf_cliente;
    
    @ManyToOne
    @JoinColumn(name = "id_sexo")
    private Sexo objSexo;

}
