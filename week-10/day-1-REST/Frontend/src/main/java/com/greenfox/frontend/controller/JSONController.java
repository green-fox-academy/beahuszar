package com.greenfox.frontend.controller;

import com.greenfox.frontend.Repository.JsonObject;
import com.greenfox.frontend.service.LogService;
import com.greenfox.frontend.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
public class JSONController {

  private MyService service;
  private LogService logService;

  //logservice not yet tested

  @Autowired
  public JSONController(MyService service) {
    this.service = service;
  }

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input") Integer inputNumber) {
    logService.saveLog("/doubling", "input=" + inputNumber);
    return service.getDouble(inputNumber);
  }

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(name = "name", required = false) String name,
                          @RequestParam(name = "title", required = false) String title) {
    logService.saveLog("/greeter", "name=" + name + " & title=" + title);
    return service.getGreeting(name, title);
  }

  @GetMapping("/appenda/{appendable}")
  public Object appendA(@PathVariable String appendable) {
    logService.saveLog("/appenda/{appendable}", "appendable=" + appendable);
    return service.addA(appendable);
  }

  @PostMapping("/dountil/{action}")
  public Object doUntil(@PathVariable String action,
                        @RequestBody JsonObject until) {
    logService.saveLog("/dountil/{action}", "action=" + action + " & jsonobject=" + until.getUntil());
    return service.doUntil(action, until.getUntil());
  }

  @PostMapping("/arrays")
  public Object arrayHandler(@RequestBody JsonObject jsonObject) {
    logService.saveLog("/arrays", "jsonobject=" + jsonObject.getMathOperation() + " & " + Arrays.toString(jsonObject.getNumberArray()));
    return service.getResultFromJsonObject(jsonObject.getMathOperation(), jsonObject.getNumberArray());
  }

}
