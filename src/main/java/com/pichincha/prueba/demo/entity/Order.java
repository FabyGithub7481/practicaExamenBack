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
public class Order {
  @Id
  @GeneratedValue( strategy= GenerationType.IDENTITY)
  Long id;
  Date dateOrdered;
  @OneToMany
  List<OrderDetail> details;
  @ManyToOne
  User user;

}
