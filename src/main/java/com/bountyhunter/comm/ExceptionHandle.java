package com.bountyhunter.comm;


import com.bountyhunter.comm.log.CustomLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理
 * Created by Li.Z.F on 2018/10/1.
 */
@ControllerAdvice
public class ExceptionHandle {

    @Autowired
    private CustomLog customLog;

    @Autowired
    private ResponseVo responseVo;

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseVo handler( Exception e){
        responseVo.setState(false);
        customLog.err(e.toString());
        return responseVo;
    }
}
