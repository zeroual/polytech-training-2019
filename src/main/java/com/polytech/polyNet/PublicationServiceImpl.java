package com.polytech.polyNet;

public class PublicationServiceImpl implements PublicationService {

    private StoryRepository storyRepository;

    public PublicationServiceImpl(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    public void share(Story story) {
        storyRepository.save(story);
    }
}
