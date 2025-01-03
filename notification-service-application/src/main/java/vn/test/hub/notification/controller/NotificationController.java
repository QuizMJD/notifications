package vn.test.hub.notification.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.test.hub.notification.dto.reponse.APIResponse;
import vn.test.hub.notification.domain.Notification;
import vn.test.hub.notification.service.NotificationService;

import java.util.List;

@RequestMapping("/api/v1/notifications")
@RestController
@RequiredArgsConstructor
public class NotificationController {
    private final NotificationService notificationService;

    @GetMapping
    public ResponseEntity<APIResponse<List<Notification>>> getNotifications() {
        return ResponseEntity.ok(
                APIResponse.<List<Notification>>builder()
                        .status(1)
                        .message("Success")
                        .data(notificationService.findAll())
                        .build()
        );
    }
}
