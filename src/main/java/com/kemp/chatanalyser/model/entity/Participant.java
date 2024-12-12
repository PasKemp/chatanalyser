package com.kemp.chatanalyser.model.entity;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Participant {

    private int id;
    private String name;
    private List<Message> messageList;
}
