package edu.cibertec.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.cibertec.proyecto.entity.Sexo;
import edu.cibertec.proyecto.service.SexoService;

@RestController
@RequestMapping("/sexo")
public class SexoController {
	
	@Autowired
	private SexoService servicioSexo;
	
	@GetMapping(value = {"","/"})
	public List<Sexo> listarSexo(){
		return servicioSexo.listarSexo();
	}
}
