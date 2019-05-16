package com.polytech.polyNet.business;

public class Comment {
    private Long id;
    private String content;

    public Comment() {
    }

    public Comment(Long id, String content) {

        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
