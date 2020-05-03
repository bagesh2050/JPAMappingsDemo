package com.hibernate.mappings.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "PostComment")
@Table(name = "post_comment")
public class PostComment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String review;

	//@JsonIgnoreProperties("comments")
	//@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name = "post_number")
	//private Post post;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	/*public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}*/

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (!(o instanceof PostComment))
			return false;

		return id != null && id.equals(((PostComment) o).getId());
	}

	@Override
	public int hashCode() {
		return 31;
	}
}