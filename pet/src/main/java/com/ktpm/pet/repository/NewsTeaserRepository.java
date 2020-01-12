package com.ktpm.pet.repository;

import com.ktpm.pet.model.NewsTeaser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsTeaserRepository extends JpaRepository<NewsTeaser,Integer> {
    NewsTeaser findNewsTeaserById(Integer id);
    }
