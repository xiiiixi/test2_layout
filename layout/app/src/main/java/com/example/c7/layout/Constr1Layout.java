package com.example.c7.layout;


import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/**
 * Created by c7 on 2019/3/14.
 */
public class Constr1Layout extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constr1layout);
    }
    @Override
    public void onConfigurationChanged(Configuration config) {
        super.onConfigurationChanged(config);//横竖屏切换，布局调整合适
        setContentView(R.layout.activity_constr1layout);
    }
}
