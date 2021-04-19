package com.pflb.learning;

public class MailMessage extends AbstractMessage<String> {

    public MailMessage(String from, String to, String content) {
        super(from, to, content);
    }
}
