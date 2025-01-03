package vn.test.hub.notification.datasource.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.test.hub.notification.datasource.entity.NotificationEntity;
public interface NotificationRepository extends JpaRepository<NotificationEntity, String> {

}
