package com.pichincha.prueba.demo.dto;

import static lombok.AccessLevel.PRIVATE;

import lombok.*;
import lombok.experimental.FieldDefaults;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = PRIVATE)
public class DetailOrderDto {

  Long id;
  ProductDto productOwner;
  ProductOrderDto orderOwner;
  Integer totalOdered;
  Double priceUnit;
  Double priceTotal;

}
