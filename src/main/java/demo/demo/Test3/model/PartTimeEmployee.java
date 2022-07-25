package demo.demo.Test3.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PartTimeEmployee")
public class PartTimeEmployee extends  EmployeeBean {
    //@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPartTime;
    private double compensation;


}
