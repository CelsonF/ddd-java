package com.school.infrastructure.indication;

import com.school.application.indication.SendEmailIndication;
import com.school.domain.student.Student;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class SendEmailIndicatedJavaMail implements SendEmailIndication {

    private static  void sendEmailSmtp(Session session, String toEmail, String subject, String body) {

        try {
            MimeMessage message = new MimeMessage(session);

            //Set Message Headers
            message.addHeader("Content-type","text/HTML; charset=UTF-8");
            message.addHeader("format","flowed");
            message.addHeader("Content-Transfer-Encoding", "8bit");

            message.setFrom(new InternetAddress("no_reply@example.com","NoReply-JD"));

            message.setReplyTo(InternetAddress.parse("no_reply@example.com",false));

            message.setSubject(subject,"UTF-8");

            message.setText(body,"UTF-8");

            message.setSentDate(new Date());

            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail,false));

            System.out.println("Your Message is ready");

            Transport.send(message);

            System.out.println("Email sent successfully ! ! !");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    @Override
    public void sendEmail(Student indicated) {
        try {
            System.out.println("Simple Email Start");

            String smtpHostServer = "smtp.gmail.com";


            Properties props = System.getProperties();
            props.put("mail.smtp.host", smtpHostServer);

            Session session = Session.getInstance(props, null);

            sendEmailSmtp(session, indicated.getEmail(), "Simple Email with Java Mail", "Your was indicated for a programmer of classes.");

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
