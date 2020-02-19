package com.example.boxeworker.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_logger")
public class Logger {

    //日志ID
    @TableId(value = "id",type = IdType.AUTO)//指定自增策略
    private Integer id;
    //起始时间
    private String startdate;
    //类名
    private String classname;
    //操作人
    private String userid;
    //操作
    private String operation;
    //结束时间
    private String enddate;
}
