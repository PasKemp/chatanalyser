package com.kemp.chatanalyser.infra.mapper;

import com.kemp.chatanalyser.app.model.Message;
import com.kemp.chatanalyser.infra.dao.MessageDao;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class MessageMapperImpl implements MessageMapper {

    @Override
    public MessageDao mapEntityToDao(Message entity) {
        return MessageDao.builder()
                .date(entity.getDate())
                .text(entity.getText())
                .participantId(entity.getParticipantId())
                .participantCounter(entity.getParticipantCounter())
                .category(entity.getCategory())
                .accepted(entity.isAccepted())
                .build();
    }

    @Override
    public Message mapDaoToEntity(MessageDao dao) {
        return Message.builder()
                .id(dao.getId())
                .date(dao.getDate())
                .category(dao.getCategory())
                .participantId(dao.getParticipantId())
                .text(dao.getText())
                .participantCounter(dao.getParticipantCounter())
                .accepted(dao.isAccepted())
                .build();
    }
}
