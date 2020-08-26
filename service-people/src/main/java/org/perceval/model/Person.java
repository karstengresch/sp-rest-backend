package org.perceval.model;

import java.io.Serializable;

public class Person implements Serializable {

  private static final long serialVersionUID = -7114814267719778282L;

  private String personId;
  private String surname;
  private String firstName;
  private ProjectRole projectRole;
  private Department department;

  public Person() {

  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public ProjectRole getProjectRole() {
    return projectRole;
  }

  public void setProjectRole(ProjectRole projectRole) {
    this.projectRole = projectRole;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }
  
}