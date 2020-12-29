package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Category;
import com.platzi.market.persistence.entity.Categoria;
import org.mapstruct.*;


@Mapper(componentModel = "spring") // Componente de tipo Spring
public interface CategoryMapper {
    @Mappings({
        @Mapping(source="idCategoria", target = "categoryId"),
        @Mapping(source="descripcion", target = "category"),
        @Mapping(source="estado", target = "active"),
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration // Indico que es la inversa a la anterior
    @Mapping(target = "productos" , ignore = true) // Le decimos que ignore la lista de productos
    Categoria toCategoria(Category category);
}
