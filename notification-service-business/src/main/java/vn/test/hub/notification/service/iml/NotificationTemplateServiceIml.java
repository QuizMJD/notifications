package vn.test.hub.notification.service.iml;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.test.hub.notification.domain.NotificationTemplate;
import vn.test.hub.notification.repo.NotificationRepository;
import vn.test.hub.notification.repo.NotificationTemplateRepository;
import vn.test.hub.notification.service.NotificationTemplateService;

import java.util.List;
@Service
@RequiredArgsConstructor
public class NotificationTemplateServiceIml implements NotificationTemplateService {
    private final NotificationTemplateRepository notificationTemplateRepository;

    @Override
    public List<NotificationTemplate>findAll() {
        return notificationTemplateRepository.findAll();
    }
}

//    @Override
//    public List<NotificationTemplate> findAll() {
//        return notificationRepository.findAll();
//    }
//}
