package com.greenfox.frontend.service;

import com.greenfox.frontend.Repository.Log;
import com.greenfox.frontend.Repository.LogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {
  LogRepo logRepo;

  @Autowired
  public LogService(LogRepo logRepo) {
    this.logRepo = logRepo;
  }


  public void saveLog(String endpoint, String data) {
    logRepo.save(new Log(endpoint,data));
  }
}
