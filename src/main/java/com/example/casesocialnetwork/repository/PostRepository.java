package com.example.casesocialnetwork.repository;

import com.example.casesocialnetwork.model.AppUser;
import com.example.casesocialnetwork.model.Post;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {
    Iterable<Post> getAllByOrderByDateDesc();

    Iterable<Post> getAllByAppUserOrderByDateDesc(AppUser appUser);
}
