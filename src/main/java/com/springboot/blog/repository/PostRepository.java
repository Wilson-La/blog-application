package com.springboot.blog.repository;

import com.springboot.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

// don't need to annotate Repository because JpaRepository will take care of it
public interface PostRepository extends JpaRepository<Post, Long> {

}
