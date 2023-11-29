package edu.cibertec.proyecto.repository;

import edu.cibertec.proyecto.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByNomUsuarioAndPassUsuario(String nomUsuario,String passUsuario);
}
