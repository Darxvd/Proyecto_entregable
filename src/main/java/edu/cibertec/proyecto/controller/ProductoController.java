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
	
	@GetMapping(value= {"","/"})
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
	
	@PutMapping("/actualizar/{id}")
	@ResponseBody
	public Producto actualizar(@PathVariable int id, @RequestBody Producto producto) {
		Producto tmpProducto = servicioProducto.obtenerProd(id);
		tmpProducto.setNom_prod(producto.getNom_prod());
		tmpProducto.setDes_prod(producto.getDes_prod());
		tmpProducto.setPre_prod(producto.getPre_prod());
		tmpProducto.setFcr_prod(producto.getFcr_prod());
		tmpProducto.setFpv_prod(producto.getFpv_prod());
		tmpProducto.setCant_prod(producto.getCant_prod());
		tmpProducto.setObjcategoria(producto.getObjcategoria());
		tmpProducto.setObjProveedor(producto.getObjProveedor());
		return servicioProducto.actualizar(tmpProducto);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable int id) {
		Producto producto = servicioProducto.obtenerProd(id);
		servicioProducto.eliminar(producto);
	}
	
}
