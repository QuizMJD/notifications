package vn.test.hub.notification.repo;

import vn.test.hub.notification.domain.Notification;
import vn.test.hub.notification.domain.NotificationTemplate;

import java.util.List;

public interface NotificationTemplateRepository {
    List<NotificationTemplate> findAll();
}
