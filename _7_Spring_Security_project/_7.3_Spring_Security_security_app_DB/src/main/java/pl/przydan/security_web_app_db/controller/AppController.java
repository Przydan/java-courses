package pl.przydan.security_web_app_db.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/")
    public String showLandingPage() {
        return "landing";
    }

    @GetMapping("/employees")
    public String showHomePage() {
        return "home-page";
    }

    @GetMapping("/leaders")
    public String showLeadersPage() {
        return "leaders";
    }

    @GetMapping("/systems")
    public String showAdminPage() {
        return "admin";
    }

}
