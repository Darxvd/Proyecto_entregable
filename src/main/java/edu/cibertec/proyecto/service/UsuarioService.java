package edu.cibertec.proyecto.service;

import edu.cibertec.proyecto.entity.Usuario;

import java.util.Optional;

public interface UsuarioService {
    Optional<Usuario> login(String nomUsuario, String passUsuario);
}
