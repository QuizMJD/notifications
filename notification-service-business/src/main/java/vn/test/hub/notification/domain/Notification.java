package vn.test.hub.notification.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Notification {
    private String id;
    private String content;
    private Byte isRead;
    private Long createdAt;
    private Long updatedAt; // Đã thêm trường updatedAt
    private Long deletedAt;
    private Long userId;
    private String type;
    private String link;
    private Byte deleted;

//    private String id;
//    private String content;
//    private Byte isRead;
//    private String createdAt;
//    private Long userId;
//    private String type;
//    private String link;

}