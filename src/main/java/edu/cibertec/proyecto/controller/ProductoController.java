package edu.cibertec.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import edu.cibertec.proyecto.entity.Producto;
import edu.cibertec.proyecto.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	private ProductoService servicioProducto;
	
	@GetMapping("/listar")
	public List<Producto> listarProducto(){
		return servicioProducto.listarProducto();
	}
	
	@PostMapping("/registrar")
	@ResponseBody
	public Producto registrar(@RequestBody Producto producto) {
		return servicioProducto.registrar(producto);
	}
	
	@GetMapping("/obtener/{idprod}")
	public Producto obtenerProducto(@PathVariable int idprod) {
		return servicioProducto.obtenerProd(idprod);
	}
	
	@PutMapping("/actualizar")
	@ResponseBody
	public Producto actualizar(@RequestBody Producto producto) {
		Producto tmpProducto = servicioProducto.obtenerProd(producto.getId_producto());
		tmpProducto.setDes_producto(producto.getDes_producto());
		tmpProducto.setPre_producto(producto.getPre_producto());
		tmpProducto.setStk_producto(producto.getStk_producto());
		tmpProducto.setId_categoria(producto.getId_categoria());
		tmpProducto.setId_proveedor(producto.getId_proveedor());
		return servicioProducto.actualizar(tmpProducto);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable int id) {
		Producto producto = servicioProducto.obtenerProd(id);
		servicioProducto.eliminar(producto);
	}
	
	@GetMapping("/listarXcategoria/{id}")
	public List<Producto> listarxCategoria(@PathVariable int id){
		return servicioProducto.listarXCategoria(id);
	}
	
}
