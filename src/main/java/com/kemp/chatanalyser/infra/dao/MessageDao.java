package com.kemp.chatanalyser.infra.dao;

import com.kemp.chatanalyser.app.model.MessageCategory;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MessageDao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date date;
    private MessageCategory category;
    private Long participantId;
    private String text;
    private int participantCounter;
    private boolean accepted;
}
