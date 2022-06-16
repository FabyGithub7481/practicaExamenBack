package com.pichincha.prueba.demo.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StoreDto {

  Long id;
  String name;
  String category;
  String owner;

  List<StoreStockDto> products;

}
