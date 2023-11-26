package edu.cibertec.proyecto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.cibertec.proyecto.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	Optional<Cliente> findById(int idcli);
}
