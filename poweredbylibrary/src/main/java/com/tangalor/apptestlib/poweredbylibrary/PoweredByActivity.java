package com.tangalor.apptestlib.poweredbylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class PoweredByActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_powered_by);

        Toast.makeText(getApplicationContext(), "LIBRERIAAAA", Toast.LENGTH_LONG).show();
    }
}
