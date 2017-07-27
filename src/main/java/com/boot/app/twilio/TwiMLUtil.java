package com.boot.app.twilio;

import com.twilio.twiml.Say;
import com.twilio.twiml.TwiMLException;
import com.twilio.twiml.VoiceResponse;

/**
 * Created by Vitor Oliveira on 2017
 */
public class TwiMLUtil {

    public static String buildVoiceResponseAndDial(String message) throws TwiMLException {
        return new VoiceResponse.Builder()
                .say(new Say.Builder(message).voice(Say.Voice.ALICE).build())
                .build()
                .toXml();
    }
}
