package edu.cibertec.proyecto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cibertec.proyecto.entity.Categoria;
import edu.cibertec.proyecto.repository.CategoriaRepository;
import edu.cibertec.proyecto.service.CategoriaService;
@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	private CategoriaRepository catRepo;
	
	@Override
	public List<Categoria> listarCategoria() {
		return catRepo.findAll();
	}
	

}
