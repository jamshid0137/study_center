package com.backend.studycenter.sccontrol.dto;

import com.backend.studycenter.common.model.person.Interview;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterviewResultDTO {
    private Long id;
    private Interview interview;
    private String details;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm")
    private LocalDateTime date;
    private String feedback;
}
