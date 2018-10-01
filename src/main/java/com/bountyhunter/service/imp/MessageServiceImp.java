package com.bountyhunter.service.imp;

import com.bountyhunter.dao.MessageDao;
import com.bountyhunter.model.Message;
import com.bountyhunter.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Li.Z.F on 2018/9/30.
 */
@Service
public class MessageServiceImp implements IMessageService {
    @Autowired
    private MessageDao messageDao;

    @Override
    public void addMessage(Message message) {

    }

    @Override
    public void delMessage(Message message) {

    }

    @Override
    public void updMessage(Message message) {

    }

    @Override
    public Message getMessage(Message message) {
        return null;
    }

    @Override
    public List<Message> getMessages(Message message) {
        return null;
    }
}
