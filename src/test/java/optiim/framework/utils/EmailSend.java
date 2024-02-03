package optiim.framework.utils;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;

public class EmailSend {
    static String from = "hakan.guner@pia-team.com";
    static String to = "axel.schmitz@pia-team.com";
    static String to2 = "hakan.guner@pia-team.com";
    static String to3 = "serdar.kayis@pia-team.com";
    //static String to = "sezai.celik@optiim.com";

    private static boolean SEND_MAIL = false;

    public EmailSend() {
        log.info("EmailSend initiated");
    }

    public static void sendMailGmail(String subject, String body) {
        if (SEND_MAIL) {
            // mail host bilgisi
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "465");
//			props.put("mail.smtp.port", "587");
            props.put("mail.smtp.ssl.enable", "true");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
            Session session = Session.getDefaultInstance(props, null);

            // Get the Session object.// and pass username and password
            Session sessionx = Session.getInstance(props, new Authenticator() {

                protected PasswordAuthentication getPasswordAuthentication() {

                    return new PasswordAuthentication("hakan.guner@pia-team.com", "Avis2022");

                }

            });
            // mail içeriği
            Message msg = new MimeMessage(session);
            try {
                msg.setFrom(new InternetAddress(from));
                msg.setSubject(subject);
                msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to2));
                msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to3));
                //msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to4));
                //msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to6));
                //msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to7));
                //msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to8));
                // msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to9));
                // msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to10));
                //msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to11));
                //msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to12));
                //msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to13));
                // msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to14));
                //msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to15));
                //msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to16));
                //msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to17));
                //msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to18));
                //msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to19));

                // msg.setRecipient(Message.RecipientType.CC, new
                // InternetAddress(to));


//                if (AutomationVariables.EMAILS != null) {
//                    msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to3));
//                    for (String mails : AutomationVariables.EMAILS)
//                        msg.addRecipient(Message.RecipientType.TO, new InternetAddress(mails));
//                }
                BodyPart messageBodyPart = new MimeBodyPart();
                messageBodyPart.setContent(body, "text/html");

                Multipart multipart = new MimeMultipart();
                multipart.addBodyPart(messageBodyPart);

//                }

                msg.setContent(multipart);
//				Transport.send(msg);
                Transport.send(msg, "hakan.guner@pia-team.com", "Avis2022");
                log.info("Mail sent.");
            } catch (Exception e) {
                log.error("Mail did not sent. : " + e.toString());
            }
        }
    }

    public static void mailGonder(String subject, String body) {
        if (SEND_MAIL) {

            // mail host bilgisi
            Properties props = new Properties();
            props.put("mail.smtp.host", "pia-team.com");
            Session session = Session.getDefaultInstance(props, null);

            // mail içeriği
            Message msg = new MimeMessage(session);
            try {
                msg.setFrom(new InternetAddress(from));
                msg.setSubject(subject);
                msg.setRecipient(Message.RecipientType.TO, new InternetAddress(to));

                // msg.setRecipient(Message.RecipientType.CC, new
                // InternetAddress(to));


//                if (AutomationVariables.EMAILS != null) {
//                    msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to3));
//                    for (String mails : AutomationVariables.EMAILS)
//                        msg.addRecipient(Message.RecipientType.TO, new InternetAddress(mails));
//                }
                BodyPart messageBodyPart = new MimeBodyPart();
                messageBodyPart.setContent(body, "text/html");

                Multipart multipart = new MimeMultipart();
                multipart.addBodyPart(messageBodyPart);


//                }

                msg.setContent(multipart);
                Transport.send(msg);
                log.info("Mail gönderildi");
            } catch (Exception e) {
                log.error("Mail gönderilemedi. : " + e.toString());
            }
        }
    }
}
