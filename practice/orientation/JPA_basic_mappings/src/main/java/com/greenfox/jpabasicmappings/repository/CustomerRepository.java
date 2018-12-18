package com.greenfox.jpabasicmappings.repository;

import com.greenfox.jpabasicmappings.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
  Customer findByName(String name);
}
