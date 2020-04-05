package com.intercorp.msirdigital.model.dto.model;

import lombok.Data;

@Data
public class Cliente {

    private Integer id;
    private Integer edad;
    private String nombre;
    private String apellido;
    private String nacimiento;
    private String fallecimiento;

    public Cliente() {
    }

    public Cliente(Integer id, String nombre, String apellido, Integer edad, String nacimiento, String fallecimiento) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.fallecimiento = fallecimiento;
    }
}
