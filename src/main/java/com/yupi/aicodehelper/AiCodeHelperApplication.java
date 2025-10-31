package com.yupi.aicodehelper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AiCodeHelperApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(AiCodeHelperApplication.class);
        // 设置默认 profile
        app.setAdditionalProfiles("local");
        app.run(args);
    }

}
