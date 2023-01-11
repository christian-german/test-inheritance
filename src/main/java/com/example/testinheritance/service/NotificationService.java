package com.example.testinheritance.service;

import com.example.testinheritance.entity.Notification;

public interface NotificationService {
    Notification save(Notification notification);
    Notification findOne(Long id);
}
