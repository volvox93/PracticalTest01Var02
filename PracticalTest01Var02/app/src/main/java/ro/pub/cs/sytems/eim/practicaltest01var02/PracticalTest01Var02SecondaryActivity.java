package ro.pub.cs.sytems.eim.practicaltest01var02;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PracticalTest01Var02SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var02_secondary);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        EditText t = (EditText) findViewById(R.id.text1);

        Intent intent = getIntent();

        if (intent != null) {

            String a = intent.getStringExtra("ro.pub.cs.sytems.eim.practicaltest01var02.NO_1");
            if (a != null) {
                t = (EditText) findViewById(R.id.text1);
                t.setText(a);
            }

            a = intent.getStringExtra("ro.pub.cs.sytems.eim.practicaltest01var02.NO_2");
            if (a != null) {
                t = (EditText) findViewById(R.id.text2);
                t.setText(a);
            }

            a = intent.getStringExtra("ro.pub.cs.sytems.eim.practicaltest01var02.NO_3");
            if (a != null) {
                t = (EditText) findViewById(R.id.text3);
                t.setText(a);
            }

            a = intent.getStringExtra("ro.pub.cs.sytems.eim.practicaltest01var02.NO_4");
            if (a != null) {
                t = (EditText) findViewById(R.id.text4);
                t.setText(a);
            }
        }
    }

    public void Sum(View v){
        int a,b,c,d;
        EditText t = (EditText) findViewById(R.id.text1);
        a = Integer.parseInt(t.getText().toString());

        t = (EditText) findViewById(R.id.text2);
        b = Integer.parseInt(t.getText().toString());

        t = (EditText) findViewById(R.id.text3);
        c = Integer.parseInt(t.getText().toString());

        t = (EditText) findViewById(R.id.text4);
        d = Integer.parseInt(t.getText().toString());

        Activity activity = this;

        int sum = a + b + c + d;

        Toast.makeText(activity, Integer.toString(sum), Toast.LENGTH_LONG).show();
    }



    public void Product(View v){
        int a,b,c,d;
        EditText t = (EditText) findViewById(R.id.text1);
        a = Integer.parseInt(t.getText().toString());

        t = (EditText) findViewById(R.id.text2);
        b = Integer.parseInt(t.getText().toString());

        t = (EditText) findViewById(R.id.text3);
        c = Integer.parseInt(t.getText().toString());

        t = (EditText) findViewById(R.id.text4);
        d = Integer.parseInt(t.getText().toString());

        Activity activity = this;

        int sum = a * b * c * d;

        Toast.makeText(activity, Integer.toString(sum), Toast.LENGTH_LONG).show();

    }

}
