package com.pichincha.prueba.demo.entity;

import static lombok.AccessLevel.PRIVATE;


import java.util.List;

import javax.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = PRIVATE)
@Entity
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "product_id")
  private Long id;
  private String name;
  private Double price;
  @OneToMany(mappedBy = "productOwner", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
  private List<StoreStock> stockByStore;

}
