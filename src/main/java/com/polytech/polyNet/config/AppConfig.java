package com.polytech.polyNet.config;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.polytech.polyNet.business.FeedService;
import com.polytech.polyNet.business.FeedServiceImpl;
import com.polytech.polyNet.business.PublicationService;
import com.polytech.polyNet.business.PublicationServiceImpl;
import com.polytech.polyNet.repository.JpaStoryRepository;
import com.polytech.polyNet.repository.StoryRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

    @Bean
    StoryRepository storyRepository() {
        return new JpaStoryRepository();
    }

    @Bean
    DataSource datasource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost:3306/polyNet");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        return dataSource;
    }

    @Bean
    FeedService feedService() {
        return new FeedServiceImpl(storyRepository());
    }

    @Bean
    PublicationService publicationService() {
        return new PublicationServiceImpl(storyRepository());
    }
}
