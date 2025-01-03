package vn.test.hub.notification.controller.templates;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notification-templates")
public class NotificationTemplateController {
    @GetMapping
    public ResponseEntity<List<NotificationTemplate>> getAllNotificationTemplates() {
        List<NotificationTemplate> templates = notificationTemplateService.getAllNotificationTemplates();
        return ResponseEntity.ok(templates);
    }


}
