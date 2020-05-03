package com.hibernate.mappings.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.mappings.entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
