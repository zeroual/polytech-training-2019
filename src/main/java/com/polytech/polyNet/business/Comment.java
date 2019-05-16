package com.polytech.polyNet.business;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "content")
    private String content;

    public Comment() {
    }

    public Comment(Integer id, String content) {

        this.id = id;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
