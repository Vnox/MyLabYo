package com.android.vnoxdev.junitlab3.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import android.widget.Button;
import com.android.vnoxdev.junitlab3.R;

import com.android.vnoxdev.junitlab3.MainActivity;

import org.w3c.dom.Text;

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

    public void test_second(){
        mainActivity = getActivity();
        //Button myb = (Button) mainActivity.findViewById(R.id.adb);
        TextView res = (TextView) mainActivity.findViewById(R.id.textView3);
        TextView n1 = (TextView) mainActivity.findViewById(R.id.textView);
        TextView n2 = (TextView) mainActivity.findViewById(R.id.textView2);
        String tester = String.valueOf(mainActivity.subtract(Integer.parseInt(n1.getText().toString()), Integer.parseInt(n2.getText().toString())));


        assertEquals("-31", tester);

    }
}
