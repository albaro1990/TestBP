package com.bp.test.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.bp.test.dto.CabeceraPedidoDTO;
import com.bp.test.dto.DetallePedidoDTO;
import com.bp.test.entity.CabeceraPedido;
import com.bp.test.entity.DetallePedido;

@Mapper(implementationName = "PedidoMapper", implementationPackage = "<PACKAGE_NAME>.impl", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IPedidoMapper {
	
	
	
	public CabeceraPedido cebeceraDTOToCabeceraPedido(CabeceraPedidoDTO abeceraPedidoDTO);
	
	
	public List<DetallePedido> listDetallesDtoToListDetalle(List<DetallePedidoDTO> detalles);
	
	public List<CabeceraPedidoDTO> listCabeceraToListCabeceraDto(List<CabeceraPedido> cabecerasDto);

}
