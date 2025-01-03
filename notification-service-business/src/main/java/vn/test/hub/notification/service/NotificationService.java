package vn.test.hub.notification.service;

import org.springframework.stereotype.Service;
import vn.test.hub.notification.domain.Notification;

import java.util.List;

public interface NotificationService {
    List<Notification> findAll();
}
