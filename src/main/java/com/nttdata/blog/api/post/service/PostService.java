package com.nttdata.blog.api.post.service;

import com.nttdata.blog.api.post.dto.request.PostRequest;
import com.nttdata.blog.api.post.entity.PostEntity;
import com.nttdata.blog.api.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;

    public PostEntity savePost(PostRequest postRequest) {

        PostEntity post = PostEntity.builder()
                .titulo(postRequest.getTitulo())
                .autor(postRequest.getAutor())
                .texto(postRequest.getTexto())
                .build();

        return postRepository.save(post);
    }
}
