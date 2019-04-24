package com.cl.house.service;


public interface  MailService {

	/**
	 * @param string
	 * @param content
	 * @param email
	 */
	void sendSimpleMail(String subject,String content,String toEmail);
  
  
}
