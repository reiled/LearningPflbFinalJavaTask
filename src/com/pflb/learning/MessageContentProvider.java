package com.pflb.learning;

public interface MessageContentProvider<T> {

    String getFrom();
    String getTo();
    T getContent();
}
