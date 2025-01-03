create table if not exists notification_templates (
                                                      id varchar(36) primary key,

                                                      type int not null, -- 1 sms, 2 email
                                                      sender_id varchar(36) not null,
                                                      name varchar(255) not null,
                                                      content text not null, -- OTP của bạn là: {{}}
                                                      reason text null,
                                                      deleted boolean not null default false,
                                                      created_at timestamp not null default CURRENT_TIMESTAMP,
                                                      created_by varchar(255) not null,
                                                      updated_at timestamp null,
                                                      updated_by varchar(255) null
);

create table if not exists notifications (
                                             id varchar(36) primary key,

                                             title varchar(255) not null,
                                             receiver_type varchar(36) not null,
                                             receiver varchar(255) not null,

                                             template_id varchar(36) not null, -- foreign key
                                             content text not null,
                                             expired_at timestamp not null,
                                             status int not null, -- success(0), failed(1), etc...

                                             deleted boolean not null default false,
                                             created_at timestamp not null default CURRENT_TIMESTAMP,
                                             created_by varchar(255) not null,
                                             updated_at timestamp null,
                                             updated_by varchar(255) null,

                                             foreign key (template_id) references notification_templates(id)
);

-- receiver_types
#     user-id 012345678910
#     sms 0123456789
#     email html
#     etc...
# TODO: RENAME THIS TABLE

create table if not exists credentials(
                                          id varchar(36) primary key,

                                          type int not null, -- sms, mail
                                          identifier varchar(255) not null,
                                          password varchar(255) not null,
                                          server_uri varchar(255) not null,

                                          deleted boolean not null default false,
                                          created_at timestamp not null default CURRENT_TIMESTAMP,
                                          created_by varchar(255) not null,
                                          updated_at timestamp null,
                                          updated_by varchar(255) null
);

create table if not exists senders(
                                      id varchar(36) primary key,

                                      code varchar(255) not null,
                                      credential_id varchar(36) not null, -- foreign key to credentials

                                      deleted boolean not null default false,
                                      created_at timestamp not null default CURRENT_TIMESTAMP,
                                      created_by varchar(255) not null,
                                      updated_at timestamp null,
                                      updated_by varchar(255) null,

                                      foreign key (credential_id) references credentials(id)
);
ALTER TABLE notifications MODIFY id BIGINT UNSIGNED AUTO_INCREMENT;
CREATE TABLE notification_logs (
                                   id BIGINT PRIMARY KEY AUTO_INCREMENT,
                                   notification_id BIGINT UNSIGNED NOT NULL, -- Đảm bảo kiểu dữ liệu phù hợp với notifications.id
                                   type VARCHAR(50) NOT NULL,               -- Loại thông báo (SMS, email, app, web)
                                   status VARCHAR(50) NOT NULL,             -- Trạng thái gửi (success, failed, pending, retry)
                                   send_time DATETIME,                      -- Thời gian gửi thông báo
                                   error_message TEXT DEFAULT NULL,         -- Lỗi gặp phải (nếu có)
                                   created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
                                   FOREIGN KEY (notification_id) REFERENCES notifications(id) ON DELETE CASCADE
);
