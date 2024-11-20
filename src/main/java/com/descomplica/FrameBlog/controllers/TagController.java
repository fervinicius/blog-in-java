package com.descomplica.FrameBlog.controllers;

import com.descomplica.FrameBlog.models.Tag;
import com.descomplica.FrameBlog.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/tags")
public class TagController {

    @Autowired
    private TagService tagService;

    @PostMapping("/save")
    private @ResponseBody Tag save(@RequestBody Tag tag) {
        return tagService.save(tag);
    }

    @GetMapping(path = "getAll")
    private @ResponseBody List<Tag> getAll() {
        return tagService.getAll();
    }

    @GetMapping(path = "/get")
    private @ResponseBody Tag get(@RequestParam final Long id) {
        return tagService.get(id);
    }

    @PostMapping(path = "/update")
    private @ResponseBody Tag update(@RequestParam final Long id, @RequestBody Tag tag) {
        return tagService.update(id, tag);
    }

    @DeleteMapping(path = "/delete")
    private ResponseEntity<?> delete(@RequestParam final Long id) {
        tagService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(path = "/")
    public @ResponseBody String authentication() {
        return "Hello World!";
    }

}
