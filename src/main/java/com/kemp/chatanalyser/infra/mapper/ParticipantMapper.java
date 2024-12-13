package com.kemp.chatanalyser.infra.mapper;

import com.kemp.chatanalyser.app.model.Participant;
import com.kemp.chatanalyser.infra.dao.ParticipantDao;
import org.mapstruct.Mapper;

@Mapper
public interface ParticipantMapper {

    ParticipantDao mapEntityToDao(Participant entity);

    Participant mapDaoToEntity(ParticipantDao Dao);
}
