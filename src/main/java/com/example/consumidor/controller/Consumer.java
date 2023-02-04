package com.example.consumidor.controller;

import com.example.consumidor.modelo.Message;
import com.example.consumidor.service.MessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Consumer {
    @Autowired
    private MessageService messageService;
    @RabbitListener(queues = "queue.A")
    private void receive(Message message){
        messageService.createMessage(message);
        log.info("Message received from QUEUE.A ->{}", message);
    }
    @RabbitListener(queues = "queue.B")
    private void receiveFromB(Message message){
        messageService.createMessage(message);
        log.info("Message received from QUEUE.B ->{}", message);
    }
    /*
    @RabbitListener(queues = "queue.C")
    private void receiveFromC(Message message){
        log.info("Message received from QUEUE.C ->{}", message);
    }
    @RabbitListener(queues = "queue.D")
    private void receiveFromD(Message message){
        log.info("Message received from QUEUE.D ->{}", message);
    }
     */

}
