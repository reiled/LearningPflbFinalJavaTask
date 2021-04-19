package com.pflb.learning;

public class Salary extends AbstractMessage<Integer> {

    public Salary(String from, String to, Integer content) {
        super(from, to, content);
    }
}
