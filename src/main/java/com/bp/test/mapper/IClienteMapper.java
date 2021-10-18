package com.bp.test.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.bp.test.dto.ClienteDTO;
import com.bp.test.entity.Cliente;

@Mapper(implementationName = "ClienteMapper", implementationPackage = "<PACKAGE_NAME>.impl", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IClienteMapper {
	
	
	
	public ClienteDTO clienteToClienteDTO(Cliente cliente);

	
	public Cliente clienteDTOTocliente(ClienteDTO clienteDto);

	public List<ClienteDTO> listClienteToListClienteDto(List<Cliente> clientes);

	public List<Cliente> listClienteDtoToListCliente(List<ClienteDTO> clienteDtos);

}
