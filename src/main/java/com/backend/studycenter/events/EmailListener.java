package com.backend.studycenter.events;

import com.backend.studycenter.common.messaging.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EmailListener {

    @Autowired
    EmailService emailService;

    @Async
    @EventListener
    public void sendEmailEvent(EmailEvent emailEvent){
        emailService.sendEmail(emailEvent.getRecipient(),emailEvent.getSubject(),emailEvent.getMessage());
    }
}
