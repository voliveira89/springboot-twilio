package com.boot.app.controller;

import com.boot.app.twilio.TwilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.net.URISyntaxException;

/**
 * Created by Vitor Oliveira on 2017
 */
@Controller
public class CallController {

    private final TwilioService twilioService;

    @Autowired
    public CallController(TwilioService twilioService) {
        this.twilioService = twilioService;
    }

    @GetMapping(value = "call/{numberToCall}")
    public void call(@PathVariable String numberToCall) throws URISyntaxException {
        twilioService.call(numberToCall);
    }
}
