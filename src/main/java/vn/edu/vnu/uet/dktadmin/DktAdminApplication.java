package vn.edu.vnu.uet.dktadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DktAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(DktAdminApplication.class, args);
    }

}
