package com.bountyhunter.controller;

import com.bountyhunter.comm.ResponseVo;
import com.bountyhunter.comm.log.Log;
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
    @Log(module = "新增消息",url = "/message/addmessage")
    public ResponseVo addMessage(Message message,String k){
        return responseVo;
    }

    @RequestMapping(value = "delmessage")
    @Log(module = "删除消息",url = "/message/delmessage")
    public ResponseVo delMessage(Message message,String k){
        return responseVo;
    }

    @RequestMapping(value = "updmessage")
    @Log(module = "修改消息",url = "/message/updmessage")
    public ResponseVo updMessage(Message message,String k) {
        return responseVo;
    }

    @RequestMapping(value = "getmessage")
    @Log(module = "获取单个消息",url = "/message/getmessage")
    public ResponseVo getMessage(Message message,String k){
        return responseVo;
    }

    @RequestMapping(value = "getmessages")
    @Log(module = "获取多个消息",url = "/message/getmessages")
    public ResponseVo getMessages(Message message,String k){
        return responseVo;
    }
}
