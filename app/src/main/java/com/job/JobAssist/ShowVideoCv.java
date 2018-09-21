package com.job.JobAssist;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class ShowVideoCv extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String url=getIntent().getExtras().getString("videourl");
        Uri uri = Uri.parse(url);
        MediaController mediaController=new MediaController(this);

    }
}
