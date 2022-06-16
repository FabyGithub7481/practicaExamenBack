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
public class UserStoreDto {

  Long id;
  String userName;
  Date createdDate;
  List<ProductOrderDto> requestOrders;

}
