package com.bp.test.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.bp.test.dto.ProductoDTO;
import com.bp.test.entity.Producto;

@Mapper(implementationName = "ProductoMapper", implementationPackage = "<PACKAGE_NAME>.impl", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IProductoMapper {
	
	IProductoMapper INSTANCE = Mappers.getMapper(IProductoMapper.class);

	@Mapping(target = "proveedorDTO", source = "proveedor")
	public ProductoDTO productoToProductoDTO(Producto producto);

	@Mapping(target = "proveedor", source = "proveedorDTO")
	public Producto productoDTOToProducto(ProductoDTO productoDTO);

	public List<ProductoDTO> listProductoToListProductoDto(List<Producto> productos);

	public List<Producto> listProductoDtoToListProducto(List<ProductoDTO> productoDTO);

}
