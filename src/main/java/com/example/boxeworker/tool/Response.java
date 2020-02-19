package com.example.boxeworker.tool;

import lombok.Data;

@Data
public class Response {

    //结果编码
    private String code;

    //错误Message
    private String errMessage;

    //结果状态(Success/Fail/err)
    private String states;

    //结果
    private Object data;
}
