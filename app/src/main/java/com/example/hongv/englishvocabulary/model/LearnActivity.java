package com.example.hongv.englishvocabulary.model;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.hongv.englishvocabulary.R;

/**
 * Created by hongv on 3/2/2018.
 */

public class LearnActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_activity);

        Intent intent = getIntent();
        int num1 = intent.getIntExtra("key_int1", 0);
        float f1 = intent.getFloatExtra("key_f1", 0);

        Topic topic = (Topic) intent.getSerializableExtra("key_object");

        Bundle bundle = intent.getBundleExtra("key_bundle");
        String s1 = bundle.getString("key_s1");
        String s2 = bundle.getString("key_s2");

        System.out.println(num1);
        System.out.println(f1);
        System.out.println(topic.toString());
        System.out.println(s1+ " "+s2);
    }
     public void back(View view) {
        finish();
     }
}
