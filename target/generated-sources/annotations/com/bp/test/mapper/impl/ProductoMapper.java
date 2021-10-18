package com.bp.test.mapper.impl;

import com.bp.test.dto.ProductoDTO;
import com.bp.test.dto.ProveedorDTO;
import com.bp.test.entity.Producto;
import com.bp.test.entity.Proveedor;
import com.bp.test.mapper.IProductoMapper;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class ProductoMapper implements IProductoMapper {

    @Override
    public ProductoDTO productoToProductoDTO(Producto producto) {
        if ( producto == null ) {
            return null;
        }

        ProductoDTO productoDTO = new ProductoDTO();

        productoDTO.setProveedorDTO( proveedorToProveedorDTO( producto.getProveedor() ) );
        productoDTO.setId( producto.getId() );
        productoDTO.setNombre( producto.getNombre() );
        productoDTO.setPrecio( producto.getPrecio() );
        productoDTO.setCreateAt( producto.getCreateAt() );
        productoDTO.setCantidadStock( producto.getCantidadStock() );

        return productoDTO;
    }

    @Override
    public Producto productoDTOToProducto(ProductoDTO productoDTO) {
        if ( productoDTO == null ) {
            return null;
        }

        Producto producto = new Producto();

        producto.setProveedor( proveedorDTOToProveedor( productoDTO.getProveedorDTO() ) );
        producto.setId( productoDTO.getId() );
        producto.setNombre( productoDTO.getNombre() );
        producto.setPrecio( productoDTO.getPrecio() );
        producto.setCreateAt( productoDTO.getCreateAt() );
        producto.setCantidadStock( productoDTO.getCantidadStock() );

        return producto;
    }

    @Override
    public List<ProductoDTO> listProductoToListProductoDto(List<Producto> productos) {
        if ( productos == null ) {
            return null;
        }

        List<ProductoDTO> list = new ArrayList<ProductoDTO>( productos.size() );
        for ( Producto producto : productos ) {
            list.add( productoToProductoDTO( producto ) );
        }

        return list;
    }

    @Override
    public List<Producto> listProductoDtoToListProducto(List<ProductoDTO> productoDTO) {
        if ( productoDTO == null ) {
            return null;
        }

        List<Producto> list = new ArrayList<Producto>( productoDTO.size() );
        for ( ProductoDTO productoDTO1 : productoDTO ) {
            list.add( productoDTOToProducto( productoDTO1 ) );
        }

        return list;
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
}
