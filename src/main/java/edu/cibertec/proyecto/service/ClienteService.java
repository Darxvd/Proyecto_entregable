package edu.cibertec.proyecto.service;

import java.util.List;

import edu.cibertec.proyecto.entity.Cliente;
import edu.cibertec.proyecto.entity.Empleado;


public interface ClienteService {
	//Listar
	public List<Cliente>listarCliente();
	//Registrar cliente
	public Cliente registrar(Cliente objCliente);
	//Actualizar cliente
	public Cliente actualizar(Cliente objCliente);
	//Obtener cliente
	public Cliente obtenerCli(int idcli);
	//ELiminar cliente
	public void eliminar(Cliente objCliente);
	
	public List<Cliente> listarClientes(String cliente);

}
