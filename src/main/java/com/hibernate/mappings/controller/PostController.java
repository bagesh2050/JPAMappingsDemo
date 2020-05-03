package com.hibernate.mappings.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.mappings.controller.repository.PostRepository;
import com.hibernate.mappings.entity.Post;
import com.hibernate.mappings.entity.PostComment;

@RestController
public class PostController {

	@Autowired
	PostRepository repository;

	@GetMapping(value = "/post")
	public List<Post> getAllPost() {
		return repository.findAll();
	}

	@PostMapping(value = "/post")
	public String createPost() {
		Post post = new Post();
		post.setTitle("High-Performance Java Persistence");

		List<PostComment> commentlist = new ArrayList<>();
		
		PostComment comment = new PostComment();
		comment.setReview("JPA and Hibernate");
		// post.addComment(comment);
		commentlist.add(comment);

		PostComment comment1 = new PostComment();
		comment1.setReview("Hibernate Only");
		// post.addComment(comment1);
		commentlist.add(comment1);

		PostComment comment2 = new PostComment();
		comment2.setReview("IBatis");
		// post.addComment(comment2);
		commentlist.add(comment2);

		post.setComments(commentlist);
		
		repository.save(post);

		return "Post Created";
	}
}
