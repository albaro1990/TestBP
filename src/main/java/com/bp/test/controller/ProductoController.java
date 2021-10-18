package com.bp.test.controller;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bp.test.dto.ProductoDTO;
import com.bp.test.entity.Producto;
import com.bp.test.mapper.IProductoMapper;
import com.bp.test.mapper.IProveedorMapper;
import com.bp.test.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	public static final Logger LOG = LoggerFactory.getLogger(ProductoController.class);
	
	@Autowired
	ProductoService productoService;
	
	@Autowired
	IProductoMapper productoMapper;
	
	@Autowired
	IProveedorMapper proveedorMapper;
	
	private Map<String, Object> response;
	
	@PostMapping("/addProd")
	public ResponseEntity<?>  addProd(@RequestBody ProductoDTO produDto) {
		response = new HashMap<>();
		try {
			Producto productoBD = productoMapper.productoDTOToProducto(produDto);
			productoService.save(productoBD);
			response.put("mensaje", "Se agrego el producto  con éxito");
			response.put("producto", productoMapper.productoToProductoDTO(productoBD));
			return ResponseEntity.status(HttpStatus.CREATED).body(response);
		} catch (Exception e) {
			response.put("mensaje", "Error al agregar el registro");
			response.put("error", e.getMessage());
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@PatchMapping(path = "/editarProducto/{id}")
	public ResponseEntity<?> editarProducto(@PathVariable Long id, @RequestBody Map<Object, Object> fields) {
		response = new HashMap<>();
	    try {
	    	
	    	
	    	Optional<Producto> producto= productoService.findById(id);
	    	if(producto.isPresent()) {
	    	fields.forEach((k, v)->{
	    		Field field= ReflectionUtils.findField(Producto.class, (String) k);
	    		field.setAccessible(true);
	    		ReflectionUtils.setField(field, producto.get(), v);
	    	});
	       }else {
	    	   response.put("mensaje", "El producto no existe");
				return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	       }

	    	 productoService.save(producto.get());
	    	
	    	response.put("mensaje", "Se edito el producto  con éxito");
			response.put("producto", productoMapper.productoToProductoDTO(producto.get()));
			return ResponseEntity.status(HttpStatus.CREATED).body(response);
	        
	    }  catch (Exception e) {
	    	response.put("mensaje", "Error al editar el registro");
			response.put("error", e.getMessage());
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	

	@GetMapping("/productos/{idPrv}")
	public ResponseEntity<?> findByProveedor(@PathVariable Long idPrv) {
		response = new HashMap<>();
		try {
			List<Producto> productos = productoService.findByProveedor(idPrv);
			if (productos!=null && productos.size()>0)
				return ResponseEntity.ok().body(productoMapper.listProductoToListProductoDto(productos));
			else {
				response.put("mensaje", "La marca por tipo no existe");
				return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			LOG.error("listar: ", e);
			response.put("mensaje", "Error al buscar los registro");
			response.put("error", e.getMessage());
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
