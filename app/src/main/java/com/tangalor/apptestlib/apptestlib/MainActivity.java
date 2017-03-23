package com.tangalor.apptestlib.apptestlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.tangalor.apptestlib.poweredbylibrary.PoweredByActivity;
import com.tangalor.apptestlib.poweredbylibrary.Prova;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Button mEmailSignInButton = (Button) findViewById(R.id.button);
        mEmailSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //new PoweredByActivity();

                //Intent myIntent = new Intent(view.getContext(), Main2Activity.class);
                //startService(myIntent);
            }
        });
        */
    }

    public void buttonClickFunction(View v)
    {
        Prova b = new Prova();
        Toast.makeText(getApplicationContext(), b.message, Toast.LENGTH_LONG).show();

        Intent intent = new Intent(getApplicationContext(), PoweredByActivity.class);
        startActivity(intent);
    }
}
