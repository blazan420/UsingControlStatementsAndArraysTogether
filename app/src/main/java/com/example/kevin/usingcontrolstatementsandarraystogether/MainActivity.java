package com.example.kevin.usingcontrolstatementsandarraystogether;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
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

        RatingBar rtbFiveStarsStrudent = (RatingBar)findViewById(R.id.rtbFiveStarsStudent);
        RatingBar rtbFourStarsStrudent = (RatingBar)findViewById(R.id.rtbFourStarsStudent);
        RatingBar rtbThreeStarsStrudent = (RatingBar)findViewById(R.id.rtbThreeStarsStudent);
        RatingBar rtbTwoStarsStrudent = (RatingBar)findViewById(R.id.rtbTwoStarsStudent);
        RatingBar rtbOneStarsStrudent = (RatingBar)findViewById(R.id.rtbOneStarsStudent);

        Button btnResults = (Button)findViewById(R.id.btnResults);

        /*rtbFiveStarsStrudent.setIsIndicator(true);
        rtbFourStarsStrudent.setIsIndicator(true);
        rtbThreeStarsStrudent.setIsIndicator(true);
        rtbTwoStarsStrudent.setIsIndicator(true);
        rtbOneStarsStrudent.setIsIndicator(true);*/

        makeThisRatingBarIndicator(rtbFiveStarsStrudent);
        makeThisRatingBarIndicator(rtbFourStarsStrudent);
        makeThisRatingBarIndicator(rtbThreeStarsStrudent);
        makeThisRatingBarIndicator(rtbTwoStarsStrudent);
        makeThisRatingBarIndicator(rtbOneStarsStrudent);

        /*btnResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/


    }

    // Methods
    public void makeThisRatingBarIndicator(RatingBar ratingBar) {

        ratingBar.setIsIndicator(true);

    }


}
