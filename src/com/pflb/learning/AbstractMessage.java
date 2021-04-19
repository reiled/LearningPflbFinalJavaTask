package com.pflb.learning;

public abstract class AbstractMessage<T> implements MessageContentProvider<T> {

    protected String from;
    protected String to;
    protected T content;

    protected AbstractMessage(String from, String to, T content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public T getContent() {
        return content;
    }
}
