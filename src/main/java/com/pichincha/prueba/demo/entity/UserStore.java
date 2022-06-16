package com.pichincha.prueba.demo.entity;
import java.util.List;
import javax.persistence.*;
import static lombok.AccessLevel.PRIVATE;

import java.util.Date;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = PRIVATE)
@Entity
public class UserStore {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id")
  private Long id;
  private String userName;
  private Date createdDate;

  @OneToMany(mappedBy = "userOwner", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST )
  private List<ProductOrder> requestOrders;

}
