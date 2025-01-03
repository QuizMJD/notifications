package vn.test.hub.notification.datasource.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Entity
@Table(name = "notification_templates")
@Getter
@Setter

public class NotificationTemplateEntity {
    @Id
    @Column(length = 36)
    private String id;

    @Column(nullable = false)
    private int type;

    @Column(name = "sender_id", nullable = false, length = 36)
    private String senderId;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(columnDefinition = "TEXT")
    private String reason;

    @Column(nullable = false)
    private boolean deleted = false;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "created_by", nullable = false, length = 255)
    private String createdBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "updated_by", length = 255)
    private String updatedBy;

}
