package edu.cibertec.proyecto.service;

import java.util.List;

import edu.cibertec.proyecto.entity.Proveedor;


public interface ProveedorService {
	public List<Proveedor>listarProveedor();
	public Proveedor registrar(Proveedor objProveedor);
	public Proveedor actualizar(Proveedor objProveedor);
	public Proveedor obtenerPro(int idpro);
	public void eliminar(Proveedor objProveedor);
}
