package com.nttdata.blog.api.post.repository;

import com.nttdata.blog.api.post.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity, Long> {

}
