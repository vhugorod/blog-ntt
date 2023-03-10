package com.nttdata.blog.api.post.dto.response;

import com.nttdata.blog.api.post.entity.PostEntity;
import lombok.Data;

@Data
public class PostResponse {

    private Long id;

    private String titulo;

    private String autor;

    private String texto;

    public PostResponse(PostEntity post) {
        this.id = post.getId();
        this.titulo = post.getTitulo();
        this.autor = post.getAutor();
        this.texto = post.getTexto();
    }

}
