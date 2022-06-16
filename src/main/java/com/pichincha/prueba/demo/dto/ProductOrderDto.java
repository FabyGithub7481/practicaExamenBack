package com.pichincha.prueba.demo.dto;

import static lombok.AccessLevel.PRIVATE;

import java.util.Date;
import java.util.List;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = PRIVATE)
public class ProductOrderDto {

  Long id;
  Date dateOrdered;
  List<DetailOrderDto> details;
  UserStoreDto userOwner;
}
