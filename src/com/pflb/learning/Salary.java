package com.pflb.learning;

public class Salary extends AbstractMailMessage implements MessageContentProvider<Integer> {

    private final Integer content;

    public Salary(String from, String to, Integer content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    @Override
    public Integer getContent() {
        return content;
    }
}
