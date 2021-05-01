package com.mycompany.part6.pojo;

import org.springframework.stereotype.Component;

@Component
public class Message {

    private String message;

    public Message() {
        message = "This is part 6";
    }

    public Message(String mes) {
        this.message = mes;
    }

    public String getMes() {
        return message;
    }

    public void setMes(String mes) {
        this.message = mes;
    }

    @Override
    public String toString() {
        return "Message{" +
                "mes='" + message + '\'' +
                '}';
    }
}
