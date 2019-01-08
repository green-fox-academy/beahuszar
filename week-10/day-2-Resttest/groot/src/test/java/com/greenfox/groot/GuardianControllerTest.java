package com.greenfox.groot;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.greenfox.groot.controller.GuardianController;
import com.greenfox.groot.service.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import static org.hamcrest.Matchers.is;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

  @Autowired
  MockMvc mockMvc;

  @MockBean
  MyService service;

  @Test
  public void statusShouldBeBad() throws Exception {
    mockMvc.perform(get("/groot?message="))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }

  @Test
  public void statusShouldBeOk() throws Exception {
    mockMvc.perform(get("/groot?message=hablaty"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received", is("hablaty")));
  }
}
