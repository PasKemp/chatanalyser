package com.kemp.chatanalyser.infra.repository;

import com.kemp.chatanalyser.app.model.Participant;
import org.springframework.data.repository.CrudRepository;

public interface ParticipantRepository extends CrudRepository<Participant, Integer> {
}
