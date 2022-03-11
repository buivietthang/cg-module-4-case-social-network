package com.example.casesocialnetwork.service.postService;

import com.example.casesocialnetwork.model.AppUser;
import com.example.casesocialnetwork.model.Post;
import com.example.casesocialnetwork.service.GeneralService;

public interface PostService extends GeneralService<Post> {
    Iterable<Post> getAllByOrderByDateDesc();

    Iterable<Post> getAllByAppUserOrderByDateDesc(AppUser appUser);
}
