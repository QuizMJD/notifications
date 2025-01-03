package vn.test.hub.notification.datasource.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import vn.test.hub.notification.datasource.enums.NotificationStatus;

import java.time.LocalDateTime;

@Entity
@Table(name = "notifications")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Notification extends BaseEntity<String>{
    @Column(length = 255, name = "title")
    String title;

    @Column(name = "receiver_type")
    String receiverType;

    @Column(name = "receiver")
    String receiver;

    @Column(name = "template_id")
    String templateId;

    @Column(name = "expired_at")
    LocalDateTime expiredAt;

    @Column(name = "status")
    NotificationStatus status;
}