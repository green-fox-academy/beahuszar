package com.greenfox.jpabasicmappings.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Order extends CrudRepository<Order, Long> {
}
