package com.example.testinheritance.service;

import com.example.testinheritance.entity.Notification;
import com.example.testinheritance.entity.SmsNotification;
import com.example.testinheritance.repository.NotificationRepository;
import com.example.testinheritance.repository.SmsNotificationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepository notificationRepository;
    private final SmsNotificationRepository smsNotificationRepository;

    public NotificationServiceImpl(NotificationRepository notificationRepository, SmsNotificationRepository smsNotificationRepository) {
        this.notificationRepository = notificationRepository;
        this.smsNotificationRepository = smsNotificationRepository;
    }

    @Override
    public Notification save(Notification notification) {
        return notificationRepository.save(notification);
    }

    @Override
    public Notification findOne(Long id) {
        return notificationRepository.findById(id).orElseThrow();
    }
}
