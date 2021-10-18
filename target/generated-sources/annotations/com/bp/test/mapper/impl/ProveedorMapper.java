package com.bp.test.mapper.impl;

import com.bp.test.dto.ProductoDTO;
import com.bp.test.dto.ProveedorDTO;
import com.bp.test.entity.Producto;
import com.bp.test.entity.Proveedor;
import com.bp.test.mapper.IProveedorMapper;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class ProveedorMapper implements IProveedorMapper {

    @Override
    public ProveedorDTO proveedorToProveedorDTO(Proveedor proveedor) {
        if ( proveedor == null ) {
            return null;
        }

        ProveedorDTO proveedorDTO = new ProveedorDTO();

        proveedorDTO.setProductosDto( productoListToProductoDTOList( proveedor.getProductos() ) );
        proveedorDTO.setId( proveedor.getId() );
        proveedorDTO.setNombre( proveedor.getNombre() );
        proveedorDTO.setDireccion( proveedor.getDireccion() );
        proveedorDTO.setCreateAt( proveedor.getCreateAt() );
        proveedorDTO.setCedulaRuc( proveedor.getCedulaRuc() );

        return proveedorDTO;
    }

    @Override
    public Proveedor proveedorDTOToProveedor(ProveedorDTO proveedorDto) {
        if ( proveedorDto == null ) {
            return null;
        }

        Proveedor proveedor = new Proveedor();

        proveedor.setProductos( productoDTOListToProductoList( proveedorDto.getProductosDto() ) );
        proveedor.setId( proveedorDto.getId() );
        proveedor.setNombre( proveedorDto.getNombre() );
        proveedor.setDireccion( proveedorDto.getDireccion() );
        proveedor.setCedulaRuc( proveedorDto.getCedulaRuc() );
        proveedor.setCreateAt( proveedorDto.getCreateAt() );

        return proveedor;
    }

    @Override
    public List<ProveedorDTO> listProveedorToListProveedorDto(List<Proveedor> proveedores) {
        if ( proveedores == null ) {
            return null;
        }

        List<ProveedorDTO> list = new ArrayList<ProveedorDTO>( proveedores.size() );
        for ( Proveedor proveedor : proveedores ) {
            list.add( proveedorToProveedorDTO( proveedor ) );
        }

        return list;
    }

    @Override
    public List<Proveedor> listProveedorDtoToListProveedor(List<ProveedorDTO> proveedorDtos) {
        if ( proveedorDtos == null ) {
            return null;
        }

        List<Proveedor> list = new ArrayList<Proveedor>( proveedorDtos.size() );
        for ( ProveedorDTO proveedorDTO : proveedorDtos ) {
            list.add( proveedorDTOToProveedor( proveedorDTO ) );
        }

        return list;
    }

    protected ProductoDTO productoToProductoDTO(Producto producto) {
        if ( producto == null ) {
            return null;
        }

        ProductoDTO productoDTO = new ProductoDTO();

        productoDTO.setId( producto.getId() );
        productoDTO.setNombre( producto.getNombre() );
        productoDTO.setPrecio( producto.getPrecio() );
        productoDTO.setCreateAt( producto.getCreateAt() );
        productoDTO.setCantidadStock( producto.getCantidadStock() );

        return productoDTO;
    }

    protected List<ProductoDTO> productoListToProductoDTOList(List<Producto> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductoDTO> list1 = new ArrayList<ProductoDTO>( list.size() );
        for ( Producto producto : list ) {
            list1.add( productoToProductoDTO( producto ) );
        }

        return list1;
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

    protected List<Producto> productoDTOListToProductoList(List<ProductoDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Producto> list1 = new ArrayList<Producto>( list.size() );
        for ( ProductoDTO productoDTO : list ) {
            list1.add( productoDTOToProducto( productoDTO ) );
        }

        return list1;
    }
}
