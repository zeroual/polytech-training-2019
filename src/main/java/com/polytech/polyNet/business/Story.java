package com.polytech.polyNet.business;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "story")
public class Story {

    @Id
    @Column(name = "id")
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "content")
    private String content;

    @OneToMany()
    @JoinColumn(name = "story_id")
    private List<Comment> comments = new ArrayList<>();

    public Story(String content) {

        this.content = content;
    }

    public Story() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public List<Comment> getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "Story{" +
                "content='" + content + '\'' +
                '}';
    }
}
