package demo.demo.Test3.controller;

import demo.demo.Test2.CentralRequest;
import demo.demo.Test2.CentralService;
import demo.demo.Test3.model.EmployeeBean;
//import demo.demo.Test3.service.empolyeeService;
import demo.demo.Test3.model.FullTimeEmployee;
import demo.demo.Test3.model.PartTimeEmployee;
import demo.demo.Test3.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.origin.Origin;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService ;

    @PostMapping("/addemployee/fulltime")
    public void addEmployeeFullTime(@RequestBody FullTimeEmployee fullTimeEmployee ) throws Exception {
           employeeService.addEmployeeFullTime(fullTimeEmployee);
    }

    @PostMapping("/addemployee/parttime")
    public void addEmployeePartTime(@RequestBody PartTimeEmployee partTimeEmployee ) throws Exception {
        employeeService.addEmployeePartTime(partTimeEmployee);
    }

    @GetMapping("/getdataemployee")
    public Map<String,List<EmployeeBean>> getdataemployee() throws Exception {
        Map<String,List<EmployeeBean>> map = employeeService.getEmployee();
        return map;


    }
}
