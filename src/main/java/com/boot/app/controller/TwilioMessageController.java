package com.boot.app.controller;

import com.boot.app.twilio.TwiMLUtil;
import com.twilio.twiml.TwiMLException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Vitor Oliveira on 2017
 */
@RestController
public class TwilioMessageController {

    @Value("${response.message}")
    private String responseMessage;

    @PostMapping(value = "message", produces = "application/xml")
    public ResponseEntity<String> message() throws TwiMLException {

        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_XML);

        return new ResponseEntity<>(
                TwiMLUtil.buildVoiceResponseAndDial(responseMessage),
                httpHeaders,
                HttpStatus.OK
        );
    }
}