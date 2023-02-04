package com.example.consumidor.service;

import com.example.consumidor.modelo.Message;
import com.example.consumidor.repo.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private MessageRepo messageRepo;

    public Message createMessage(Message message){return messageRepo.save(message);}
}
