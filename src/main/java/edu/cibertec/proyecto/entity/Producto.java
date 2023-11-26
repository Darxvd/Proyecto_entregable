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
@Table(name="tb_producto")
public class Producto {
	@Id
	private int id_prod;
	
	@Column(name="nom_prod")
	private String nom_prod;
	@Column(name="des_prod")
    private String des_prod;
	@Column(name="pre_prod")
    private Double pre_prod;
	@Column(name="fcr_prod")
    private String fcr_prod;
	@Column(name="fpv_prod")
    private String fpv_prod;
	@Column(name="cant_prod")
    private int cant_prod;
    
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria objcategoria;
    
    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private Proveedor objProveedor;



}
