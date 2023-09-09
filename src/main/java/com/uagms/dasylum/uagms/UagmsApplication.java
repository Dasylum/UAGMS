package com.uagms.dasylum.uagms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.uagms.dasylum.uagms.repository", "com.uagms.dasylum.uagms.service",
        "com.uagms.dasylum.uagms.controller", "com.uagms.dasylum.uagms.model"})
public class UagmsApplication {

    public static void main(final String[] args) {
        SpringApplication.run(UagmsApplication.class, args);
    }

}
