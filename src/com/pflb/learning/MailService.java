package com.pflb.learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService <T> implements Consumer<MessageContentProvider<T>> {

    private final Map<String, List<T>> mailBox;

    public MailService() {
        mailBox = new HashMap<>() {
            @Override
            public List<T> get(Object key) {
                return computeIfAbsent((String) key, k -> new ArrayList<>());
            }
        };
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(MessageContentProvider<T> mailMessage) {
        mailBox.computeIfAbsent(mailMessage.getTo(), k -> new ArrayList<>())
                .add(mailMessage.getContent());
    }
}
