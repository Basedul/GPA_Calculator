package com.example.basedul_islam.gpa_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    Button l1t1, l1t2, l2t1, l2t2, l3t1, l3t2, l4t1, l4t2;
    public static final String keyL1T1 = "LevelOneTermOne";
    public static final String keyL1T2 = "LevelOneTermTwo";
    public static final String keyL2T1 = "LevelTwoTermOne";
    public static final String keyL2T2 = "LevelTwoTermTwo";
    public static final String keyL3T1 = "LevelThreeTermOne";
    public static final String keyL3T2 = "LevelThreeTermTwo";
    public static final String keyL4T1 = "LevelFourTermOne";
    public static final String keyL4T2 = "LevelFourTermTwo";


    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        l1t1 = (Button)findViewById(R.id.level_one_term_one_id);
        l1t2 = (Button)findViewById(R.id.level_one_term_two_id);
        l2t1 = (Button)findViewById(R.id.level_two_term_one_id);
        l2t2 = (Button)findViewById(R.id.level_two_term_two_id);
        l3t1 = (Button)findViewById(R.id.level_three_term_one_id);
        l3t2 = (Button)findViewById(R.id.level_three_term_two_id);
        l4t1 = (Button)findViewById(R.id.level_four_term_one_id);
        l4t2 = (Button)findViewById(R.id.level_four_term_two_id);


        l1t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),LevelOneTermOne.class);
                //intent.putExtra(keyL1T1, "Level-1, Term-1");
                startActivity(intent);
            }
        });

        l1t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),LevelOneTermTwo.class);
                //intent.putExtra(keyL1T2, "Level-1, Term-2");
                startActivity(intent);
            }
        });

        l2t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),LevelTwoTermOne.class);
                intent.putExtra(keyL2T1, "Level-2, Term-1");
                startActivity(intent);
            }
        });

        l2t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),LevelTwoTermTwo.class);
                intent.putExtra(keyL2T2, "Level-2, Term-2");
                startActivity(intent);
            }
        });

        l3t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),LevelThreeTermOne.class);
                intent.putExtra(keyL3T1, "Level-3, Term-1");
                startActivity(intent);
            }
        });

        l3t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),LevelThreeTermTwo.class);
                intent.putExtra(keyL3T2, "Level-3, Term-2");
                startActivity(intent);
            }
        });

        l4t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),LevelFourTermOne.class);
                intent.putExtra(keyL4T1, "Level-4, Term-1");
                startActivity(intent);
            }
        });

        l4t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),LevelFourTermTwo.class);
                intent.putExtra(keyL4T2, "Level-4, Term-2");
                startActivity(intent);
            }
        });

    }
    public native String stringFromJNI();
}
