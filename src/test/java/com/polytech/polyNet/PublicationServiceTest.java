package com.polytech.polyNet;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;

public class PublicationServiceTest {
    @Test
    public void should_save_story() {
        //GIVEN
        StoryRepository storyRepository = new InMemoryStoryRepository();
        PublicationService publicationService = new PublicationServiceImpl(storyRepository);
        Story story1 = new Story("Hello PSG");
        Story story2 = new Story("Hello OM");
        //WHEN
        publicationService.share(story1);
        publicationService.share(story2);
        //THEN
        List stories = storyRepository.findAll();
        Assert.assertEquals(2, stories.size());
        Assert.assertEquals(asList(story1, story2), stories);


    }

}
