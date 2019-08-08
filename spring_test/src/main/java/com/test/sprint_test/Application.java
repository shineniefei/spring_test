
package com.test.sprint_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class Application {

    private static Logger logger = LoggerFactory.getLogger(Application.class);

    @RequestMapping(value = "/")
    public String index() {

        logger.info("Application index Response: Hello Spring Boot");

        return "Hello Spring Boot";
    }

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
        logger.info("============= Start ON SpringBoot Success =============");
    }

}
