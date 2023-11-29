package edu.cibertec.proyecto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.cibertec.proyecto.entity.Empleado;
import edu.cibertec.proyecto.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{
	Optional<Producto> findById(int idprod);
	
	@Query(value="select * from tb_producto where id_categoria = %:id%", nativeQuery = true)
	List<Producto> findByCategoria(@Param("id") int id);
}
