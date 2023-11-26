package edu.cibertec.proyecto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cibertec.proyecto.entity.Producto;
import edu.cibertec.proyecto.repository.ProductoRepository;
import edu.cibertec.proyecto.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoRepository prodRepo;
	
	@Override
	public List<Producto> listarProducto() {
		return prodRepo.findAll();
	}

	@Override
	public Producto registrar(Producto objProducto) {
		return prodRepo.save(objProducto);
	}

	@Override
	public Producto actualizar(Producto objProducto) {
		return prodRepo.save(objProducto);
	}

	@Override
	public Producto obtenerProd(int idprod) {
		return prodRepo.findById(idprod).orElse(null);
	}

	@Override
	public void eliminar(Producto objProducto) {
		prodRepo.delete(objProducto);
	}

}
