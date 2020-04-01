package pl.przydan.thymeleafdemoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class AppController {

    @GetMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("date", new Date());

        return "hello-world";
    }
}
