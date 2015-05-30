package com.example.rafael.myappportfolio;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class NanodegreeAppsLauncher extends Activity {

    private Button app1, app2, app3, app4, app5, app6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nanodegree_apps_launcher);

        app1 = (Button)findViewById(R.id.app1);
        app2 = (Button)findViewById(R.id.app2);
        app3 = (Button)findViewById(R.id.app3);
        app4 = (Button)findViewById(R.id.app4);
        app5 = (Button)findViewById(R.id.app5);
        app6 = (Button)findViewById(R.id.app6);

        app1.setOnClickListener(myButtonListener);
        app2.setOnClickListener(myButtonListener);
        app3.setOnClickListener(myButtonListener);
        app4.setOnClickListener(myButtonListener);
        app5.setOnClickListener(myButtonListener);
        app6.setOnClickListener(myButtonListener);


    }

    private View.OnClickListener myButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.app1:
                    Toast.makeText(NanodegreeAppsLauncher.this, "This button will launch my " + getResources().getString(R.string.app1) + " app", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.app2:
                    Toast.makeText(NanodegreeAppsLauncher.this, "This button will launch my " + getResources().getString(R.string.app2) + " app", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.app3:
                    Toast.makeText(NanodegreeAppsLauncher.this, "This button will launch my " + getResources().getString(R.string.app3) + " app", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.app4:
                    Toast.makeText(NanodegreeAppsLauncher.this, "This button will launch my " + getResources().getString(R.string.app4) + " app", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.app5:
                    Toast.makeText(NanodegreeAppsLauncher.this, "This button will launch my " + getResources().getString(R.string.app5) + " app", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.app6:
                    Toast.makeText(NanodegreeAppsLauncher.this, "This button will launch my " + getResources().getString(R.string.app6) + " app", Toast.LENGTH_SHORT).show();
                    break;
            }

        }
    };





}
