package com.greenfox.mysqlconnection.repository;

import com.greenfox.mysqlconnection.model.Asignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsigneeRepository extends CrudRepository<Asignee, Long> {
}
