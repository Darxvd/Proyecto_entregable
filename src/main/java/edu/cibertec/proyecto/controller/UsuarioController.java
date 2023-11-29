package edu.cibertec.proyecto.controller;

import edu.cibertec.proyecto.entity.Usuario;
import edu.cibertec.proyecto.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuarios")
@AllArgsConstructor
public class UsuarioController {
    private final UsuarioService usuarioService;

    @PostMapping("login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario usuario){
        return ResponseEntity.of(usuarioService.login(usuario.getNomUsuario(), usuario.getPassUsuario()));
    }
}
