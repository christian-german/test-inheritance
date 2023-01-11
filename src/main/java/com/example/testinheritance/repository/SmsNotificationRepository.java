package com.example.testinheritance.repository;

import com.example.testinheritance.entity.SmsNotification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsNotificationRepository extends JpaRepository<SmsNotification, Long> {
}
