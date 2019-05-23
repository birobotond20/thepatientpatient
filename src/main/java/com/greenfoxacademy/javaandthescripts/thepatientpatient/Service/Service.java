package com.greenfoxacademy.javaandthescripts.thepatientpatient.Service;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Service {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  long id;
  String cathegory;
  long timeInMinutes;
}
