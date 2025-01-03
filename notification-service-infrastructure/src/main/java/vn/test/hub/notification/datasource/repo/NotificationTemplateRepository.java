package vn.test.hub.notification.datasource.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.test.hub.notification.datasource.entity.NotificationTemplateEntity;


public interface NotificationTemplateRepository extends JpaRepository<NotificationTemplateEntity, String>{
}
