package com.ivornline.springboot_filter_addrequestparameters.controllers;

import com.ivornline.springboot_filter_addrequestparameters.DTO.PersonDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/Hello")
  public String hello(PersonDTO personDTO) {
    return personDTO.name + " is " + personDTO.age + " years old";
  }

}
