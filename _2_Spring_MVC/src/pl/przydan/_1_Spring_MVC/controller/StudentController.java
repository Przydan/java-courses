package pl.przydan._1_Spring_MVC.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.przydan._1_Spring_MVC.model.Student;
import pl.przydan._1_Spring_MVC.model.Student_2;

import java.util.Map;
import java.util.TreeMap;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {

        //create new Student object
        Student theStudent = new Student();

        // add student object to the model
        theModel.addAttribute("student", theStudent);

        return "student-form";
    }

    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;

    @RequestMapping("/showForm-2")
    public String showForm_2(Model theModel) {

        //create new Student object
        Student_2 theStudent = new Student_2();

        // add student object to the model
        theModel.addAttribute("student_2", theStudent);

        // add the country options to the model
        Map<String, String> sortedMapByKey = new TreeMap<>(countryOptions);

        theModel.addAttribute("theCountryOptions", sortedMapByKey);

        return "student-form-2";
    }

    @RequestMapping("/processForm")
    public String processForm(
            @ModelAttribute("student") Student theStudent
            , Model model) {

        System.out.println(theStudent.getFirstName() + " " + theStudent.getLastName());

        return "student-page";
    }

}
