package com.kemp.chatanalyser.infra.mapper;

import com.kemp.chatanalyser.app.model.Participant;
import com.kemp.chatanalyser.infra.dao.ParticipantDao;

public class ParticipantMapperImpl implements ParticipantMapper {

    @Override
    public ParticipantDao mapEntityToDao(Participant entity) {
        return ParticipantDao.builder()
                .name(entity.getName())
                .build();
    }

    @Override
    public Participant mapDaoToEntity(ParticipantDao dao) {
        return Participant.builder()
                .id(dao.getId())
                .name(dao.getName())
                .build();
    }
}
