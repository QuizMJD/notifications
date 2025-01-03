package vn.test.hub.notification.dto.reponse;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class APIResponse<T> {
    private int status;
    private String message;
    private T data;
}
