package vn.test.hub.notification.datasource.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "credentials")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Credential extends BaseEntity<String> {

    @Column(name = "type")
    Integer type;

    @Column(name = "identifier")
    String identifier;

    @Column(name = "password")
    String password;

    @Column(name = "server_url")
    String serverUrl;
}
