package com.ust.webinar_service.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "webinars")
public class Webinar {
    @Id
    private String id;
    private String title;
    private String tutor;
    private String startTime;
    private String endTime;

    // Getters and Setters
}
