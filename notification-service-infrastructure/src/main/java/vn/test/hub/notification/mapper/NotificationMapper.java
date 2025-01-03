package vn.test.hub.notification.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import vn.test.hub.notification.datasource.entity.NotificationEntity;
import vn.test.hub.notification.domain.Notification;

import java.sql.Timestamp;

@Mapper(componentModel = "spring")
public interface NotificationMapper {
    @Mapping(target = "createdAt", expression = "java(mapTimestampToLong(notificationEntity.getCreatedAt()))"
    )
    @Mapping(target = "updatedAt", expression = "java(mapTimestampToLong(notificationEntity.getDeletedAt()))")
    @Mapping(target = "id", source = "id")
    @Mapping(target = "content", source = "content")
    @Mapping(target = "isRead", source = "isRead")
    @Mapping(target = "userId", source = "userId")
    @Mapping(target = "type", source = "type")
    @Mapping(target = "link", source = "link")
    @Mapping(target = "deleted", source = "deleted")
    Notification toNotification(NotificationEntity notificationEntity);
    @Mapping(target = "createdAt", expression = "java(mapLongToTimestamp(notification.getCreatedAt()))")
    @Mapping(target = "deletedAt", expression = "java(mapLongToTimestamp(notification.getDeletedAt()))")
    @Mapping(target = "id", source = "id")
    @Mapping(target = "content", source = "content")
    @Mapping(target = "isRead", source = "isRead")
    @Mapping(target = "userId", source = "userId")
    @Mapping(target = "type", source = "type")
    @Mapping(target = "link", source = "link")
    @Mapping(target = "deleted", source = "deleted")

    NotificationEntity toEntity(Notification notification);
    default Long mapTimestampToLong(Timestamp timestamp) {
        return timestamp != null ? timestamp.getTime() : null;
    }

    default Timestamp mapLongToTimestamp(Long timestamp) {
        return timestamp != null ? new Timestamp(timestamp) : null;
    }
}
