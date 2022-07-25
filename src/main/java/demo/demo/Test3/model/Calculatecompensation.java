package demo.demo.Test3.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
@Getter
@Setter
@Entity
@Table(name ="Calculatecompensation")
public class Calculatecompensation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCalculate ;
    private double calculateResult ;
    private Timestamp datetime;
}
