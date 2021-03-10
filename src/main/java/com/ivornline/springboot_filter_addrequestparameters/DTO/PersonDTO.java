package com.ivornline.springboot_filter_addrequestparameters.DTO;

public class PersonDTO {

  //PROPERTIES
  public String name; //EXISTING REQUEST PARAMETER
  public String age;  //ADDED    REQUEST PARAMETER

  //SETTERS (Used for Deserialization)
  public void setName(String name) { this.name = name; }
  public void setAge (String age ) { this.age  = age;  }

}
