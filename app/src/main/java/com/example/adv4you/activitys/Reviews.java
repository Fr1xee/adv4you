package com.example.adv4you.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.adv4you.R;
import com.example.adv4you.Review;

public class Reviews extends AppCompatActivity implements View.OnClickListener {

    Button addReview;
    static Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews);

        addReview = findViewById(R.id.add_review);

        intent = getIntent();

        addReview.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent newActivity = new Intent(Reviews.this, SendReview.class);
        newActivity.putExtra("type", intent.getStringExtra("type"));
        startActivity(newActivity);
    }
}