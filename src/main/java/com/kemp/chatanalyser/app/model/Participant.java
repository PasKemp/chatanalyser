package com.kemp.chatanalyser.app.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Participant {

    private Long id;
    private String name;
}
