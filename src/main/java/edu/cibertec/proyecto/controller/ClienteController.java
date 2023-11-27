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

import edu.cibertec.proyecto.entity.Cliente;
import edu.cibertec.proyecto.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService servicioCliente;
	
	@GetMapping("/listar")
	public List<Cliente> listarCliente(){
		return servicioCliente.listarCliente();
	}
	
	@PostMapping("/registrar")
	@ResponseBody
	public Cliente registrar(@RequestBody Cliente cliente) {
		return servicioCliente.registrar(cliente);
	}
	
	@GetMapping("/obtener/{idcli}")
	public Cliente obtenerCliente(@PathVariable int idcli) {
		return servicioCliente.obtenerCli(idcli);
	}
	
	@PutMapping("/actualizar")
	@ResponseBody
	public Cliente actualizar(@RequestBody Cliente cliente) {
		Cliente tmpCliente = servicioCliente.obtenerCli(cliente.getId_cliente());
		tmpCliente.setNoap_cliente(cliente.getNoap_cliente());
		tmpCliente.setDni_cliente(cliente.getDni_cliente());
		tmpCliente.setTlf_cliente(cliente.getTlf_cliente());
		return servicioCliente.actualizar(tmpCliente);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable int id) {
		Cliente cliente = servicioCliente.obtenerCli(id);
		servicioCliente.eliminar(cliente);
	}
	
}
