package com.intercorp.msirdigital.model.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
@Table(name = "client")
public class Client {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    @NotBlank(message = "Name is mandatory")
    private String name;

    @Column(name = "surname")
    @NotBlank(message = "Surname is mandatory")
    private String surname;

    @Column(name = "age")
    private Integer age;

    @Column(name = "birthday")
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthday;

    @Column(name = "active")
    private Boolean active;

    public Client() {
        this.id = 1;
        this.name = "";
        this.surname = "";
        this.age = 0;
        this.birthday = new Date();
        this.active = true;
    }
}
