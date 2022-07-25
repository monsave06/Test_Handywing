package demo.demo.Test3.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "FullTimeEmployee")
public class FullTimeEmployee extends EmployeeBean {

   @GeneratedValue(strategy = GenerationType.AUTO)
   private int idFullTime ;
    private double salary;


}
