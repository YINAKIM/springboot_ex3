package org.zerock.ex3.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Log4j2
@Controller
public class SamepleController {

    @GetMapping("/ex3")
    public void home(){}

    @GetMapping("/map")
    public void map(){}
}
