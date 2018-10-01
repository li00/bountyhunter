package com.bountyhunter.controller;

import com.bountyhunter.comm.ResponseVo;
import com.bountyhunter.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Li.Z.F on 2018/9/30.
 */
@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private ResponseVo responseVo;

    @RequestMapping(value = "addmessage")
    public ResponseVo addMessage(Message message,String k){
        return responseVo;
    }

    @RequestMapping(value = "delmessage")
    public ResponseVo delMessage(Message message,String k){
        return responseVo;
    }

    @RequestMapping(value = "updmessage")
    public ResponseVo updMessage(Message message,String k) {
        return responseVo;
    }

    @RequestMapping(value = "getmessage")
    public ResponseVo getMessage(Message message,String k){
        return responseVo;
    }

    @RequestMapping(value = "getmessages")
    public ResponseVo getMessages(Message message,String k){
        return responseVo;
    }
}
