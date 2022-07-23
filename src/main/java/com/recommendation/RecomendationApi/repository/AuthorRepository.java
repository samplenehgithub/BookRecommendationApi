package com.recommendation.RecomendationApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.recommendation.RecomendationApi.model.Author;
@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer>{

	Author findAuthorByAuthorName(String name);

}
