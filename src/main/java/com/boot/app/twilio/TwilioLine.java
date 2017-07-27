package com.boot.app.twilio;

import com.twilio.http.TwilioRestClient;
import com.twilio.rest.api.v2010.account.CallCreator;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by e.Near on 2017
 */
@Service
public class TwilioLine {

    @Value("${twilio.number}")
    private String twilioNumber;

    @Value("${response.url}")
    private String responseUrl;

    private final TwilioRestClient restClient;

    @Autowired
    public TwilioLine(TwilioRestClient restClient) {
        this.restClient = restClient;
    }

    public void call(final String phoneNumber) throws URISyntaxException {
        CallCreator callCreator = new CallCreator(new PhoneNumber(phoneNumber), new PhoneNumber(twilioNumber), new URI(responseUrl));
        callCreator.create(restClient);
    }
}