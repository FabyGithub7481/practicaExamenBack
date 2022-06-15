package com.pichincha.prueba.demo.entity;
import java.util.List;
import javax.persistence.*;
import static lombok.AccessLevel.PRIVATE;

import java.util.Date;
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
public class User {
  @Id
  @GeneratedValue( strategy=GenerationType.IDENTITY)
  Long id;
  String userName;
  Date createdDate;
  @OneToMany
  List<Order> requestOrders;

}
