package com.login_signup_screendesign_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Bundle extras = getIntent().getExtras();
        if(extras !=null)
        {
            String personID = extras.getString("PersonID");
            TextView id =(TextView) findViewById(R.id.text);
            id.setText(personID);
        }
    }
}
