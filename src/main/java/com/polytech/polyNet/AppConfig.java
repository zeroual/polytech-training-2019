package com.polytech.polyNet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    StoryRepository storyRepository() {
        return new InMemoryStoryRepository();
    }
    @Bean
    PublicationService publicationService(){
        return new PublicationServiceImpl(storyRepository());
    }
}
