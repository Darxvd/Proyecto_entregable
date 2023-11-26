package edu.cibertec.proyecto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cibertec.proyecto.entity.Empleado;
import edu.cibertec.proyecto.repository.EmpleadoRepository;
import edu.cibertec.proyecto.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	private EmpleadoRepository empRepo;
	
	@Override
	public List<Empleado> listarEmpleado() {
		return empRepo.findAll();
	}

	@Override
	public Empleado registrar(Empleado objEmpleado) {
		return empRepo.save(objEmpleado);
	}

	@Override
	public Empleado actualizar(Empleado objEmpleado) {
		return empRepo.save(objEmpleado);
	}

	@Override
	public Empleado obtenerEmp(int idemp) {
		return empRepo.findById(idemp);
	}

	@Override
	public void eliminar(Empleado objEmpleado) {
		empRepo.delete(objEmpleado);
	}
	
}
