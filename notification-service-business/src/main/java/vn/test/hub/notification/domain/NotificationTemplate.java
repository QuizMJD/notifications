package vn.test.hub.notification.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class NotificationTemplate {
    private String id;

    private int type;

    private String senderId;

    private String name;

    private String content;

    private String reason;

    private boolean deleted = false;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;



}
