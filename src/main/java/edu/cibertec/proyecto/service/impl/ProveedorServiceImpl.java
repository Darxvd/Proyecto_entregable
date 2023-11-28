package edu.cibertec.proyecto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cibertec.proyecto.entity.Proveedor;
import edu.cibertec.proyecto.repository.ProveedorRepository;
import edu.cibertec.proyecto.service.ProveedorService;

@Service
public class ProveedorServiceImpl implements ProveedorService{

	@Autowired
	private ProveedorRepository proRepo;
	
	@Override
	public List<Proveedor> listarProveedor() {
		return proRepo.findAll();
	}

	@Override
	public Proveedor registrar(Proveedor objProveedor) {
		return proRepo.save(objProveedor);
	}

	@Override
	public Proveedor actualizar(Proveedor objProveedor) {
		return proRepo.save(objProveedor);
	}

	@Override
	public Proveedor obtenerPro(int idpro) {
		return proRepo.findById(idpro);
	}

	@Override
	public void eliminar(Proveedor objProveedor) {
		proRepo.delete(objProveedor);
	}
	

}
