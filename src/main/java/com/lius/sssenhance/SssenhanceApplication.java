package com.lius.sssenhance;

import com.lius.sssenhance.user.controller.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SssenhanceApplication {
    private static final Logger logger = LoggerFactory.getLogger(SssenhanceApplication.class);


    public static void main(String[] args) {

        SpringApplication.run(SssenhanceApplication.class, args);
        logger.info("SssenhanceApplication Started Succesfully!");
    }
}
