package com.leoybkim.bluetoothle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.charset.Charset;

/**
 * Created by leo on 29/01/17.
 */

public class MessageActivity extends AppCompatActivity {

    private static final String TAG = MessageActivity.class.getSimpleName();
    private TextView dialogue;
    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        dialogue = (TextView) findViewById(R.id.messages);
        input = (EditText) findViewById(R.id.input);
    }

    public void sendClick(View view) {
        String message = input.getText().toString();
        Log.d(TAG, message);
        dialogue.append("Sent: " + message + "\n");
        input.setText("");
    }
}
