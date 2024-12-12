package com.kemp.chatanalyser.model.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class TextMessage implements Message{

    private int id;
    private Date date;
    private String text;

    @Override
    public MessageCategory getCategory() {
        return MessageCategory.TEXT;
    }
}
