package com.cadulox.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.cadulox.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
