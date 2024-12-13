package com.kemp.chatanalyser.app.model;


import lombok.*;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    private Long id;
    private Date date;
    private MessageCategory category;
    private Long participantId;
    private String text;
    private int participantCounter;
    private boolean accepted;
}
