package com.example.portfolio;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.net.MailTo;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView facebookIcon, githubIcon, linkedinIcon, twitterIcon;

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        switch (v.getId()) {
            case R.id.facebookIcon:
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.facebook.com/"));
                break;
            case R.id.githubIcon:
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://github.com/ankit10101"));
                break;
            case R.id.linkedinIcon:
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.linkedin.com/in/ankit-bajaj-96192715b/"));
                break;
            case R.id.twitterIcon:
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://twitter.com/?lang=en"));
                break;
        }
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //This method sets the XML on the screen
        // final Context context = getBaseContext();
        setContentView(R.layout.activity_main);
        facebookIcon = findViewById(R.id.facebookIcon);
        githubIcon = findViewById(R.id.githubIcon);
        linkedinIcon = findViewById(R.id.linkedinIcon);
        twitterIcon = findViewById(R.id.twitterIcon);
        facebookIcon.setOnClickListener(this);
        githubIcon.setOnClickListener(this);
        linkedinIcon.setOnClickListener(this);
        twitterIcon.setOnClickListener(this);
        //getBaseContext().getResources().getDrawable();  Used to get resource using context
    }


}
