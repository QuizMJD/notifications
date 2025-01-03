package vn.test.hub.notification.datasource.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
@FieldDefaults(level = AccessLevel.PRIVATE)
@EntityListeners(BaseEntity.AuditListener.class)
public class BaseEntity<ID> {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(updatable = false, nullable = false, length = 36, name = "id")
    ID id;

    @Column(name = "deleted")
    Boolean deleted;

    @Column(name = "created_at")
    LocalDateTime createdAt;

    @Column(name = "created_by")
    String createdBy;

    @Column(name = "updated_at")
    LocalDateTime updatedAt;

    @Column(name = "updated_by")
    String updatedBy;


    /**
     * Static child class, which class config audit of entity
     */
    static class AuditListener {

        @PrePersist
        public void setCreatedAtAndCreatedBy(BaseEntity<?> entity) {
            entity.setCreatedAt(LocalDateTime.now());
            entity.setCreatedBy(getCurrentUser());
            entity.setDeleted(Boolean.FALSE);
        }

        @PreUpdate
        public void setUpdatedAtAndUpdatedBy(BaseEntity<?> entity) {
            entity.setUpdatedAt(LocalDateTime.now());
            entity.setUpdatedBy(getCurrentUser());
        }

        public String getCurrentUser() {
            return "longtdd";
        }
    }
}


