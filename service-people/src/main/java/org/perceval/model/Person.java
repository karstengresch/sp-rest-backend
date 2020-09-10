package org.perceval.model;

import java.util.List;
import javax.persistence.Entity;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Person extends PanacheEntity {

  public String personId;
  public String surname;
  public String firstName;
  public ProjectRole projectRole;
  public Department department;

  public static List<Person> findBySurame(String surname) {
    return find("surname", surname).list();
  }

  public static List<Person> findById(String personId) {
    return find("personId", personId).list();
  }

}