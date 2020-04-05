package com.intercorp.msirdigital.model.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class BaseMessage {
    private String code;
    private String description;

    public BaseMessage() {
        this.code = "1";
        this.description = "OK";
    }
}