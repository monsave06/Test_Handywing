package demo.demo.Test3.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "EmplyeeType")
public class EmplyeeType {
    @Id
    private int typeid;
    private String typename;
    private String typedetail;
}
