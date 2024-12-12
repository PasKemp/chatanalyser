package com.kemp.chatanalyser.config;

import com.kemp.chatanalyser.utility.ChatReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ChatReader chatReader() {
        return new ChatReader();
    }
}
