package edu.cibertec.proyecto.service;

import java.util.List;

import edu.cibertec.proyecto.entity.Empleado;

public interface EmpleadoService {
	//Listar
	public List<Empleado>listarEmpleado();
	//Registrar Empleado
	public Empleado registrar(Empleado objEmpleado);
	//Actualizar Empleado
	public Empleado actualizar(Empleado objEmpleado);
	//Obtener empleado
	public Empleado obtenerEmp(int idemp);
	//ELiminar empleado
	public void eliminar(Empleado objEmpleado);


}
