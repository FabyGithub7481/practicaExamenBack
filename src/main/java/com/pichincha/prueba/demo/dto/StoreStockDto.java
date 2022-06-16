package com.pichincha.prueba.demo.dto;

import static lombok.AccessLevel.PRIVATE;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = PRIVATE)
public class StoreStockDto {

  Long id;
  Double soldPrice;
  ProductDto productOwner;
  Integer stock;
}
