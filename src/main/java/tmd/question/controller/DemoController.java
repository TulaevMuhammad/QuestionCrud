package tmd.question.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller
public class DemoController {
    @GetMapping
    public String demo(){
        return "welcomePage";
    }

}
