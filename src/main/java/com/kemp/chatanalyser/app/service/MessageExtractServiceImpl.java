package com.kemp.chatanalyser.app.service;

import com.kemp.chatanalyser.app.model.Message;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExtractServiceImpl implements MessageExtractService {


    @Override
    public List<Message> extractMessages(List<String> messages) {
        List<Message> messageList = new ArrayList<Message>();
        Date date = new Date();
        for (String message : messages) {

        }
        return List.of();
    }

    private Date getDateOfMessage(String message) {
        Date date = new Date();

        return date;
    }
}
