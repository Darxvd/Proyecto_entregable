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
	

}
