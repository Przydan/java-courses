package pl.przydan.spring_boot_app._9._Spring_boot_app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public String hello() {
        return "<hr>Siema<hr>";
    }
}
