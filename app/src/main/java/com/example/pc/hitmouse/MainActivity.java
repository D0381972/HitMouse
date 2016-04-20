package com.example.pc.hitmouse;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_content);
        Button start = (Button)findViewById(R.id.startbtn);
        start.setOnClickListener(gamemode);
        Button about = (Button)findViewById(R.id.aboutbtn);
        about.setOnClickListener(gameabout);
        Button setting = (Button)findViewById(R.id.setbtn);
        setting.setOnClickListener(gameset);
    }
    private View.OnClickListener gamemode = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,GameMode.class);
            startActivity(intent);
        }
    };

   private View.OnClickListener gameabout = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            AlertDialog.Builder ad1 = new AlertDialog.Builder(MainActivity.this);
            ad1.setTitle("關於本程式");
            ad1.setMessage("作者：廖裕弘、李定睿、許中瀚、蘇冠睿\n版本：v_1.0");

            DialogInterface.OnClickListener listener1 = new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface di, int i) {
                }
            };
            ad1.setPositiveButton("確定", listener1);
            ad1.show();
        }
    };
    private View.OnClickListener gameset = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,Setting.class);
            startActivity(intent);
        }
    };

  /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/
   /* @Override
   /* public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
=======
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_about:
                AlertDialog.Builder ad1 = new AlertDialog.Builder(this);
                ad1.setTitle("關於本程式");
                ad1.setMessage("作者:廖裕弘、李定睿、許中瀚、蘇冠睿");

                DialogInterface.OnClickListener listener1 = new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface di, int i) {
                    }
                };
                ad1.setPositiveButton("確定",listener1);
                ad1.show();
                break;

            case R.id.action_verson:
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
    }*/
}
