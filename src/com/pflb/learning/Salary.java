package com.pflb.learning;

public class Salary extends MailMessage {

    private final Integer salary;

    public Salary(String from, String to, int salary) {
        super(from, to, "");
        this.salary = salary;
    }

    public Integer getSalary() {
        return salary;
    }
}
