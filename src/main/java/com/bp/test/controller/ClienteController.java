package com.bp.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bp.test.dto.ClienteDTO;
import com.bp.test.entity.Cliente;
import com.bp.test.mapper.IClienteMapper;
import com.bp.test.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	private static final Logger LOG = LoggerFactory.getLogger(ClienteController.class);
	
	@Autowired
	IClienteMapper clienteMapper;
	
	@Autowired
	ClienteService 	clienteService;
	
	private Map<String, Object> response;
	
	

	@PostMapping("/crear")
	public ResponseEntity<?> crear(@RequestBody  ClienteDTO clienteDTO) {
		response = new HashMap<>();
		try {
			
			Cliente clienteBD = clienteMapper.clienteDTOTocliente(clienteDTO);
			clienteBD = clienteService.save(clienteBD, "INS");
			response.put("mensaje", "El proveedor guardado con éxito");
			response.put("proveedor", clienteMapper.clienteToClienteDTO(clienteBD));
			return ResponseEntity.status(HttpStatus.CREATED).body(response);
		} catch (Exception e) {
			LOG.error("crear:" + e);
			response.put("mensaje", "Error al guardar el registro");
			response.put("error", e.getMessage());
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	

}
