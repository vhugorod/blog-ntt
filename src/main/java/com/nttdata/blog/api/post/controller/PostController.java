package com.nttdata.blog.api.post.controller;

import com.nttdata.blog.api.post.dto.request.PostRequest;
import com.nttdata.blog.api.post.dto.response.PostResponse;
import com.nttdata.blog.api.post.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/posts")
public class PostController {

    private final PostService postService;

    @PostMapping
    public PostResponse savePost(@RequestBody @Valid PostRequest postRequest) {
        return new PostResponse(postService.savePost(postRequest));
    }

}
