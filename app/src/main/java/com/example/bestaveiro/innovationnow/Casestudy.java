package com.example.bestaveiro.innovationnow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Casestudy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casestudy);

        TextView tmp = (TextView) findViewById(R.id.caseStudy);
        tmp.setMovementMethod(LinkMovementMethod.getInstance());

        ImageButton butin = (ImageButton) findViewById(R.id.image3);
        butin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b5 = new Intent(getApplicationContext(), MenuButtons.class);
                startActivity(b5);
            }
        });
    }
}
