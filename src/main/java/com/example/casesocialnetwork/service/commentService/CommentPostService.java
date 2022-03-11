package com.example.casesocialnetwork.service.commentService;

import com.example.casesocialnetwork.model.CommentPost;
import com.example.casesocialnetwork.model.Post;
import com.example.casesocialnetwork.service.GeneralService;

public interface CommentPostService extends GeneralService<CommentPost> {
    Iterable<CommentPost> getAllByPost(Post post);
}
