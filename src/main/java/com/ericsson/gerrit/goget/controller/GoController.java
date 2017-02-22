package com.ericsson.gerrit.goget.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by hongkailiu on 2017-02-21.
 */
@Controller
@Slf4j
public class GoController {

  @RequestMapping(value = "/go/**")
  public String go(@RequestParam(value = "go-get") int goGet, HttpServletRequest request,
      Model model) {
    log.info("goGet: " + goGet);
    log.info("uri: " + request.getRequestURI());
    model.addAttribute("content", "111 git 222");
    if (request.getRequestURI().contains("aaa")) {
      return "index";
    } else {
      return "forward:/404";
    }

  }

  @RequestMapping(value = "/404")
  @ResponseStatus(value = HttpStatus.NOT_FOUND)
  public String notFound() {
    return "404";
  }
}
