package edu.cibertec.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.cibertec.proyecto.entity.Categoria;
import edu.cibertec.proyecto.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("http://localhost:4200/")
public class CategoriaController {
	
	@Autowired
	private CategoriaService servicioCategoria;
	
	@GetMapping("/listar")
	public List<Categoria> listarCategoria(){
		return servicioCategoria.listarCategoria();
	}

}
