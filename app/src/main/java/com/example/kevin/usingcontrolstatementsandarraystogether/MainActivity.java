package com.example.kevin.usingcontrolstatementsandarraystogether;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtFiveStarsStudent = (TextView)findViewById(R.id.txtFiveStarsStudent);
        TextView txtFourStarsStudent = (TextView)findViewById(R.id.txtFourStarsStudent);
        TextView txtThreeStarsStudent = (TextView)findViewById(R.id.txtThreeStarsStudent);
        TextView txtTwoStarsStudent = (TextView)findViewById(R.id.txtTwoStarsStudent);
        TextView txtOneStarsStudent = (TextView)findViewById(R.id.txtOneStarsStudent);
    }
}
