package com.greenfox.groot.controller;

import com.greenfox.groot.repository.MyDto;
import com.greenfox.groot.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  MyService service;

  @Autowired
  public GuardianController(MyService service) {
    this.service = service;
  }

  @GetMapping("/groot")
  public ResponseEntity<MyDto> grootMethod(@RequestParam(name = "message") String message) {
    return message.isEmpty()
      ? new ResponseEntity<>(
          new MyDto(),
          HttpStatus.BAD_REQUEST)
      : new ResponseEntity<>(
          new MyDto(message),
          HttpStatus.OK);
  }
}
