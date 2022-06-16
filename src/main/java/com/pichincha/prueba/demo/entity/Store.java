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
public class Store {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "store_id")
  Long id;
  String name;
  String category;
  String owner;

  @OneToMany(mappedBy = "storeOwner", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
  List<StoreStock> products;


}
