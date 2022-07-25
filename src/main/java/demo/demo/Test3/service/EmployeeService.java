package demo.demo.Test3.service;

import demo.demo.Test3.model.EmployeeBean;
import demo.demo.Test3.model.FullTimeEmployee;
import demo.demo.Test3.model.PartTimeEmployee;
import demo.demo.Test3.reposipory.AddFullTimeEmployeeposipory;
import demo.demo.Test3.reposipory.AddPartTimeEmployeeposipory;
import demo.demo.Test3.reposipory.Employeereposipory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {
    @Autowired
    private Employeereposipory employeereposipory ;
    @Autowired
    private AddFullTimeEmployeeposipory addFullTimeEmployeeposipory;

    @Autowired
    private AddPartTimeEmployeeposipory addpartTimeEmployeeposipory ;

    public void addEmployeeFullTime(FullTimeEmployee fullTimeEmployee){

        addFullTimeEmployeeposipory.save(fullTimeEmployee);

    }
    public void addEmployeePartTime(PartTimeEmployee partTimeEmployee){

        addpartTimeEmployeeposipory.save(partTimeEmployee);

    }

    public Map<String, List<EmployeeBean> > getEmployee(){
        Map<String,List<EmployeeBean> > map =new HashMap<>();
        List<EmployeeBean> employeeBean = employeereposipory.findAll();
        map.put("result",employeeBean);
      return  map;
    }

}
