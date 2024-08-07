package com.barkmew.store.persistence.mapper;

import com.barkmew.store.domain.PurchaseItem;
import com.barkmew.store.persistence.entity.ComprasProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {
    @Mappings({
            @Mapping(source ="id.idProducto", target="productId"),
            @Mapping(source = "cantidad", target="quantity"),
            //como se llaman igual se obvia esta linea @Mapping(source = "total", target="total"),
            @Mapping(source = "estado", target="active")
    })
    PurchaseItem toPurchaseItem(ComprasProducto producto);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "compra", ignore = true),
            @Mapping(target = "producto", ignore = true),
            @Mapping(target = "Id.idCompra", ignore = true)
    })
    ComprasProducto toComprasProducto(PurchaseItem item);
}
