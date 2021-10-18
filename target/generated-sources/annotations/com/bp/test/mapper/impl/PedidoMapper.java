package com.bp.test.mapper.impl;

import com.bp.test.dto.CabeceraPedidoDTO;
import com.bp.test.dto.DetallePedidoDTO;
import com.bp.test.dto.ProductoDTO;
import com.bp.test.dto.ProveedorDTO;
import com.bp.test.entity.CabeceraPedido;
import com.bp.test.entity.DetallePedido;
import com.bp.test.entity.Producto;
import com.bp.test.entity.Proveedor;
import com.bp.test.mapper.IPedidoMapper;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class PedidoMapper implements IPedidoMapper {

    @Override
    public CabeceraPedido cebeceraDTOToCabeceraPedido(CabeceraPedidoDTO abeceraPedidoDTO) {
        if ( abeceraPedidoDTO == null ) {
            return null;
        }

        CabeceraPedido cabeceraPedido = new CabeceraPedido();

        cabeceraPedido.setId( abeceraPedidoDTO.getId() );
        cabeceraPedido.setProveedorPed( proveedorDTOToProveedor( abeceraPedidoDTO.getProveedorPed() ) );
        cabeceraPedido.setCantTotal( abeceraPedidoDTO.getCantTotal() );
        cabeceraPedido.setFechaCreacion( abeceraPedidoDTO.getFechaCreacion() );
        cabeceraPedido.setFechaPedido( abeceraPedidoDTO.getFechaPedido() );

        return cabeceraPedido;
    }

    @Override
    public List<DetallePedido> listDetallesDtoToListDetalle(List<DetallePedidoDTO> detalles) {
        if ( detalles == null ) {
            return null;
        }

        List<DetallePedido> list = new ArrayList<DetallePedido>( detalles.size() );
        for ( DetallePedidoDTO detallePedidoDTO : detalles ) {
            list.add( detallePedidoDTOToDetallePedido( detallePedidoDTO ) );
        }

        return list;
    }

    @Override
    public List<CabeceraPedidoDTO> listCabeceraToListCabeceraDto(List<CabeceraPedido> cabecerasDto) {
        if ( cabecerasDto == null ) {
            return null;
        }

        List<CabeceraPedidoDTO> list = new ArrayList<CabeceraPedidoDTO>( cabecerasDto.size() );
        for ( CabeceraPedido cabeceraPedido : cabecerasDto ) {
            list.add( cabeceraPedidoToCabeceraPedidoDTO( cabeceraPedido ) );
        }

        return list;
    }

    protected Proveedor proveedorDTOToProveedor(ProveedorDTO proveedorDTO) {
        if ( proveedorDTO == null ) {
            return null;
        }

        Proveedor proveedor = new Proveedor();

        proveedor.setId( proveedorDTO.getId() );
        proveedor.setNombre( proveedorDTO.getNombre() );
        proveedor.setDireccion( proveedorDTO.getDireccion() );
        proveedor.setCedulaRuc( proveedorDTO.getCedulaRuc() );
        proveedor.setCreateAt( proveedorDTO.getCreateAt() );

        return proveedor;
    }

    protected Producto productoDTOToProducto(ProductoDTO productoDTO) {
        if ( productoDTO == null ) {
            return null;
        }

        Producto producto = new Producto();

        producto.setId( productoDTO.getId() );
        producto.setNombre( productoDTO.getNombre() );
        producto.setPrecio( productoDTO.getPrecio() );
        producto.setCreateAt( productoDTO.getCreateAt() );
        producto.setCantidadStock( productoDTO.getCantidadStock() );

        return producto;
    }

    protected DetallePedido detallePedidoDTOToDetallePedido(DetallePedidoDTO detallePedidoDTO) {
        if ( detallePedidoDTO == null ) {
            return null;
        }

        DetallePedido detallePedido = new DetallePedido();

        detallePedido.setId( detallePedidoDTO.getId() );
        detallePedido.setProducto( productoDTOToProducto( detallePedidoDTO.getProducto() ) );
        detallePedido.setCantidadPedida( detallePedidoDTO.getCantidadPedida() );
        detallePedido.setFechaCreacion( detallePedidoDTO.getFechaCreacion() );
        detallePedido.setFechaPedido( detallePedidoDTO.getFechaPedido() );
        detallePedido.setValorDet( detallePedidoDTO.getValorDet() );

        return detallePedido;
    }

    protected ProveedorDTO proveedorToProveedorDTO(Proveedor proveedor) {
        if ( proveedor == null ) {
            return null;
        }

        ProveedorDTO proveedorDTO = new ProveedorDTO();

        proveedorDTO.setId( proveedor.getId() );
        proveedorDTO.setNombre( proveedor.getNombre() );
        proveedorDTO.setDireccion( proveedor.getDireccion() );
        proveedorDTO.setCreateAt( proveedor.getCreateAt() );
        proveedorDTO.setCedulaRuc( proveedor.getCedulaRuc() );

        return proveedorDTO;
    }

    protected CabeceraPedidoDTO cabeceraPedidoToCabeceraPedidoDTO(CabeceraPedido cabeceraPedido) {
        if ( cabeceraPedido == null ) {
            return null;
        }

        CabeceraPedidoDTO cabeceraPedidoDTO = new CabeceraPedidoDTO();

        cabeceraPedidoDTO.setId( cabeceraPedido.getId() );
        cabeceraPedidoDTO.setProveedorPed( proveedorToProveedorDTO( cabeceraPedido.getProveedorPed() ) );
        cabeceraPedidoDTO.setCantTotal( cabeceraPedido.getCantTotal() );
        cabeceraPedidoDTO.setFechaCreacion( cabeceraPedido.getFechaCreacion() );
        cabeceraPedidoDTO.setFechaPedido( cabeceraPedido.getFechaPedido() );

        return cabeceraPedidoDTO;
    }
}
