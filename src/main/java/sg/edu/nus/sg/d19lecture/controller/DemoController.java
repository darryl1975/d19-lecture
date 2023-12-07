package sg.edu.nus.sg.d19lecture.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import sg.edu.nus.sg.d19lecture.model.Employee;

@Controller
@RequestMapping("/demo")
public class DemoController {
    
    @GetMapping("/home")
    public String home(HttpSession session, Model model) {
        
        Employee employee1 = new Employee(12345, "Michael");
        Employee employee2 = new Employee(12346, "Michelle");
        Employee employee3 = new Employee(12347, "Myra");
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        session.setAttribute("employees", employees);

        return "home";
    }
}
