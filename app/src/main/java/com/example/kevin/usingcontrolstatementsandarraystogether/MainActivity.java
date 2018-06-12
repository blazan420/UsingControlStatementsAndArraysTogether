package com.example.kevin.usingcontrolstatementsandarraystogether;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int fiveStarsReview = 0;
    int fourStarsReview = 0;
    int threeStarsReview = 0;
    int twoStarsReview = 0;
    int oneStarsReview = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtFiveStarsStudent = (TextView)findViewById(R.id.txtFiveStarsStudent);
        TextView txtFourStarsStudent = (TextView)findViewById(R.id.txtFourStarsStudent);
        TextView txtThreeStarsStudent = (TextView)findViewById(R.id.txtThreeStarsStudent);
        TextView txtTwoStarsStudent = (TextView)findViewById(R.id.txtTwoStarsStudent);
        TextView txtOneStarsStudent = (TextView)findViewById(R.id.txtOneStarsStudent);

        RatingBar rtbFiveStarsStudent = (RatingBar)findViewById(R.id.rtbFiveStarsStudent);
        RatingBar rtbFourStarsStudent = (RatingBar)findViewById(R.id.rtbFourStarsStudent);
        RatingBar rtbThreeStarsStudent = (RatingBar)findViewById(R.id.rtbThreeStarsStudent);
        RatingBar rtbTwoStarsStudent = (RatingBar)findViewById(R.id.rtbTwoStarsStudent);
        RatingBar rtbOneStarsStudent = (RatingBar)findViewById(R.id.rtbOneStarsStudent);

        Button btnResults = (Button)findViewById(R.id.btnResults);

        /*rtbFiveStarsStrudent.setIsIndicator(true);
        rtbFourStarsStrudent.setIsIndicator(true);
        rtbThreeStarsStrudent.setIsIndicator(true);
        rtbTwoStarsStrudent.setIsIndicator(true);
        rtbOneStarsStrudent.setIsIndicator(true);*/

        makeThisRatingBarIndicator(rtbFiveStarsStudent);
        makeThisRatingBarIndicator(rtbFourStarsStudent);
        makeThisRatingBarIndicator(rtbThreeStarsStudent);
        makeThisRatingBarIndicator(rtbTwoStarsStudent);
        makeThisRatingBarIndicator(rtbOneStarsStudent);


        final int[] studentReviews = {5, 3, 4, 2, 4, 5, 1, 3, 2, 5, 5, 3, 2, 3};

        btnResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int index = 0; index < studentReviews.length; index++) {

                    if (studentReviews[index] == 5) {
                        ++fiveStarsReview;
                    }

                    if (studentReviews[index] == 4) {
                        ++fourStarsReview;
                    }

                    if (studentReviews[index]  == 3) {
                        ++threeStarsReview;
                    }
                    if (studentReviews[index]  == 2) {
                        ++twoStarsReview;
                    }
                    if (studentReviews[index]  == 1) {
                        ++oneStarsReview;
                    }

                }



            }
        });


    }

    // Methods
    public void makeThisRatingBarIndicator(RatingBar ratingBar) {

        ratingBar.setIsIndicator(true);

    }


}
