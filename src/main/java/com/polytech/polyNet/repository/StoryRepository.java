package com.polytech.polyNet.repository;

import com.polytech.polyNet.business.Story;

import java.util.List;

public interface StoryRepository {
    List<Story> findAll();

    void save(Story story);
}
