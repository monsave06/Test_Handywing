package demo.demo.Test3.reposipory;

import demo.demo.Test3.model.EmployeeBean;

import demo.demo.Test3.model.FullTimeEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Employeereposipory extends JpaRepository<EmployeeBean, Long> {

}

