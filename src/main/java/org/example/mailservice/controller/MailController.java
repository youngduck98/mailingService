package org.example.mailservice.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.mailservice.service.EmailSender;
import org.example.mailservice.service.EmailSenderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/apiV2")
@RequiredArgsConstructor
public class MailController {
    EmailSender emailSender;

    @Autowired
    public MailController(EmailSenderImpl emailSender){
        this.emailSender = emailSender;
    }

    @PostMapping("/realTimeMail")
    public void sendMailToRealTime(){
        emailSender.sendEmailForAuth("test@naver.com", "test", "test");
    }
}
