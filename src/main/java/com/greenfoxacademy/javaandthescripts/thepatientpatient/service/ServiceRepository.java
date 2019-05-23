package com.greenfoxacademy.javaandthescripts.thepatientpatient.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends CrudRepository<Service, Long> {
  Service findById(long id);
}
