package com.mzdhr.tourguideelmadina.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mzdhr.tourguideelmadina.R;

public class EnterActivity extends AppCompatActivity {

    // Views
    private Button mEnterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_activity);

        mEnterButton = (Button) findViewById(R.id.enter_button);
        mEnterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnterActivity.this, PlacesActivity.class);
                startActivity(intent);
            }
        });
    }

}
