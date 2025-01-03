package vn.test.hub.notification.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import vn.test.hub.notification.datasource.entity.Notification;
import vn.test.hub.notification.datasource.enums.NotificationStatus;

@Mapper(componentModel = "spring")
public interface NotificationMapper {

    @Mapping(target = "status", source = "status", qualifiedByName = "enumToString")
    vn.test.hub.notification.domain.Notification toDto(Notification notification);

    @Mapping(target = "status", source = "status", qualifiedByName = "stringToEnum")
    Notification toEntity(vn.test.hub.notification.domain.Notification notification);

    @Named("enumToString")
    static String enumToString(NotificationStatus status) {
        return status.getValue();
    }

    @Named("stringToEnum")
    static NotificationStatus stringToEnum(String status) {
        return status != null ? NotificationStatus.valueOf(status) : null;
    }
}
