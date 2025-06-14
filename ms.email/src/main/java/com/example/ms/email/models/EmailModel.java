package com.example.ms.email.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.example.ms.email.enums.StatusEmail;
import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@Entity
@Table(name = "email")
public class EmailModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String title;
    @Column(columnDefinition = "TEXT")
    private String text;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;
}
