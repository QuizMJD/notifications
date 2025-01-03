package vn.test.hub.notification.datasource.repo.iml;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import vn.test.hub.notification.domain.Notification;
import vn.test.hub.notification.mapper.NotificationMapper;
import vn.test.hub.notification.repo.NotificationRepository;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class NotificationRepositoryIml implements NotificationRepository {
    private final vn.test.hub.notification.datasource.repo.NotificationRepository jpANotificationRepository;
    private final NotificationMapper notificationMapper;

    @Override
    public List<Notification>findAll() {
        return jpANotificationRepository.findAll().stream()
                .map(notificationMapper::toNotification).toList();
    }



}
