package com.example.bestaveiro.innovationnow.Oradores;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.bestaveiro.innovationnow.MenuButtons;
import com.example.bestaveiro.innovationnow.R;

public class OradoresActivity extends AppCompatActivity {

    public ImageButton butt1;
    public ImageButton butt2;
    public ImageButton butt3;
    public ImageButton butt4;
    public ImageButton butt5;
    public ImageButton butt6;
    public ImageButton butt7;
    public ImageButton butt8;
    public ImageButton butt9;
    public ImageButton butt10;
    public ImageButton butt11;
    public ImageButton butt12;
    public ImageButton butt13;
    public ImageButton butt14;
    public ImageButton butt15;
    public ImageButton butt16;
    public ImageButton butt17;
    public ImageButton but1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oradores);
        init();
    }


    public void init(){
        butt1 = (ImageButton) findViewById(R.id.imagebutton2);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt1 = new Intent(getApplicationContext(),miguelgoncalves.class);
                startActivity(bt1);
            }
        });

        butt3 = (ImageButton) findViewById(R.id.imagebutton3);
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt3 = new Intent(getApplicationContext(),adeliomendes.class);
                startActivity(bt3);
            }
        });

        butt2 = (ImageButton) findViewById(R.id.imagebutton4);
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt4 = new Intent(getApplicationContext(),diogo.class);
                startActivity(bt4);
            }
        });

        butt4 = (ImageButton) findViewById(R.id.imagebutton);
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt4 = new Intent(getApplicationContext(),sofiaoliveira.class);
                startActivity(bt4);
            }
        });

        butt5 = (ImageButton) findViewById(R.id.imagebutton5);
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt5 = new Intent(getApplicationContext(),paulooliveira.class);
                startActivity(bt5);
            }
        });

        butt6 = (ImageButton) findViewById(R.id.imagebutton6);
        butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt6 = new Intent(getApplicationContext(),luissilva.class);
                startActivity(bt6);
            }
        });

        butt7 = (ImageButton) findViewById(R.id.imagebutton7);
        butt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt7 = new Intent(getApplicationContext(),timvieira.class);
                startActivity(bt7);
            }
        });

        butt8 = (ImageButton) findViewById(R.id.imagebutton8);
        butt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt8 = new Intent(getApplicationContext(),davidcarvalhao.class);
                startActivity(bt8);
            }
        });

        butt9 = (ImageButton) findViewById(R.id.imagebutton9);
        butt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt9 = new Intent(getApplicationContext(),albertoliberal.class);
                startActivity(bt9);
            }
        });



        butt10 = (ImageButton) findViewById(R.id.imagebutton11);
        butt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt11 = new Intent(getApplicationContext(),joaocatalao.class);
                startActivity(bt11);
            }
        });

        butt11 = (ImageButton) findViewById(R.id.imagebutton12);
        butt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt12 = new Intent(getApplicationContext(),nunofonseca.class);
                startActivity(bt12);
            }
        });

        butt12 = (ImageButton) findViewById(R.id.imageButton13);
        butt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt13 = new Intent(getApplicationContext(),paulavilarinho.class);
                startActivity(bt13);
            }
        });

        butt13 = (ImageButton) findViewById(R.id.imageButton15);
        butt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt14 = new Intent(getApplicationContext(),joaobarraca.class);
                startActivity(bt14);
            }
        });

        butt14 = (ImageButton) findViewById(R.id.imageButton14);
        butt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt15 = new Intent(getApplicationContext(),soraya.class);
                startActivity(bt15);
            }
        });

        butt15 = (ImageButton) findViewById(R.id.imageButton16);
        butt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt16 = new Intent(getApplicationContext(),carlosmartins.class);
                startActivity(bt16);
            }
        });

        butt16 = (ImageButton) findViewById(R.id.imageButton17);
        butt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt17 = new Intent(getApplicationContext(),anasofia.class);
                startActivity(bt17);
            }
        });




        but1 = (ImageButton) findViewById(R.id.image4);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b1 = new Intent(getApplicationContext(),MenuButtons.class);
                startActivity(b1);
            }
        });




    }


}
