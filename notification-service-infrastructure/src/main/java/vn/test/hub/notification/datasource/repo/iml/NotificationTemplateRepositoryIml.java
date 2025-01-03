package vn.test.hub.notification.datasource.repo.iml;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import vn.test.hub.notification.datasource.repo.NotificationTemplateRepository;
import vn.test.hub.notification.domain.NotificationTemplate;
import vn.test.hub.notification.mapper.NotificationMapper;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class NotificationTemplateRepositoryIml implements NotificationTemplateRepository {
    private final vn.test.hub.notification.datasource.repo.NotificationTemplateRepository notificationTemplateRepository;
    private final NotificationMapper notificationMapper;


    @Override
    public List<NotificationTemplate> findAll() {
        return notificationTemplateRepository.findAll().stream()
                .map(notificationMapper::toNotificationTemplateEntity).toList();
    }
}
