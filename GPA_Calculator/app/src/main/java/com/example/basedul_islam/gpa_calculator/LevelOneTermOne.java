package com.example.basedul_islam.gpa_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class LevelOneTermOne extends AppCompatActivity{

   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_one_term_one);
    }*/


    TextView getingText;

    TextView CSE_1101_Text, CSE_1102_Text, EEE_1163_Text, EEE_1164_Text, ME_1181_Text, MATH_1141_Text, PHY_1103_Text, PHY_1104_Text, HUM_1101_Text;
    Spinner CSE_1101_Spiner, CSE_1102_Spiner, EEE_1163_Spiner, EEE_1164_Spiner, ME_1181_Spiner, MATH_1141_Spiner, PHY_1103_Spiner, PHY_1104_Spiner, HUM_1101_Spiner;
    Button Result, Reset;
    double CSE_1101, CSE_1102, EEE_1163, EEE_1164, ME_1181, MATH_1141, PHY_1103, PHY_1104, HUM_1101;
    //int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_one_term_one);
        getingText = (TextView)findViewById(R.id.Show_name_of_Level_and_term);



        CSE_1101_Text = (TextView)findViewById(R.id.CSE_1101_ID_TEXT);
        CSE_1102_Text = (TextView)findViewById(R.id.CSE_1102_ID_TEXT);
        EEE_1163_Text = (TextView)findViewById(R.id.EEE_1163_ID_TEXT);
        EEE_1164_Text = (TextView)findViewById(R.id.EEE_1164_ID_TEXT);
        ME_1181_Text = (TextView)findViewById(R.id.ME_1181_ID_TEXT);
        MATH_1141_Text = (TextView)findViewById(R.id.MATH_1141_ID_TEXT);
        PHY_1103_Text = (TextView)findViewById(R.id.PHY_1103_ID_TEXT);
        PHY_1104_Text = (TextView)findViewById(R.id.PHY_1104_ID_TEXT);
        HUM_1101_Text = (TextView)findViewById(R.id.HUM_1101_ID_TEXT);

        CSE_1101_Spiner = (Spinner) findViewById(R.id.CSE_1101_ID_spinner);
        CSE_1102_Spiner = (Spinner) findViewById(R.id.CSE_1102_ID_spinner);
        EEE_1163_Spiner = (Spinner) findViewById(R.id.EEE_1163_ID_spinner);
        EEE_1164_Spiner = (Spinner) findViewById(R.id.EEE_1164_ID_spinner);
        ME_1181_Spiner = (Spinner) findViewById(R.id.ME_1181_ID_spinner);
        MATH_1141_Spiner = (Spinner) findViewById(R.id.MATH_1141_ID_spinner);
        PHY_1103_Spiner = (Spinner) findViewById(R.id.PHY_1103_ID_spinner);
        PHY_1104_Spiner = (Spinner) findViewById(R.id.PHY_1104_ID_spinner);
        HUM_1101_Spiner = (Spinner) findViewById(R.id.HUM_1101_ID_spinner);

        Result = (Button)findViewById(R.id.Result_button_id);
        Reset = (Button)findViewById(R.id.Reset_button_id);



        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.GPA, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        CSE_1101_Spiner.setAdapter(adapter);
        CSE_1102_Spiner.setAdapter(adapter);
        EEE_1163_Spiner.setAdapter(adapter);
        EEE_1164_Spiner.setAdapter(adapter);
        ME_1181_Spiner.setAdapter(adapter);
        MATH_1141_Spiner.setAdapter(adapter);
        PHY_1103_Spiner.setAdapter(adapter);
        PHY_1104_Spiner.setAdapter(adapter);
        HUM_1101_Spiner.setAdapter(adapter);


        /*CSE_1101_Spiner.setOnTouchListener((View.OnTouchListener) this);
        CSE_1102_Spiner.setOnTouchListener((View.OnTouchListener) this);
        EEE_1163_Spiner.setOnTouchListener((View.OnTouchListener) this);
        EEE_1164_Spiner.setOnTouchListener((View.OnTouchListener) this);
        ME_1181_Spiner.setOnTouchListener((View.OnTouchListener) this);
        MATH_1141_Spiner.setOnTouchListener((View.OnTouchListener) this);
        PHY_1103_Spiner.setOnTouchListener((View.OnTouchListener) this);
        PHY_1104_Spiner.setOnTouchListener((View.OnTouchListener) this);
        HUM_1101_Spiner.setOnTouchListener((View.OnTouchListener) this);*/

    }
    @Override
    protected void onStart(){
        super.onStart();
        AllFunctionHere();
    }
    @Override
    protected void onResume(){
        super.onResume();
    }
    @Override
    protected void onPause(){
        super.onPause();
    }
    @Override
    protected void onStop(){
        super.onStop();
    }
    protected void AllFunctionHere()
    {
        SubjectCalling();
        Result();
        //Reset();
    }

    protected void SubjectCalling(){
        CSE_1101();
        CSE_1102();
        EEE_1163();
        EEE_1164();
        ME_1181();
        MATH_1141();
        PHY_1103();
        PHY_1104();
        HUM_1101();
    }

    protected void Result()
    {
        Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double LevelOneTermOneResult = (CSE_1101+CSE_1102+EEE_1163+EEE_1164+ME_1181+MATH_1141+PHY_1103+PHY_1104+HUM_1101)/20.00;
                if(LevelOneTermOneResult>=2.00&&LevelOneTermOneResult<=4.00)
                {
                    Toast.makeText(getApplicationContext(), LevelOneTermOneResult+" Hurrah Result Paisire", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Sorry ", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
    protected void Reset()
    {
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LevelOneTermOne.class);
                startActivity(intent);
            }
        });
    }
    protected void CSE_1101()
    {
        CSE_1101_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                double gpa_4_00 = 0.0, gpa_3_75 = 0.0, gpa_3_50 = 0.0, gpa_3_25 = 0.0, gpa_3_00 = 0.0, gpa_2_75 = 0.0, gpa_2_50 = 0.0, gpa_2_25 = 0.0, gpa_2_00 = 0.0, sum = 0.0;
                switch ((int) adapterView.getItemIdAtPosition(i)){
                    case 1:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_4_00 = 4.00;
                        break;
                    case 2:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_75 = 3.75;
                        break;
                    case 3:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_50 = 3.50;
                        break;
                    case 4:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_25 = 3.25;
                        break;
                    case 5:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_00 = 3.00;
                        break;
                    case 6:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_75 = 2.75;
                        break;
                    case 7:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_50 = 2.50;
                        break;
                    case 8:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_25 = 2.25;
                        break;
                    case 9:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_00 = 2.00;
                        break;

                }
                //count++;
                sum = gpa_2_00+gpa_2_25+gpa_2_50+gpa_2_75+gpa_3_00+gpa_3_25+gpa_3_50+gpa_3_75+gpa_4_00;
                CSE_1101 = sum * 2.00;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_1102()
    {
        CSE_1102_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                double gpa_4_00 = 0.0, gpa_3_75 = 0.0, gpa_3_50 = 0.0, gpa_3_25 = 0.0, gpa_3_00 = 0.0, gpa_2_75 = 0.0, gpa_2_50 = 0.0, gpa_2_25 = 0.0, gpa_2_00 = 0.0, sum = 0.0;
                switch ((int) adapterView.getItemIdAtPosition(i)){
                    case 1:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_4_00 = 4.00;
                        break;
                    case 2:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_75 = 3.75;
                        break;
                    case 3:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_50 = 3.50;
                        break;
                    case 4:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_25 = 3.25;
                        break;
                    case 5:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_00 = 3.00;
                        break;
                    case 6:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_75 = 2.75;
                        break;
                    case 7:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_50 = 2.50;
                        break;
                    case 8:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_25 = 2.25;
                        break;
                    case 9:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_00 = 2.00;
                        break;

                }
                //count++;
                sum = gpa_2_00+gpa_2_25+gpa_2_50+gpa_2_75+gpa_3_00+gpa_3_25+gpa_3_50+gpa_3_75+gpa_4_00;
                CSE_1102 = sum * 0.75;
                //Toast.makeText(getApplicationContext(), CSE_1102+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    protected void EEE_1163()
    {
        EEE_1163_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                double gpa_4_00 = 0.0, gpa_3_75 = 0.0, gpa_3_50 = 0.0, gpa_3_25 = 0.0, gpa_3_00 = 0.0, gpa_2_75 = 0.0, gpa_2_50 = 0.0, gpa_2_25 = 0.0, gpa_2_00 = 0.0, sum = 0.0;
                switch ((int) adapterView.getItemIdAtPosition(i)){
                    case 1:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_4_00 = 4.00;
                        break;
                    case 2:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_75 = 3.75;
                        break;
                    case 3:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_50 = 3.50;
                        break;
                    case 4:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_25 = 3.25;
                        break;
                    case 5:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_00 = 3.00;
                        break;
                    case 6:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_75 = 2.75;
                        break;
                    case 7:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_50 = 2.50;
                        break;
                    case 8:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_25 = 2.25;
                        break;
                    case 9:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_00 = 2.00;
                        break;

                }
                //count++;
                sum = gpa_2_00+gpa_2_25+gpa_2_50+gpa_2_75+gpa_3_00+gpa_3_25+gpa_3_50+gpa_3_75+gpa_4_00;
                EEE_1163 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), EEE_1163+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }

    protected void EEE_1164()
    {
        EEE_1164_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                double gpa_4_00 = 0.0, gpa_3_75 = 0.0, gpa_3_50 = 0.0, gpa_3_25 = 0.0, gpa_3_00 = 0.0, gpa_2_75 = 0.0, gpa_2_50 = 0.0, gpa_2_25 = 0.0, gpa_2_00 = 0.0, sum = 0.0;
                switch ((int) adapterView.getItemIdAtPosition(i)){
                    case 1:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_4_00 = 4.00;
                        break;
                    case 2:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_75 = 3.75;
                        break;
                    case 3:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_50 = 3.50;
                        break;
                    case 4:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_25 = 3.25;
                        break;
                    case 5:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_00 = 3.00;
                        break;
                    case 6:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_75 = 2.75;
                        break;
                    case 7:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_50 = 2.50;
                        break;
                    case 8:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_25 = 2.25;
                        break;
                    case 9:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_00 = 2.00;
                        break;

                }
                //count++;
                sum = gpa_2_00+gpa_2_25+gpa_2_50+gpa_2_75+gpa_3_00+gpa_3_25+gpa_3_50+gpa_3_75+gpa_4_00;
                EEE_1164 = sum * 1.50;
                //Toast.makeText(getApplicationContext(), EEE_1164+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }

    protected void ME_1181()
    {
        ME_1181_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                double gpa_4_00 = 0.0, gpa_3_75 = 0.0, gpa_3_50 = 0.0, gpa_3_25 = 0.0, gpa_3_00 = 0.0, gpa_2_75 = 0.0, gpa_2_50 = 0.0, gpa_2_25 = 0.0, gpa_2_00 = 0.0, sum = 0.0;
                switch ((int) adapterView.getItemIdAtPosition(i)){
                    case 1:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_4_00 = 4.00;
                        break;
                    case 2:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_75 = 3.75;
                        break;
                    case 3:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_50 = 3.50;
                        break;
                    case 4:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_25 = 3.25;
                        break;
                    case 5:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_00 = 3.00;
                        break;
                    case 6:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_75 = 2.75;
                        break;
                    case 7:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_50 = 2.50;
                        break;
                    case 8:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_25 = 2.25;
                        break;
                    case 9:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_00 = 2.00;
                        break;

                }
                //count++;
                sum = gpa_2_00+gpa_2_25+gpa_2_50+gpa_2_75+gpa_3_00+gpa_3_25+gpa_3_50+gpa_3_75+gpa_4_00;
                ME_1181 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), ME_1181+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    protected void MATH_1141()
    {
        MATH_1141_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                double gpa_4_00 = 0.0, gpa_3_75 = 0.0, gpa_3_50 = 0.0, gpa_3_25 = 0.0, gpa_3_00 = 0.0, gpa_2_75 = 0.0, gpa_2_50 = 0.0, gpa_2_25 = 0.0, gpa_2_00 = 0.0, sum = 0.0;
                switch ((int) adapterView.getItemIdAtPosition(i)){
                    case 1:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_4_00 = 4.00;
                        break;
                    case 2:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_75 = 3.75;
                        break;
                    case 3:
                        ///=Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_50 = 3.50;
                        break;
                    case 4:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_25 = 3.25;
                        break;
                    case 5:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_00 = 3.00;
                        break;
                    case 6:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_75 = 2.75;
                        break;
                    case 7:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_50 = 2.50;
                        break;
                    case 8:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_25 = 2.25;
                        break;
                    case 9:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_00 = 2.00;
                        break;

                }
                //count++;
                sum = gpa_2_00+gpa_2_25+gpa_2_50+gpa_2_75+gpa_3_00+gpa_3_25+gpa_3_50+gpa_3_75+gpa_4_00;
                MATH_1141 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), MATH_1141+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    protected void PHY_1103()
    {
        PHY_1103_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                double gpa_4_00 = 0.0, gpa_3_75 = 0.0, gpa_3_50 = 0.0, gpa_3_25 = 0.0, gpa_3_00 = 0.0, gpa_2_75 = 0.0, gpa_2_50 = 0.0, gpa_2_25 = 0.0, gpa_2_00 = 0.0, sum = 0.0;
                switch ((int) adapterView.getItemIdAtPosition(i)){
                    case 1:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_4_00 = 4.00;
                        break;
                    case 2:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_75 = 3.75;
                        break;
                    case 3:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_50 = 3.50;
                        break;
                    case 4:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_25 = 3.25;
                        break;
                    case 5:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_00 = 3.00;
                        break;
                    case 6:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_75 = 2.75;
                        break;
                    case 7:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_50 = 2.50;
                        break;
                    case 8:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_25 = 2.25;
                        break;
                    case 9:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_00 = 2.00;
                        break;

                }
                //count++;
                sum = gpa_2_00+gpa_2_25+gpa_2_50+gpa_2_75+gpa_3_00+gpa_3_25+gpa_3_50+gpa_3_75+gpa_4_00;
                PHY_1103 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), PHY_1103+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    protected void PHY_1104()
    {
        PHY_1104_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                double gpa_4_00 = 0.0, gpa_3_75 = 0.0, gpa_3_50 = 0.0, gpa_3_25 = 0.0, gpa_3_00 = 0.0, gpa_2_75 = 0.0, gpa_2_50 = 0.0, gpa_2_25 = 0.0, gpa_2_00 = 0.0, sum = 0.0;
                switch ((int) adapterView.getItemIdAtPosition(i)){
                    case 1:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_4_00 = 4.00;
                        break;
                    case 2:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_75 = 3.75;
                        break;
                    case 3:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_50 = 3.50;
                        break;
                    case 4:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_25 = 3.25;
                        break;
                    case 5:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_00 = 3.00;
                        break;
                    case 6:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_75 = 2.75;
                        break;
                    case 7:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_50 = 2.50;
                        break;
                    case 8:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_25 = 2.25;
                        break;
                    case 9:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_00 = 2.00;
                        break;

                }
                //count++;
                sum = gpa_2_00+gpa_2_25+gpa_2_50+gpa_2_75+gpa_3_00+gpa_3_25+gpa_3_50+gpa_3_75+gpa_4_00;
                PHY_1104 = sum * .75;
                //Toast.makeText(getApplicationContext(), PHY_1104+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    protected void HUM_1101()
    {
        HUM_1101_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                double gpa_4_00 = 0.0, gpa_3_75 = 0.0, gpa_3_50 = 0.0, gpa_3_25 = 0.0, gpa_3_00 = 0.0, gpa_2_75 = 0.0, gpa_2_50 = 0.0, gpa_2_25 = 0.0, gpa_2_00 = 0.0, sum = 0.0;
                switch ((int) adapterView.getItemIdAtPosition(i)){
                    case 1:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_4_00 = 4.00;
                        break;
                    case 2:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_75 = 3.75;
                        break;
                    case 3:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_50 = 3.50;
                        break;
                    case 4:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_25 = 3.25;
                        break;
                    case 5:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_3_00 = 3.00;
                        break;
                    case 6:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_75 = 2.75;
                        break;
                    case 7:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_50 = 2.50;
                        break;
                    case 8:
                        //Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_25 = 2.25;
                        break;
                    case 9:
                       // Toast.makeText(getApplicationContext(), adapterView.getItemIdAtPosition(i)+" is selected", Toast.LENGTH_LONG).show();
                        gpa_2_00 = 2.00;
                        break;

                }
                //count++;
                sum = gpa_2_00+gpa_2_25+gpa_2_50+gpa_2_75+gpa_3_00+gpa_3_25+gpa_3_50+gpa_3_75+gpa_4_00;
                HUM_1101 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), HUM_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

}
