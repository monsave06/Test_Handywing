package demo.demo.Test3.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "EmployeeBean")
public class EmployeeBean {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private int empid;
    private String firstName ;
    private String lastName;
    private Date brithday;


    @OneToOne
    @JoinColumn(name="typeid")
    private EmplyeeType emplyeeType = new EmplyeeType();

//    public EmployeeBean(int empid, String firstName, String lastName, Date brithday) {
//        this.empid = empid;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.brithday = brithday;
//    }
//
//    public EmployeeBean() {
//
//    }
}
