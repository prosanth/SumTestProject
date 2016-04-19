package com.example.prasanth_2.sumtestproject.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.prasanth_2.sumtestproject.MainActivity;
import com.example.prasanth_2.sumtestproject.R;

/**
 * Created by Prasanth_2 on 4/18/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public JUnit_test() {
        super(MainActivity.class);
    }

    public void test_sum(){
        mainActivity = getActivity();

        int tester = mainActivity.sum(4,3);

        assertEquals(7, tester);
    }
}
