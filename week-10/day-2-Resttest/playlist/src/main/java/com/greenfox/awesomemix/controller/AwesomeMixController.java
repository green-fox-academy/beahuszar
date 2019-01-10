package com.greenfox.awesomemix.controller;

import com.greenfox.awesomemix.repository.SongDTO;
import com.greenfox.awesomemix.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AwesomeMixController {

  SongService service;

  @Autowired
  public AwesomeMixController(SongService service) {
    this.service = service;
  }

  @GetMapping("/")
  public List<SongDTO> songList() {
    return service.getSongList();
  }

  @DeleteMapping("/delete/{id}")
  public List<SongDTO> removeSong(@PathVariable long id) {
    return service.deleteSong(id);
  }

  @PostMapping("changerating")
  public List<SongDTO> changeSongRating(@RequestParam(name = "songid") long songID,
                                        @RequestParam(name = "newrating") long newRating) {

  }
}
