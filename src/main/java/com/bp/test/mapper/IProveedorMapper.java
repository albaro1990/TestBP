/**
 * 
 */
package com.bp.test.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.bp.test.dto.ProveedorDTO;
import com.bp.test.entity.Proveedor;

/**
 * @author 
 *
 */
@Mapper(implementationName = "ProveedorMapper", implementationPackage = "<PACKAGE_NAME>.impl", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IProveedorMapper {

	IProveedorMapper INSTANCE = Mappers.getMapper(IProveedorMapper.class);
	
	
	@Mapping(target = "productosDto", source = "productos")
	public ProveedorDTO proveedorToProveedorDTO(Proveedor proveedor);
	
	@Mapping(target = "productos", source = "productosDto")
	public Proveedor proveedorDTOToProveedor(ProveedorDTO proveedorDto);
	
	public List<ProveedorDTO> listProveedorToListProveedorDto(List<Proveedor> proveedores);
	
	public List<Proveedor> listProveedorDtoToListProveedor(List<ProveedorDTO> proveedorDtos);
}
