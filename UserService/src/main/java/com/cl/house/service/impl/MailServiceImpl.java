package com.cl.house.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cl.house.service.MailService;

@Service
public class MailServiceImpl implements MailService {
  
  @Autowired
  private JavaMailSender mailSender;
  
  @Value("${spring.mail.username}")
  private String from;
  
  public void sendSimpleMail(String subject,String content,String toEmail){
    SimpleMailMessage message = new SimpleMailMessage();
    message.setFrom(from);
    message.setTo(toEmail);
    message.setSubject(subject);
    message.setText(content);
    mailSender.send(message);
  }
  
}
