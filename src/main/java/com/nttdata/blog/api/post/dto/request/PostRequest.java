package com.nttdata.blog.api.post.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostRequest {

    @NotBlank(message = "Titulo é um parametro obrigatorio.")
    private String titulo;

    @NotBlank(message = "Autor é um parametro obrigatorio.")
    private String autor;

    @NotBlank(message = "Texto é um parametro obrigatorio.")
    private String texto;
}
