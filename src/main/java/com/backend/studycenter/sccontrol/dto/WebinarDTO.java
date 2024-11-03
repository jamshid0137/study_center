package com.backend.studycenter.sccontrol.dto;

import com.backend.studycenter.common.dto.person.PersonDTO;
import com.backend.studycenter.common.model.person.Person;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
public class WebinarDTO {
    private Long id;
    private String title;
    private PersonDTO speaker;
    private List<PersonDTO> participants;
    private LocalDateTime date;
    private String description;
    private String location;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PersonDTO getSpeaker() {
        return speaker;
    }

    public void setSpeaker(PersonDTO speaker) {
        this.speaker = speaker;
    }

    public List<PersonDTO> getParticipants() {
        return participants;
    }

    public void setParticipants(List<PersonDTO> participants) {
        this.participants = participants;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
