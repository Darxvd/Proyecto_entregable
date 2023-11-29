package edu.cibertec.proyecto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.cibertec.proyecto.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	Optional<Cliente> findById(int idcli);
	@Query(value="select * from tb_cliente where noap_cliente LIKE %:clientes%", nativeQuery = true)
	List<Cliente> findByCliente(@Param("clientes") String clientes);
}
