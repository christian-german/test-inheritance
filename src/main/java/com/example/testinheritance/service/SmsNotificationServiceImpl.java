package com.example.testinheritance.service;

import com.example.testinheritance.entity.SmsNotification;
import com.example.testinheritance.repository.SmsNotificationRepository;
import org.springframework.stereotype.Service;

@Service
public class SmsNotificationServiceImpl implements SmsNotificationService {

    private final SmsNotificationRepository smsNotificationRepository;

    public SmsNotificationServiceImpl(SmsNotificationRepository smsNotificationRepository) {
        this.smsNotificationRepository = smsNotificationRepository;
    }

    public SmsNotification findOne(Long id) {
        return smsNotificationRepository.findById(id).orElseThrow();
    }
}
