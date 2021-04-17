package com.pflb.learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService <T> implements Consumer<MailMessage> {

    private final Map<String, List<T>> mailBox;

    public MailService() {
        mailBox = new HashMap<>() {
            @Override
            public List<T> get(Object key) {
                return computeIfAbsent((String) key, k -> new ArrayList<>());
            }
        };
    }

    @Override
    public void accept(MailMessage mailMessage) {
        if (mailMessage.getClass().equals(MailMessage.class)) {
            mailBox.computeIfAbsent(mailMessage.getTo(), k -> new ArrayList<>())
                    .add((T) mailMessage.getContent());
        } else if (mailMessage.getClass().equals(Salary.class)) {
            mailBox.computeIfAbsent(mailMessage.getTo(), k -> new ArrayList<>())
                    .add((T) ((Salary)mailMessage).getSalary());
        } else {
            throw new RuntimeException("Тип сообщения не поддерживается");
        }
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }
}
