package edu.cibertec.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_empleado;
    private String nom_empleado;
    private String apl_empleado;
    private int edad_empleado;
    private String dni_empleado;
    private String dir_empleado;
    private int id_sexo;
    private int id_cargo;
    
    @ManyToOne
    @JoinColumn(name = "id_sexo", insertable = false, updatable = false)
    private Sexo objSexo;
        
    @ManyToOne
    @JoinColumn(name = "id_cargo", insertable = false, updatable = false)
    private Cargo objCargo;
    
    
    
}

