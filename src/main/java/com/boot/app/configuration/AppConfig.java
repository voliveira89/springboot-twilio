package com.boot.app.configuration;

import com.twilio.http.TwilioRestClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Vitor Oliveira on 2017
 */
@Configuration
public class AppConfig {

    @Bean
    public TwilioRestClient twilioRestClient(@Value("${twilio.account.sid}") String accountSid,
                                             @Value("${twilio.auth.token}") String authToken){
        return new TwilioRestClient.Builder(accountSid, authToken).build();
    }
}
