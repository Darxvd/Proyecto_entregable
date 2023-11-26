package edu.cibertec.proyecto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cibertec.proyecto.entity.Cargo;
import edu.cibertec.proyecto.repository.CargoRepository;
import edu.cibertec.proyecto.service.CargoService;

@Service
public class CargoServiceImpl implements CargoService{

	@Autowired
	private CargoRepository carRepo;

	@Override
	public List<Cargo> listarCargo() {
		return carRepo.findAll();
	}
	
	
	
}
