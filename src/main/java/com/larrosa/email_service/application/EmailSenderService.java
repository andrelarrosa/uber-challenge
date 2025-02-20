package com.larrosa.email_service.application;

import com.larrosa.email_service.adapters.EmailSenderGateway;
import com.larrosa.email_service.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailSenderGateway) {
        this.emailSenderGateway = emailSenderGateway;
    }

    @Override
    public void SendEmail(String to, String subject, String body) {
        this.emailSenderGateway.SendEmail(to, subject, body);
    }
}
