package com.kemp.chatanalyser.model.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class VideoCallMessage implements Message{

    private int id;
    private Date date;
    private int participantCounter;
    private boolean accepted;

    @Override
    public MessageCategory getCategory() {
        return MessageCategory.VIDEO_CALL;
    }
}
