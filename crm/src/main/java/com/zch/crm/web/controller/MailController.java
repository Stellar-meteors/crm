package com.zch.crm.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.zch.crm.service.impl.EmployeeServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.Properties;

/**
 * @Description: 邮件发送
 * @Author: 张楚涵
 * @Date: 2019/9/12 0012 10:35
 * @version:1.0.0
 */
@Controller
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private JavaMailSender javaMailSender;//在spring中配置的邮件发送的bean

    private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @PostMapping(value = "/email",produces = "text/html; charset=utf-8")
    public void Email(String email,String name){
        MimeMessage mMessage=javaMailSender.createMimeMessage();//创建邮件对象
        MimeMessageHelper mMessageHelper;
        Properties prop = new Properties();
        String from;
        try {
            //从配置文件中拿到发件人邮箱地址
            prop.load(this.getClass().getClassLoader().getResourceAsStream("mail.properties"));
            from = prop.get("mail.smtp.username")+"";
            mMessageHelper=new MimeMessageHelper(mMessage,true);
            mMessageHelper.setFrom(from);//发件人邮箱
            mMessageHelper.setFrom(new InternetAddress(from, "CRM人事部", "UTF-8"));
            mMessageHelper.setTo(email);//收件人邮箱
            mMessageHelper.setSubject(name+"收");//邮件的主题
            mMessageHelper.setSubject("人事管理");//邮件的主题
            mMessageHelper.setText("<p>您已被添加到CRM人事管理系统,望后续工作努力</p><br/>" +
                    /*"<a href='https://blog.csdn.net/qq_41840847'>打开我的博客主页</a><br/>" +*/
                    "<img src='cid:fengye'>",true);//邮件的文本内容，true表示文本以html格式打开
            javaMailSender.send(mMessage);//发送邮件
        } catch (IOException e) {
            e.printStackTrace();
            logger.info("发送邮件异常"+e.getMessage());
        } catch (MessagingException e) {
            e.printStackTrace();
            logger.info("发送邮件异常"+e.getMessage());
        }
    }
}
