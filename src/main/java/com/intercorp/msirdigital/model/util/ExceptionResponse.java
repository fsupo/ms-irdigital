package com.intercorp.msirdigital.model.util;

import lombok.Data;

@Data
public class ExceptionResponse {

    private String exceptionCategory;
    private String exceptionCode;
    private String exceptionMessage;
    private String exceptionDetail;
    private String exceptionSeverity;

    public ExceptionResponse() {
        this.exceptionCategory = "";
        this.exceptionCode = "";
        this.exceptionMessage = "";
        this.exceptionDetail = "";
        this.exceptionSeverity = "E";
    }

    public ExceptionResponse(String exceptionCategory, String exceptionCode, String exceptionMessage) {
        this.exceptionCategory = exceptionCategory;
        this.exceptionCode = exceptionCode;
        this.exceptionMessage = exceptionMessage;
        this.exceptionDetail = "";
        this.exceptionSeverity = "E";
    }

}
