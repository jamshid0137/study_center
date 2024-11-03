package com.backend.studycenter.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EmailPublisher {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public EmailPublisher(ApplicationEventPublisher eventPublisher){
        this.eventPublisher=eventPublisher;
    }

    public void publishEmailEvent(EmailEvent event){
        eventPublisher.publishEvent(event);
    }
}
