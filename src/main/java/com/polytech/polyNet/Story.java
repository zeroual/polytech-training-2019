package com.polytech.polyNet;

public class Story {
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
