package vn.test.hub.notification.datasource.enums;

import lombok.Getter;

@Getter
public enum NotificationStatus {
    SENT("SENT"),
    DELIVERED("DELIVERED"),
    FAILED("FAILED");

    private final String value;
    NotificationStatus(String value) {
        this.value = value;
    }
}
