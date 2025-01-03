package vn.test.hub.notification.service.iml;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.test.hub.notification.domain.Notification;
import vn.test.hub.notification.repo.NotificationRepository;
import vn.test.hub.notification.service.NotificationService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NotificationServiceIml implements NotificationService {
    private final NotificationRepository notificationRepository;
    @Override
    public List<Notification>findAll() {
        return notificationRepository.findAll();
    }

}
