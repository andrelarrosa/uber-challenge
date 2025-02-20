package com.larrosa.email_service.core;

public record EmailRequest(String to, String subject, String body) {
}
