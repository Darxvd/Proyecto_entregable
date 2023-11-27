package edu.cibertec.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.cibertec.proyecto.entity.Proveedor;
import edu.cibertec.proyecto.service.ProveedorService;

@RestController
@RequestMapping("/proveedor")
@CrossOrigin("http://localhost:4200/")
public class ProveedorController {
	
	@Autowired
	private ProveedorService servicioProveedor;
	
	@GetMapping("/listar")
	public List<Proveedor> listarProveedor(){
		return servicioProveedor.listarProveedor();
	}

}
