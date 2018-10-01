package com.bountyhunter.service;

import com.bountyhunter.model.Message;

import java.util.List;

/**
 * Created by Li.Z.F on 2018/9/30.
 */
public interface IMessageService {

    public void addMessage(Message message);

    public void delMessage(Message message);

    public void updMessage(Message message);

    public Message getMessage(Message message);

    public List<Message> getMessages(Message message);
}
