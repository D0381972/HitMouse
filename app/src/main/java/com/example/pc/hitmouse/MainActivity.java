package com.example.pc.hitmouse;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_about:
                AlertDialog.Builder ad1 = new AlertDialog.Builder(this);
                ad1.setTitle("作者：");
                ad1.setMessage("廖裕弘、李定睿、蘇冠睿、許中瀚");

                DialogInterface.OnClickListener listener1 = new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface di, int i) {
                    }
                };
                ad1.setPositiveButton("確定",listener1);
                ad1.show();
                break;

            case R.id.action_version:
                AlertDialog.Builder ad2 = new AlertDialog.Builder(this);
                ad2.setTitle("版本");
                ad2.setMessage("Ver 0.0.1");

                DialogInterface.OnClickListener listener2 = new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface di, int i) {
                    }
                };
                ad2.setPositiveButton("確定",listener2);
                ad2.show();
                break;

            case R.id.action_quit:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
