package com.greenfoxacademy.javaandthescripts.thepatientpatient.doctorsOffice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DoctorsOffice {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  long id;
  String address;
  
}
