package com.backend.studycenter.events;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmailEvent {
    private String recipient;
    private String subject;
    private String message;
}
