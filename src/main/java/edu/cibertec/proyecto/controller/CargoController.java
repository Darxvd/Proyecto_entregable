package edu.cibertec.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.cibertec.proyecto.entity.Cargo;
import edu.cibertec.proyecto.service.CargoService;

@RestController
@RequestMapping("/cargo")
public class CargoController {
	
	@Autowired
	private CargoService servicioCargo;
	
	@GetMapping("/listar")
	public List<Cargo> listarCargos(){
		return servicioCargo.listarCargo();
	}

}
