package com.android.vnoxdev.junitlab3.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import com.android.vnoxdev.junitlab3.R;

import com.android.vnoxdev.junitlab3.MainActivity;

/**
 * Created by Vnoxdev on 4/19/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;

    public JUnit_test(){
        super(MainActivity.class);
    }

    public void test_first(){

        mainActivity = getActivity();
        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();
        assertEquals("Hello World!", tester);
    }
}
