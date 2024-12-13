package com.kemp.chatanalyser.app.service;

import com.kemp.chatanalyser.app.model.Message;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageExtractService {

    List<Message> extractMessages(List<String> messages);
}
