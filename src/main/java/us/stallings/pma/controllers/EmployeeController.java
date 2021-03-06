package us.stallings.pma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import us.stallings.pma.dao.EmployeeRepository;
import us.stallings.pma.entities.Employee;

import java.util.List;

@Controller
@RequestMapping(value ="/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping
    public String displayEmployees(Model model) {
        List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employees", employees);
        return "employees/list-employees";
    }

    @GetMapping("/new")
    public String displayEmployeeFrom(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employees/new-employee";
    }

    @PostMapping("/save")
    public String addEmployee(Employee employee, Model model) {
        employeeRepository.save(employee);
        return "redirect:/employees";
    }

}
