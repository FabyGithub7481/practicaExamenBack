package com.pichincha.prueba.demo.entity;
import static lombok.AccessLevel.PRIVATE;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = PRIVATE)
@Entity
public class OrderDetail {
  @Id
  @GeneratedValue( strategy= GenerationType.IDENTITY)
  Long id;
  @ManyToOne
  Product product;
  @ManyToOne
  Order order;
  Integer totalOrdered;
  Double priceUnit;
  Double priceTotal;
}
