package com.kemp.chatanalyser.model.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class PictureMessage implements Message{

    private int id;
    private Date date;

    @Override
    public MessageCategory getCategory() {
        return MessageCategory.PICTURE;
    }
}
