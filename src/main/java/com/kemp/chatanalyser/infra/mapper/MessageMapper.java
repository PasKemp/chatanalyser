package com.kemp.chatanalyser.infra.mapper;

import com.kemp.chatanalyser.app.model.Message;
import com.kemp.chatanalyser.infra.dao.MessageDao;
import org.mapstruct.Mapper;

@Mapper
public interface MessageMapper {

    MessageDao mapEntityToDao(Message entity);

    Message mapDaoToEntity(MessageDao dao);
}
