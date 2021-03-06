package com.example.pysecond;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

public class MainActivity extends AppCompatActivity {

    TextView tvMain;

    Python py;
    PyObject module;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);

        if (! Python.isStarted()) {
            Python.start(new AndroidPlatform(this));
        }

        this.py = Python.getInstance();
        this.module = this.py.getModule("pycode");

        Integer charsCount = this.module.callAttr("countsmthgsecond", 10000, 678, 456).toJava(Integer.class);
        String countStringValue = String.valueOf(charsCount);

        Toast.makeText(this, countStringValue, Toast.LENGTH_LONG).show();

        this.tvMain.setText(countStringValue);

    }
}