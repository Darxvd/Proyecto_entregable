package edu.cibertec.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.cibertec.proyecto.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, String>{

}
