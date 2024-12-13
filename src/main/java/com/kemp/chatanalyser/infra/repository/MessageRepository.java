package com.kemp.chatanalyser.infra.repository;

import com.kemp.chatanalyser.app.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long > {
}
