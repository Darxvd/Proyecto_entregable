package edu.cibertec.proyecto.service;

import java.util.List;

import edu.cibertec.proyecto.entity.Producto;


public interface ProductoService {
	//Listar
	public List<Producto>listarProducto();
	//Registrar producto
	public Producto registrar(Producto objProducto);
	//Actualizar producto
	public Producto actualizar(Producto objProducto);
	//Obtener producto
	public Producto obtenerProd(int idprod);
	//ELiminar producto
	public void eliminar(Producto objProducto);
	//Listar por categoria
	public List<Producto> listarXCategoria(int id);
}
