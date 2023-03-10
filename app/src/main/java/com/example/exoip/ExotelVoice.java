package com.example.exoip;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.exotel.voice.Call;
import com.exotel.voice.CallListener;
import com.exotel.voice.ExotelVoiceClient;
import com.exotel.voice.ExotelVoiceClientEventListener;
import com.exotel.voice.ExotelVoiceClientSDK;
import com.exotel.voice.ExotelVoiceError;
import com.exotel.voice.LogLevel;

import java.util.Date;

public class ExotelVoice extends Service implements CallListener {
    public ExotelVoice() {
        // Get Exotel Voice Client
        ExotelVoiceClient exotelVoiceClient = ExotelVoiceClientSDK.getExotelVoiceClient();



    }



    //Call Listener

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onIncomingCall(Call call) {

    }

    @Override
    public void onCallInitiated(Call call) {

    }

    @Override
    public void onCallRinging(Call call) {

    }

    @Override
    public void onCallEstablished(Call call) {

    }

    @Override
    public void onCallEnded(Call call) {

    }

    @Override
    public void onMissedCall(String s, Date date) {

    }

    @Override
    public void onMediaDisrupted(Call call) {

    }

    @Override
    public void onRenewingMedia(Call call) {

    }
}