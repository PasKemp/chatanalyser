package com.kemp.chatanalyser.config;

import com.kemp.chatanalyser.infra.mapper.MessageMapperImpl;
import com.kemp.chatanalyser.utility.ResourceReaderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ResourceReaderService chatReader() {
        return new ResourceReaderService();
    }

    @Bean
    public MessageMapperImpl messageMapper() {return new MessageMapperImpl();}
}
