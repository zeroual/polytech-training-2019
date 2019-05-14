package com.polytech.polyNet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StoryController {


    @Autowired
    PublicationService publicationService;

    @Autowired
    FeedService feedService;

    @PostMapping("/story")
    public void share(@RequestBody String content) {
        publicationService.share(new Story(content));
    }

    @GetMapping("/feed")
    public List<Story> feed() {
        return feedService.fetchAll();
    }

    @GetMapping("/toto")
    public void toto(@RequestParam("param1") Long param1, @RequestParam("param2") String param2) {
        System.out.println("");
    }


}
