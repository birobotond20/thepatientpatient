package com.greenfoxacademy.javaandthescripts.thepatientpatient.doctorsOffice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class doctorsOffice {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String address;
  
}
