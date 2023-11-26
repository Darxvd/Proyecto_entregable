package edu.cibertec.proyecto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.cibertec.proyecto.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{
	Optional<Producto> findById(int idprod);
}
