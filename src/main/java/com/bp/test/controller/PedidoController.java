package com.bp.test.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bp.test.dto.PedidoDTO;
import com.bp.test.entity.CabeceraPedido;
import com.bp.test.entity.DetallePedido;
import com.bp.test.mapper.IPedidoMapper;
import com.bp.test.service.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
	
	private static final Logger LOG = LoggerFactory.getLogger(PedidoController.class);
	
	
	
	@Autowired
	PedidoService 	pedidoService;
	
	@Autowired
	IPedidoMapper pedidoMapper;
	
	private Map<String, Object> response;
	
	

	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Long id) {
		response = new HashMap<>();
		try {
			pedidoService.delete(id);		
		} catch (Exception e) {
			LOG.error("eliminar "+e);
			response.put("mensaje", "Error al eliminar el registro");
			response.put("error", e.getMessage());
			
		}
		
		
	}
	
	@PostMapping("/crear")
	public ResponseEntity<?> crear(@RequestBody PedidoDTO pedidoDTO) {
		response = new HashMap<>();
		try {
			
			CabeceraPedido cabeceraBD = pedidoMapper.cebeceraDTOToCabeceraPedido(pedidoDTO.getCabeceraPedidoDto());
			List<DetallePedido> detallesBD=  pedidoMapper.listDetallesDtoToListDetalle(pedidoDTO.getDetallesPedidoDto());
			
			
			 pedidoService.save(cabeceraBD,detallesBD);
			
			return ResponseEntity.status(HttpStatus.CREATED).body(response);
		} catch (Exception e) {
			response.put("mensaje", "Error al guardar el registro");
			response.put("error", e.getMessage());
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@GetMapping("/buscarByClienteFiniFfin/{clientId}/fIni/Ffin")
	public ResponseEntity<?> listarPedidos(){
		
		try {
			
			List<CabeceraPedido> cabeceras= new ArrayList<>();
			
			return ResponseEntity.ok().body(pedidoMapper.listCabeceraToListCabeceraDto(cabeceras));
		} catch (Exception e) {
			LOG.error("listar: ", e);
			response.put("mensaje", "Error al buscar los registro");
			response.put("error", e.getMessage());
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	

}
