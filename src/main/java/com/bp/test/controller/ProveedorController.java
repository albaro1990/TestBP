package com.bp.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bp.test.dto.ProveedorDTO;
import com.bp.test.entity.Proveedor;
import com.bp.test.mapper.IProveedorMapper;
import com.bp.test.service.ProveedorService;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController {
	
	private static final Logger LOG = LoggerFactory.getLogger(ProveedorController.class);
	
	@Autowired
	ProveedorService proveedorService;
	
	@Autowired
	IProveedorMapper proveedorMapper;
	
	
	private Map<String, Object> response;
	
	@PostMapping("/crear")
	public ResponseEntity<?> crear(@RequestBody ProveedorDTO proveedorDto) {
		response = new HashMap<>();
		try {
			
			Proveedor proveedorBD = proveedorMapper.proveedorDTOToProveedor(proveedorDto);
			proveedorBD = proveedorService.save(proveedorBD, "INS");
			response.put("mensaje", "El proveedor guardado con éxito");
			response.put("proveedor", proveedorMapper.proveedorToProveedorDTO(proveedorBD));
			return ResponseEntity.status(HttpStatus.CREATED).body(response);
		} catch (Exception e) {
			response.put("mensaje", "Error al guardar el registro");
			response.put("error", e.getMessage());
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@PostMapping("/editar/{id}")
	public ResponseEntity<?> editar(@RequestBody ProveedorDTO proveedorDTO, @PathVariable Long id) {
		response = new HashMap<>();
		try {
			
			Proveedor proveedorBD= proveedorService.findById(id);
			if(proveedorBD!=null && proveedorBD.getId()>0) {

				proveedorBD.setDireccion(proveedorDTO.getDireccion());
				proveedorBD.setNombre(proveedorDTO.getNombre());
				proveedorBD.setCedulaRuc(proveedorDTO.getCedulaRuc());
				proveedorService.save(proveedorBD, "UPD");
				response.put("mensaje", "El proveedor ha sido modificado con éxito");
				response.put("proveedor", proveedorMapper.proveedorToProveedorDTO(proveedorBD));
				return ResponseEntity.status(HttpStatus.CREATED).body(response);
			}else {
				response.put("mensaje", "El Proveedor no existe");
				return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			response.put("mensaje", "Error al editar el registro");
			response.put("error", e.getMessage());
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
	@GetMapping("/proveedores")
	public ResponseEntity<?> listarProveedores(){
		response = new HashMap<>();
		try {
			
			return ResponseEntity.ok().body(proveedorMapper.listProveedorToListProveedorDto(proveedorService.findAll()));
			
		} catch (Exception e) {
			LOG.error("listarProveedores: ", e);
			response.put("mensaje", "Error al buscar el registro");
			response.put("error", e.getMessage());
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	

}
