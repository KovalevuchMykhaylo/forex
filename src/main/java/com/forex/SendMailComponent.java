package com.forex;

import org.springframework.stereotype.Component;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Component
public class SendMailComponent {

    public boolean sendMail(String content, String email, String mailBody) {
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.starttls.enable", "true");
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.port", "465");
        properties.setProperty("mail.smtp.host", "smtp.gmail.com");
        properties.setProperty("mail.smtp.socketFactory.port", "465");
        properties.setProperty("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        Session session = Session.getDefaultInstance(properties,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(
                                "tormexalliance@gmail.com", "QWASZXERDFCV1234");
                    }
                });
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("tormexalliance@gmail.com"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(
                    email));
            message.setSubject(content, "UTF-8");
            message.setText(mailBody);
            Transport.send(message);
        } catch (MessagingException е) {
            е.printStackTrace();
            return false;
        }

        return true;
    }

}
