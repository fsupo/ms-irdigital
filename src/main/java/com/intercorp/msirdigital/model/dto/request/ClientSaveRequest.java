package com.intercorp.msirdigital.model.dto.request;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class ClientSaveRequest {
    public static final String MSG_NOT_EMPTY = "Parametro requerido";
    
    @NotEmpty(message = MSG_NOT_EMPTY)
    private Integer edad;
    
    @NotEmpty(message = MSG_NOT_EMPTY)
    private String nombre;
    
    @NotEmpty(message = MSG_NOT_EMPTY)
    private String apellido;
    
    @NotEmpty(message = MSG_NOT_EMPTY)
    private Date nacimiento;
}
