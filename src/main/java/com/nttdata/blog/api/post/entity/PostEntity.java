package com.nttdata.blog.api.post.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import org.hibernate.annotations.Parameter;

@Data
@Entity
@Table(name = "posts")
public class PostEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "post_sequence")
    @GenericGenerator(name = "post_sequence",
                      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
                      parameters = {
                            @Parameter(name = "post_sequence", value = "post_seq"),
                            @Parameter(name = "increment_size", value = "1")
                      }
    )
    private Long id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "autor", nullable = false)
    private String autor;

    @Lob
    @Column(name = "texto", nullable = false)
    private String texto;
}
