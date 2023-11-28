package edu.cibertec.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import edu.cibertec.proyecto.entity.Proveedor;
import edu.cibertec.proyecto.service.ProveedorService;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController {
	
	@Autowired
	private ProveedorService servicioProveedor;
	
	@GetMapping("/listar")
	public List<Proveedor> listarProveedor(){
		return servicioProveedor.listarProveedor();
	}
	
	@PostMapping("/registrar")
	@ResponseBody
	public Proveedor registrar(@RequestBody Proveedor proveedor) {
		return servicioProveedor.registrar(proveedor);
	}
	
	@GetMapping("/obtener/{idpro}")
	public Proveedor obtenerProveedor(@PathVariable("idpro") int idpro) {
		return servicioProveedor.obtenerPro(idpro);
	}
	
	@PutMapping("/actualizar")
	@ResponseBody
	public Proveedor actualizar(@RequestBody Proveedor proveedor) {
	    Proveedor tmpProveedor = servicioProveedor.obtenerPro(proveedor.getId_proveedor());;
	    tmpProveedor.setNom_proveedor(proveedor.getNom_proveedor());
		return servicioProveedor.actualizar(tmpProveedor);
	}
}
