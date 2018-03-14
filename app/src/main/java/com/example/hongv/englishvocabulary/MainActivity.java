package com.example.hongv.englishvocabulary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.hongv.englishvocabulary.controller.TopicManager;
import com.example.hongv.englishvocabulary.model.LearnActivity;
import com.example.hongv.englishvocabulary.model.Topic;
import com.example.hongv.englishvocabulary.model.Vocabulary;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TopicManager topicManager = TopicManager.getsInstance();
//
//        ArrayList<Topic> topics = topicManager.getTopics();
//        for (Topic t : topics) {
//            System.out.println(t.toString());
//            ArrayList<Vocabulary> vocabularies = topicManager.getVocabulary(t);
//            for (Vocabulary v : vocabularies) {
//                System.out.println(v.toString());
//            }
//        }
    }

    public void goToLearn (View view) {
        Intent intent = new Intent(MainActivity.this, LearnActivity.class) ;

        intent.putExtra("key_int1", 1);
        intent.putExtra("key_f1", 2.5);

        Topic topic = new Topic(1, "farm");
        intent.putExtra("key_object", topic);

        Bundle bundle = new Bundle();
        bundle.putString("key_s1", "abc");
        bundle.putString("key_s2", "def");

        intent.putExtra("key_bundle", bundle);

        startActivity(intent);
    }

}

