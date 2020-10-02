package com.restexample.restfulpractice;

public class GreetingService {

    private final long id;
    private final String content;
    private static final String hw = "Hello, World!";
    public GreetingService(long id, String content  ) {
        this.id = id;
        this.content = (content.equals(hw)) ? "no name given so Hello world!" : content;
        System.out.println(content);
    }
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }



}
