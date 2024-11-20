package com.descomplica.FrameBlog.services;

import com.descomplica.FrameBlog.models.Comment;

import java.util.List;

public interface CommentService {

    Comment save(Comment comment);

    List<Comment> getAll();

    Comment get(Long id);

    Comment update(Long id, Comment comment);

    void delete(Long id);

}
