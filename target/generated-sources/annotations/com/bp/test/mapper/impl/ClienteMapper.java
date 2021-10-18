package com.bp.test.mapper.impl;

import com.bp.test.dto.ClienteDTO;
import com.bp.test.entity.Cliente;
import com.bp.test.mapper.IClienteMapper;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class ClienteMapper implements IClienteMapper {

    @Override
    public ClienteDTO clienteToClienteDTO(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteDTO clienteDTO = new ClienteDTO();

        clienteDTO.setId( cliente.getId() );
        clienteDTO.setNombre( cliente.getNombre() );
        clienteDTO.setDireccion( cliente.getDireccion() );
        clienteDTO.setCedulaRuc( cliente.getCedulaRuc() );

        return clienteDTO;
    }

    @Override
    public Cliente clienteDTOTocliente(ClienteDTO clienteDto) {
        if ( clienteDto == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setId( clienteDto.getId() );
        cliente.setNombre( clienteDto.getNombre() );
        cliente.setDireccion( clienteDto.getDireccion() );
        cliente.setCedulaRuc( clienteDto.getCedulaRuc() );

        return cliente;
    }

    @Override
    public List<ClienteDTO> listClienteToListClienteDto(List<Cliente> clientes) {
        if ( clientes == null ) {
            return null;
        }

        List<ClienteDTO> list = new ArrayList<ClienteDTO>( clientes.size() );
        for ( Cliente cliente : clientes ) {
            list.add( clienteToClienteDTO( cliente ) );
        }

        return list;
    }

    @Override
    public List<Cliente> listClienteDtoToListCliente(List<ClienteDTO> clienteDtos) {
        if ( clienteDtos == null ) {
            return null;
        }

        List<Cliente> list = new ArrayList<Cliente>( clienteDtos.size() );
        for ( ClienteDTO clienteDTO : clienteDtos ) {
            list.add( clienteDTOTocliente( clienteDTO ) );
        }

        return list;
    }
}
