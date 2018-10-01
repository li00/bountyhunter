package com.bountyhunter.comm;

import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by Li.Z.F on 2018/9/29.
 */
@Component
public class ResponseVo {
    private Boolean state = false;
    private String  msg   = "系统错误";
    private Object data;

    public ResponseVo() {
    }

    public Boolean isState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getMsg() {
        if (state == true) msg = "操作成功";
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResponseVo(Boolean state, String msg,Object data) {
        this.state = state;
        this.msg = msg;
        this.data = data;
    }
}
