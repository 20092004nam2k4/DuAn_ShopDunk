package com.example.shopdunkproject.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ProductAttribute {
    @EmbeddedId
    ProductAttributeKey id;
    private String value;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    Product product;

    @ManyToOne
    @MapsId("attributeId")
    @JoinColumn(name = "attribute_id")
    Attribute attribute;

}