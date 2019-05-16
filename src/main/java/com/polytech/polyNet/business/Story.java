package com.polytech.polyNet.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "STORY")
public class Story {

    @Column(name = "CONTENT")
    private String content;

    public Story(String content) {

        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Story{" +
                "content='" + content + '\'' +
                '}';
    }
}
