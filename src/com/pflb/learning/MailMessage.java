package com.pflb.learning;

public class MailMessage extends AbstractMailMessage implements MessageContentProvider<String> {

    private final String content;

    public MailMessage(String from, String to, String content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
