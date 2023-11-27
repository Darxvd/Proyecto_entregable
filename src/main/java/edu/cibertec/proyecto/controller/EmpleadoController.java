package edu.cibertec.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.cibertec.proyecto.entity.Empleado;
import edu.cibertec.proyecto.service.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
	@Autowired
	private EmpleadoService servicioEmpleado;
	
	@GetMapping("/listar")
	public List<Empleado> listarEmpleado(){
		return servicioEmpleado.listarEmpleado();
	}
	
	@PostMapping("/registrar")
	@ResponseBody
	public Empleado registrar(@RequestBody Empleado empleado) {
		return servicioEmpleado.registrar(empleado);
	}
	
	@GetMapping("/obtener/{idemp}")
	public Empleado obtenerEmpleado(@PathVariable("idemp") int idemp) {
		return servicioEmpleado.obtenerEmp(idemp);
	}
	
	@PutMapping("/actualizar")
	@ResponseBody
	public Empleado actualizar(@RequestBody Empleado empleado) {
	    Empleado tmpEmpleado = servicioEmpleado.obtenerEmp(empleado.getId_empleado());;
		tmpEmpleado.setNom_empleado(empleado.getNom_empleado());
		tmpEmpleado.setApl_empleado(empleado.getApl_empleado());
		tmpEmpleado.setEdad_empleado(empleado.getEdad_empleado());
		tmpEmpleado.setId_sexo(empleado.getId_sexo());
		tmpEmpleado.setDni_empleado(empleado.getDni_empleado());
		tmpEmpleado.setDir_empleado(empleado.getDir_empleado());
		tmpEmpleado.setId_cargo(empleado.getId_cargo());
		return servicioEmpleado.actualizar(tmpEmpleado);
	}
	
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable int id) {
		Empleado empleado = servicioEmpleado.obtenerEmp(id);
		servicioEmpleado.eliminar(empleado);
	}

}
