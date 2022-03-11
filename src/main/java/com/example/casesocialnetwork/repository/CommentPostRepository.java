package com.example.casesocialnetwork.repository;

import com.example.casesocialnetwork.model.CommentPost;
import com.example.casesocialnetwork.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface CommentPostRepository extends CrudRepository<CommentPost, Long> {
    Iterable<CommentPost> getAllByPost(Post post);
}
