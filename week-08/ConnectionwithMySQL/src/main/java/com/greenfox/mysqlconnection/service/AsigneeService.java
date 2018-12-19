package com.greenfox.mysqlconnection.service;

import com.greenfox.mysqlconnection.model.Asignee;
import com.greenfox.mysqlconnection.repository.AsigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AsigneeService {

  AsigneeRepository asigneeRepository;

  @Autowired
  public AsigneeService(AsigneeRepository asigneeRepository) {
    this.asigneeRepository = asigneeRepository;
  }

  public void saveAsignees(Asignee asignee) {
    if (asignee != null) {
      asigneeRepository.save(asignee);
    }
  }

  public List<Asignee> getListOfAsignee() {
    List<Asignee> asignees = new ArrayList<>();
    asigneeRepository.findAll().forEach(asignees::add);
    return asignees;
  }
}
