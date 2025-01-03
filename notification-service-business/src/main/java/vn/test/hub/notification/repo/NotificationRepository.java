package vn.test.hub.notification.repo;
import vn.test.hub.notification.domain.Notification;

import java.util.List;


public interface NotificationRepository {
    List<Notification> findAll();

}
