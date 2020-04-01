package pl.przydan._1_Spring_MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    // need a controller method to show the initial HTML form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloWorld-form";
    }

    // need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm(Model model) {

        //Create a message
        String msg = "Welcome in first version form.";

        //Add msg to model
        model.addAttribute("message", msg);

        return "helloWorld";
    }


    // new a controller method to read form data and
    // add data to the model

    @RequestMapping("/processForm_ver2")
    public String processForm_ver2(HttpServletRequest request, Model model) {

        // read the request parameter form the HTML form
        String theName = request.getParameter("studentName");

        // convert the data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result = "Hello! " + theName + " This is second version of my form";

        // add message to the model
        model.addAttribute("message", result);

        return "helloWorld";
    }

    @RequestMapping("/processForm_ver3")
    public String processForm_ver3(
            @RequestParam("studentName") String theName,
            Model model) {

        // convert the data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result = "Yooo! " + theName + " This is third version of my form";

        // add message to the model
        model.addAttribute("message", result);

        return "helloWorld";
    }

}
