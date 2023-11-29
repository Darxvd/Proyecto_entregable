package edu.cibertec.proyecto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cibertec.proyecto.entity.Cliente;
import edu.cibertec.proyecto.repository.ClienteRepository;
import edu.cibertec.proyecto.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository cliRepo;
	
	@Override
	public List<Cliente> listarCliente() {
		return cliRepo.findAll();
	}

	@Override
	public Cliente registrar(Cliente objCliente) {
		return cliRepo.save(objCliente);
	}

	@Override
	public Cliente actualizar(Cliente objCliente) {
		return cliRepo.save(objCliente);
	}

	@Override
	public Cliente obtenerCli(int idcli) {
		return cliRepo.findById(idcli).orElse(null);
	}

	@Override
	public void eliminar(Cliente objCliente) {
		cliRepo.delete(objCliente);
	}

	@Override
	public List<Cliente> listarClientes(String cliente) {
		return cliRepo.findByCliente(cliente);
	}

}
