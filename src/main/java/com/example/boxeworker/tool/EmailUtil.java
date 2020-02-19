package com.example.boxeworker.tool;

import com.sun.mail.util.MailSSLSocketFactory;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.GeneralSecurityException;
import java.util.Properties;


public class EmailUtil {

    public static String getEmailUtil(String email, String username) throws GeneralSecurityException {
        // 收件人电子邮箱
        String to = email;


        // 发件人电子邮箱
        String from = "859476472@qq.com";

        // 指定发送邮件的主机为 smtp.qq.com
        String host = "smtp.qq.com";  //QQ 邮件服务器smtp.qq.com

        // 获取系统属性
        Properties properties = System.getProperties();

        // 设置邮件服务器
        properties.setProperty("mail.smtp.host", host);

        properties.put("mail.smtp.auth", "true");
        MailSSLSocketFactory sf = new MailSSLSocketFactory();
        sf.setTrustAllHosts(true);
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.ssl.socketFactory", sf);
        // 获取默认session对象
        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("859476472@qq.com", "ezelgytrrrnbbdcj"); //发件人邮件用户名、密码
            }
        });
        int arr=(int)(Math.random()*90001+9999);
        try {
            // 创建默认的 MimeMessage 对象
            MimeMessage message = new MimeMessage(session);

            // Set From: 头部头字段
            message.setFrom(new InternetAddress(from));

            // Set To: 头部头字段
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: 头部头字段
            message.setSubject("云纸箱-找回密码");
            String str = "云纸箱用户："+username+"，您好\r\n" +
                    "\r\n" +
                    "  您正在找回密码操作，此操作的验证码是"+arr+"，请在两分钟内将该验证码回填到验证页面，完成身份验证。\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "  欢迎您使用云纸箱安全中心，保护您的账户安全。\r\n" +
                    "\r\n" +
                    "  如果您有任何问题或建议，请拨打服务热线：xxx-xxx-xxxx\r\n";

            // 设置消息体
            message.setText(str);

            // 发送消息
            Transport.send(message);
            System.out.println("邮箱验证码发送成功");
        } catch (MessagingException mex) {
            mex.printStackTrace();
            return null;
        }
        return arr+"";
    }
}
