package com.aymensoft.gmapsfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Page1 extends AppCompatActivity {

    Button btnfragments, btnmaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        btnfragments=(Button)findViewById(R.id.btn_fragments);
        btnmaps=(Button)findViewById(R.id.btn_map);

        btnfragments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Page1.this, Page2.class));
            }
        });

        btnmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Page1.this, MapsActivity.class));
            }
        });
    }
}
