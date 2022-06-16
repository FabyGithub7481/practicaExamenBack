package com.pichincha.prueba.demo.entity;

import static lombok.AccessLevel.PRIVATE;

import java.util.Date;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
