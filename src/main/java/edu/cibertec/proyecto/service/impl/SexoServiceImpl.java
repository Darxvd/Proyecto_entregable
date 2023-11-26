package edu.cibertec.proyecto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cibertec.proyecto.entity.Sexo;
import edu.cibertec.proyecto.repository.SexoRepository;
import edu.cibertec.proyecto.service.SexoService;

@Service
public class SexoServiceImpl implements SexoService{
	
	@Autowired
	private SexoRepository sexRepo;

	@Override
	public List<Sexo> listarSexo() {
		return sexRepo.findAll();
	}

}
