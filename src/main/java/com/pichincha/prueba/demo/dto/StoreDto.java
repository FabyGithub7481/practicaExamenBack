package com.pichincha.prueba.demo.dto;

import java.util.List;
import static lombok.AccessLevel.PRIVATE;

import lombok.*;
import lombok.experimental.FieldDefaults;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = PRIVATE)
public class StoreDto {

  Long id;
  String name;
  String category;
  String owner;
  List<StoreStockDto> products;

}
