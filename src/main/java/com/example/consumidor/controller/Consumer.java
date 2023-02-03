package com.example.consumidor.controller;

import com.example.consumidor.modelo.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Consumer {
    @RabbitListener(queues = "queue.A")
    private void receive(Message message){
        log.info("Message received from QUEUE.A ->{}", message);
    }
    @RabbitListener(queues = "queue.B")
    private void receiveFromB(Message message){
        log.info("Message received from QUEUE.B ->{}", message);
    }

}
