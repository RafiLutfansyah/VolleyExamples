package com.rafilutfansyah.volleyexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView textViewTitle, textViewUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textViewTitle = (TextView) findViewById(R.id.text_view_title);
        textViewUsername = (TextView) findViewById(R.id.text_view_username);

        textViewTitle.setText(getIntent().getStringExtra("title"));
        textViewUsername.setText(getIntent().getStringExtra("username"));
    }
}
