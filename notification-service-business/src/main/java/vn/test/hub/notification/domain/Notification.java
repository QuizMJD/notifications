package vn.test.hub.notification.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Notification {

    String id;

    String title;

    String receiverType;

    String receiver;

    String templateId;

    LocalDateTime expiredAt;

    String status;

    LocalDateTime createdAt;

    LocalDateTime updatedAt;

    Boolean deleted;

    String createdBy;

    String updatedBy;
}