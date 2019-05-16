package com.polytech.polyNet.repository;

import com.polytech.polyNet.business.Story;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class JpaStoryRepository implements StoryRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Story> findAll() {
        return null;
    }

    @Override
    public void save(Story story) {
        entityManager.persist(story);
    }

}
