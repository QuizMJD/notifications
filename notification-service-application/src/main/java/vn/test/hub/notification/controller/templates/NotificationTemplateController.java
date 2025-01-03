package vn.test.hub.notification.controller.templates;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.test.hub.notification.domain.NotificationTemplate;
import vn.test.hub.notification.service.NotificationService;
import vn.test.hub.notification.service.NotificationTemplateService;

import java.util.List;

@RestController
@RequestMapping("/api/notification-templates")
@RequiredArgsConstructor
public class NotificationTemplateController {
    private final NotificationTemplateService notificationTemplateService;
    @GetMapping
    public ResponseEntity<List<NotificationTemplate>> getAllNotificationTemplates() {
        List<NotificationTemplate> templates = notificationTemplateService.findAll();
        return ResponseEntity.ok(templates);
    }


}
