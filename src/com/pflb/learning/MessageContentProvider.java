package com.pflb.learning;

public interface MessageContentProvider<T> {
    public String getFrom();
    public String getTo();
    public T getContent();
}
