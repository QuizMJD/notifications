package vn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"vn.test.hub.*"})
@EnableJpaRepositories(basePackages = {"vn.test.hub.notification.datasource.repo"})
@EntityScan(basePackages = "vn.test.hub.notification.datasource.entity")
public class NotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }
}