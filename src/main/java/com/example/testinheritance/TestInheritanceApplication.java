package com.example.testinheritance;

import com.example.testinheritance.entity.EmailNotification;
import com.example.testinheritance.entity.SmsNotification;
import com.example.testinheritance.service.NotificationService;
import com.example.testinheritance.service.SmsNotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
@Slf4j
public class TestInheritanceApplication implements CommandLineRunner {

    private final NotificationService notificationService;
    private final SmsNotificationService smsNotificationService;

    public TestInheritanceApplication(NotificationService notificationService, SmsNotificationService smsNotificationService) {
        this.notificationService = notificationService;
        this.smsNotificationService = smsNotificationService;
    }

    public static void main(String[] args) {
        SpringApplication.run(TestInheritanceApplication.class, args);
    }

    @Override
    public void run(String... args) {
        SmsNotification smsNotification = new SmsNotification();
        smsNotification.setPhoneNumber("1234567890");
        smsNotification.setFirstName("John");
        smsNotification.setLastName("Doe");
        smsNotification.setCreatedOn(new Date());
        notificationService.save(smsNotification);

        EmailNotification emailNotification = new EmailNotification();
        emailNotification.setEmailAddress("john.doe@yopmail.com");
        emailNotification.setFirstName("John");
        emailNotification.setLastName("Doe");
        emailNotification.setCreatedOn(new Date());
        notificationService.save(emailNotification);

        SmsNotification smsNotification2 = new SmsNotification();
        smsNotification2.setPhoneNumber("99999999");
        smsNotification2.setFirstName("Jane");
        smsNotification2.setLastName("Doe");
        smsNotification2.setCreatedOn(new Date());
        notificationService.save(smsNotification2);

        log.info(notificationService.findOne(902L).toString());
        log.info(notificationService.findOne(903L).toString());
        log.info(smsNotificationService.findOne(902L).toString());
    }
}
