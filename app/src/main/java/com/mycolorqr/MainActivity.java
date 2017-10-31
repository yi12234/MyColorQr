package com.mycolorqr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.myqrlibrary.MyColorQrUtils;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.iv);
        MyColorQrUtils.MyColorQrUtils2(this, imageView,"123123123",R.mipmap.ic_launcher);
    }
}
