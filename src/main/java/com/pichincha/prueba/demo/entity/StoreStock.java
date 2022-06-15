package com.pichincha.prueba.demo.entity;

import static lombok.AccessLevel.PRIVATE;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
public class StoreStock {
  @Id
  @GeneratedValue( strategy= GenerationType.IDENTITY)
  Long id;
  Double price;
  @ManyToOne
  Product product;
  @ManyToOne
  Store store;
  Integer stock;
}
