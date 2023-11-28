package edu.cibertec.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.cibertec.proyecto.entity.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer>{
	Proveedor findById(int idprov);
}
