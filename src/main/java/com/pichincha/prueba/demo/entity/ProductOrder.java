package com.pichincha.prueba.demo.entity;

import static lombok.AccessLevel.PRIVATE;

import java.util.Date;
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
public class ProductOrder {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "order_id")
  Long id;
  Date dateOrdered;
  @OneToMany(mappedBy = "orderOwner", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  List<DetailOrder> details;

  @ManyToOne(fetch = FetchType.LAZY, optional = true)
  @JoinColumn(name = "user_id", nullable = true)
  UserStore userOwner;

}
