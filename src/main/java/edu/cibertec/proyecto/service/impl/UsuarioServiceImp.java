package edu.cibertec.proyecto.service.impl;

import edu.cibertec.proyecto.entity.Usuario;
import edu.cibertec.proyecto.repository.UsuarioRepository;
import edu.cibertec.proyecto.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UsuarioServiceImp implements UsuarioService{
    private final UsuarioRepository usuarioRepository;

    @Override
    public Optional<Usuario> login(String nomUsuario, String passUsuario) {
        return usuarioRepository.findByNomUsuarioAndPassUsuario(nomUsuario, passUsuario);
    }
}
