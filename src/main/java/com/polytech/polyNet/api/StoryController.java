package com.polytech.polyNet.api;

import com.polytech.polyNet.business.FeedService;
import com.polytech.polyNet.business.PublicationService;
import com.polytech.polyNet.business.Story;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
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
    public List<Story> feed(Principal principal) {
        String username = principal.getName();
        return feedService.fetchAll();
    }

    @GetMapping("/toto")
    public void toto(@RequestParam("param1") Long param1, @RequestParam("param2") String param2) {
        System.out.println("");
    }


}
