package edu.cibertec.proyecto.entity;

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
	private int id_producto;
    private String des_producto;
    private Double pre_producto;
    private int stk_producto;
    private int id_categoria;
    private int id_proveedor;
    
    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria objcategoria;
    
    @ManyToOne
    @JoinColumn(name = "id_proveedor", insertable = false, updatable = false)
    private Proveedor objProveedor;



}
