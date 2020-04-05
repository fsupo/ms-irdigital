package com.intercorp.msirdigital.model.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BaseResponse {
    private BaseMessage message;

    public BaseResponse() {
        this.message = new BaseMessage();
    }
}
