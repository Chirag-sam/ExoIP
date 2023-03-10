package com.example.exoip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.exotel.voice.ExotelVoiceClient;
import com.exotel.voice.ExotelVoiceClientEventListener;
import com.exotel.voice.ExotelVoiceClientSDK;
import com.exotel.voice.ExotelVoiceError;
import com.exotel.voice.LogLevel;

public class MainActivity extends AppCompatActivity implements ExotelVoiceClientEventListener {

    private ExotelVoiceClient exotelVoiceClient;
    Button initButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButton = findViewById(R.id.init_button);

        initButton.setOnClickListener(view -> {
            exotelVoiceClient = ExotelVoiceClientSDK.getExotelVoiceClient();
            exotelVoiceClient.setEventListener(this);
            android.content.Context context = this.getApplicationContext();
            exotelVoiceClient.initialize(
                    context,		// Android application context
                    "https://miles.apac-sg.exotel.in/v2",           // Host URL for the Exotel Voice Platform
                    "8754392544",     // Username of subscriber used to generate token
                    "8754392544",        // Display name of the subscriber
                    "exotel675",         // Exotel Account SID
                    "{" +
                            "        \"refresh_token\": \"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJFeG90ZWwiLCJzdWIiOiI4NzU0MzkyNTQ0IiwiaWF0IjoiMTY3ODQ0Mzg2NyIsImV4cCI6IjE2Nzg1MzAyNjciLCJjbGllbnRfaWQiOiJleG90ZWw2NzUiLCJkZXZpY2VfaWQiOiI2N2JjY2E0MTA2YzVmOTY3In0.EuV-VAKRy4R6ebpOXLfU8ESeswSIZ5yw8HL8OLSCfI0\"," +
                            "        \"access_token\": \"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJFeG90ZWwiLCJzdWIiOiI4NzU0MzkyNTQ0IiwiaWF0IjoiMTY3ODQ0Mzg2NyIsImV4cCI6IjE2Nzg0NDU2NjciLCJjbGllbnRfaWQiOiJleG90ZWw2NzUiLCJkZXZpY2VfaWQiOiI2N2JjY2E0MTA2YzVmOTY3Iiwic2NvcGUiOiJ2b2ljZSJ9.5EImHjB6RhOEv5UGkkU8CE19adRHJmFSBoxmYFUhXDk\"" +
                            "    }"	// Subscriber token fetched from exotel platform
            );
        });



    }
    //Methods for ExotelVoiceClientEventListener
    @Override
    public void onInitializationSuccess() {
        Log.d("ExotelVoiceService", "onInitializationSuccess: SDK has been initialized");
    }

    @Override
    public void onInitializationFailure(ExotelVoiceError exotelVoiceError) {
        Log.d("TAG", "onInitializationFailure: "+exotelVoiceError.getErrorMessage());
    }

    @Override
    public void onLog(LogLevel logLevel, String s, String s1) {

    }

    @Override
    public void onUploadLogSuccess() {

    }

    @Override
    public void onUploadLogFailure(ExotelVoiceError exotelVoiceError) {

    }

    @Override
    public void onAuthenticationFailure(ExotelVoiceError exotelVoiceError) {

    }
}