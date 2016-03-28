package ro.pub.cs.sytems.eim.practicaltest01var02;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class PracticalTest01Var02MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var02_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_practical_test01_var02_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        int a  = 0, b = 0,c = 0,d = 0;
        EditText t = (EditText) findViewById(R.id.text1);
        boolean go = true;
        try {
            a = Integer.parseInt(t.getText().toString());
        }
        catch (NumberFormatException e){
            go = false;
        }

        t = (EditText) findViewById(R.id.text2);
        try {
            b = Integer.parseInt(t.getText().toString());
        }
        catch (NumberFormatException e){
            go = false;
        }

        t = (EditText) findViewById(R.id.text3);
        try {
            c = Integer.parseInt(t.getText().toString());
        }
        catch (NumberFormatException e){
            go = false;
        }

        t = (EditText) findViewById(R.id.text4);
        try {
            d = Integer.parseInt(t.getText().toString());
        }
        catch (NumberFormatException e){
            go = false;
        }

        savedInstanceState.putInt("a", 1);
        savedInstanceState.putInt("b", 1);
        savedInstanceState.putInt("c", 1);
        savedInstanceState.putInt("d", 1);


        // etc.
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // Restore UI state from the savedInstanceState.
        // This bundle has also been passed to onCreate.

        int a, b, c, d;
        a = savedInstanceState.getInt("a");
        b = savedInstanceState.getInt("b");
        c = savedInstanceState.getInt("c");
        d = savedInstanceState.getInt("d");

        EditText t;

        t = (EditText) findViewById(R.id.text1);
        t.setText(a);
        t = (EditText) findViewById(R.id.text2);
        t.setText(b);
        t = (EditText) findViewById(R.id.text3);
        t.setText(c);
        t = (EditText) findViewById(R.id.text4);
        t.setText(d);

    }

    public void launchX(View v){
        int a  = 0, b = 0,c = 0,d = 0;
        EditText t = (EditText) findViewById(R.id.text1);
        boolean go = true;
        try {
            a = Integer.parseInt(t.getText().toString());
        }
            catch (NumberFormatException e){
            go = false;
        }

        t = (EditText) findViewById(R.id.text2);
        try {
            b = Integer.parseInt(t.getText().toString());
        }
        catch (NumberFormatException e){
            go = false;
        }

        t = (EditText) findViewById(R.id.text3);
        try {
            c = Integer.parseInt(t.getText().toString());
        }
        catch (NumberFormatException e){
            go = false;
        }

        t = (EditText) findViewById(R.id.text4);
        try {
            d = Integer.parseInt(t.getText().toString());
        }
        catch (NumberFormatException e){
            go = false;
        }

        if(go) {

            Intent intent = new Intent(this, PracticalTest01Var02SecondaryActivity.class);

            Bundle extras = new Bundle();
            extras.putString("ro.pub.cs.sytems.eim.practicaltest01var02.NO_1", Integer.toString(a));
            extras.putString("ro.pub.cs.sytems.eim.practicaltest01var02.NO_2", Integer.toString(b));
            extras.putString("ro.pub.cs.sytems.eim.practicaltest01var02.NO_3", Integer.toString(c));
            extras.putString("ro.pub.cs.sytems.eim.practicaltest01var02.NO_4", Integer.toString(d));
            intent.putExtras(extras);
            startActivity(intent);
        }
    }
}
