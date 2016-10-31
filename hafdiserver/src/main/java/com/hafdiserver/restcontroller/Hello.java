package com.hafdiserver.restcontroller;

/**
 * Created by Birgit on 31.10.2016.
 */
public class Hello {

    private final Long id;
    private final String content;

    public Hello(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
