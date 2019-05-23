package com.greenfoxacademy.javaandthescripts.thepatientpatient.Service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface ServiceRepository extends CrudRepository<Service, Long> {
  Service findById(long id);
}
