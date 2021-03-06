package com.example.casesocialnetwork.service.commentService;

import com.example.casesocialnetwork.model.CommentPost;
import com.example.casesocialnetwork.model.Post;
import com.example.casesocialnetwork.repository.CommentPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentPostServiceImpl implements CommentPostService {

    @Autowired
    private CommentPostRepository commentPostRepository;

    @Override
    public Iterable<CommentPost> findAll() {
        return commentPostRepository.findAll();
    }

    @Override
    public Optional<CommentPost> findById(Long id) {
        return commentPostRepository.findById(id);
    }

    @Override
    public CommentPost save(CommentPost commentPost) {
        return commentPostRepository.save(commentPost);
    }

    @Override
    public void remove(Long id) {
        commentPostRepository.deleteById(id);
    }

    @Override
    public Iterable<CommentPost> getAllByPost(Post post) {
        return commentPostRepository.getAllByPost(post);
    }
}
