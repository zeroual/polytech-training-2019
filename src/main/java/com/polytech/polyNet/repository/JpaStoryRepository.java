package com.polytech.polyNet.repository;

import com.polytech.polyNet.business.Story;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class JpaStoryRepository implements StoryRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Story> findAll() {
        Query query = entityManager.createQuery("SELECT s FROM Story s");
        return query.getResultList();
    }

    @Override
    public void save(Story story) {
        entityManager.persist(story);
    }

}
