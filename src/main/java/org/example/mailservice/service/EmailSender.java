package org.example.mailservice.service;

import java.util.List;

public interface EmailSender {
    void sendEmailForAuth(String address, String title, String content);

    void sendEmailToPerson(String address, String title, String content);

    void sendEmailToPeople(List<String> addresses, String title, String content);
}
