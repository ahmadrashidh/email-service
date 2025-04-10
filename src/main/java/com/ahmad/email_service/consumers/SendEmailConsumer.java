package com.ahmad.email_service.consumers;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class SendEmailConsumer {

    @KafkaListener(topics="send-email", groupId = "emailService")
    public void handleSendEmailEvent( String message){
        System.out.println("Sending email to" + message);
    }
}
