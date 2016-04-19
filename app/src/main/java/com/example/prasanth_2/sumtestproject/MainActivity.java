package com.example.prasanth_2.sumtestproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button addBtn;
    EditText first, second;
    TextView sumDisplay;

    int firstNum, secondNum, sumResult;

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

        addBtn = (Button) findViewById(R.id.button);
        first = (EditText) findViewById(R.id.editText);
        second = (EditText) findViewById(R.id.editText2);
        sumDisplay = (TextView) findViewById(R.id.textView2);


        addBtn.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        firstNum = Integer.parseInt(first.getText().toString());
                        secondNum = Integer.parseInt(second.getText().toString());
                        int sum = sum(firstNum, secondNum);
                        sumDisplay.setText(Integer.toString(sum));
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    //Adds two numbers
    public int sum(int a, int b){
        return a+b;
    }
}
