package pl.przydan.security_web_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

@Controller
public class AppController {

    @GetMapping("/home")
    public String showHomePage() {

        return "home";
    }
}