package com.example.xxx.justpaint;

import android.app.Activity;
import android.os.Bundle;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        Draw2D draw2D = new Draw2D(this);
        setContentView(draw2D);
    }

}