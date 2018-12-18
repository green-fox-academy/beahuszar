package com.greenfox.jpabasicmappings.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "phone_number")
public class PhoneNumber {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String value;

  @ManyToMany(mappedBy = "phoneNumbers")
  private Set<Customer> customers;
}
