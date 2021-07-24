package com.example.springrest2.controller.mapper;

import com.example.springrest2.component.Product;
import com.example.springrest2.controller.dto.ProductDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface ProductMapper {
    ProductMapper MAPPER = Mappers.getMapper(ProductMapper.class);

//    @Mapping(source = "name", target = "name")
    Product toProduct(ProductDto productDto);

    //При наличии аннотаций Mapping на методе toProduct, аннотация InheritInverseConfiguration будет производить обратную обработку этих правил.
    //В отсутствии Mapping использовать InheritInverseConfiguration не обязательно
//    @InheritInverseConfiguration
    ProductDto fromProduct(Product product);

    List<Product> toProducts(List<ProductDto> productDtoList);

    List<ProductDto> fromProducts(List<Product> productList);
}
