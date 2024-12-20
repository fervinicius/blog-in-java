package com.descomplica.FrameBlog.controllers;

import com.descomplica.FrameBlog.models.Comment;
import com.descomplica.FrameBlog.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/save")
    private @ResponseBody Comment save(@RequestBody Comment comment) {
        return commentService.save(comment);
    }

    @GetMapping(path = "/getAll")
    private @ResponseBody List<Comment> getAll() {
        return commentService.getAll();
    }

    @GetMapping(path = "/get")
    private @ResponseBody Comment get(@RequestParam final Long id) {
        return commentService.get(id);
    }

    @PostMapping(path = "update")
    private @ResponseBody Comment update(@RequestParam final Long id, @RequestBody Comment comment) {
        return commentService.update(id, comment);
    }

    @DeleteMapping(path = "/delete")
    private ResponseEntity<?> delete(@RequestParam final Long id) {
        commentService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(path = "/")
    public @ResponseBody String authentication() {
        return "Hello World!";
    }

}
