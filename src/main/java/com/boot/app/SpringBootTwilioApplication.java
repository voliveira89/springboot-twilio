package com.boot.app;

import com.twilio.twiml.TwiMLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTwilioApplication {

    public static void main(String[] args) throws TwiMLException {
        SpringApplication.run(SpringBootTwilioApplication.class, args);
    }
}