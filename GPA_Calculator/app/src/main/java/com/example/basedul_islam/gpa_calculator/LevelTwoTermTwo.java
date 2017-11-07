package com.example.basedul_islam.gpa_calculator;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class LevelTwoTermTwo extends AppCompatActivity {

    TextView getingText;

    TextView CSE_2200_Text, CSE_2201_Text, CSE_2202_Text, CSE_2203_Text, CSE_2204_Text, CSE_2205_Text, CSE_2206_Text, CSE_2207_Text, CSE_2207_seasonal_Text, MATH_2247_Text;
    Spinner CSE_2200_Spiner, CSE_2201_Spiner, CSE_2202_Spiner, CSE_2203_Spiner, CSE_2204_Spiner, CSE_2205_Spiner, CSE_2206_Spiner, CSE_2207_Spiner, CSE_2207_seasonal_Spiner, MATH_2247_Spiner;
    Button Result, Reset;
    double CSE_2200, CSE_2201, CSE_2202, CSE_2203, CSE_2204, CSE_2205, CSE_2206, CSE_2207, CSE_2207_seasonal, MATH_2247;
    //int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_two_term_two);

        getingText = (TextView)findViewById(R.id.Show_name_of_Level_and_term);
        CSE_2200_Text = (TextView)findViewById(R.id.CSE_2200_ID_TEXT);
        CSE_2201_Text = (TextView)findViewById(R.id.CSE_2201_ID_TEXT);
        CSE_2202_Text = (TextView)findViewById(R.id.CSE_2202_ID_TEXT);
        CSE_2203_Text = (TextView)findViewById(R.id.CSE_2203_ID_TEXT);
        CSE_2204_Text = (TextView)findViewById(R.id.CSE_2204_ID_TEXT);
        CSE_2205_Text = (TextView)findViewById(R.id.CSE_2205_ID_TEXT);
        CSE_2206_Text = (TextView)findViewById(R.id.CSE_2206_ID_TEXT);
        CSE_2207_Text = (TextView)findViewById(R.id.CSE_2207_ID_TEXT);
        CSE_2207_seasonal_Text = (TextView)findViewById(R.id.CSE_2207_Seasonal_ID_TEXT);
        MATH_2247_Text = (TextView)findViewById(R.id.MATH_2247_ID_TEXT);

        CSE_2200_Spiner = (Spinner) findViewById(R.id.CSE_2200_ID_spinner);
        CSE_2201_Spiner = (Spinner) findViewById(R.id.CSE_2201_ID_spinner);
        CSE_2202_Spiner = (Spinner) findViewById(R.id.CSE_2202_ID_spinner);
        CSE_2203_Spiner = (Spinner) findViewById(R.id.CSE_2203_ID_spinner);
        CSE_2204_Spiner = (Spinner) findViewById(R.id.CSE_2204_ID_spinner);
        CSE_2205_Spiner = (Spinner) findViewById(R.id.CSE_2205_ID_spinner);
        CSE_2206_Spiner = (Spinner) findViewById(R.id.CSE_2206_ID_spinner);
        CSE_2207_Spiner = (Spinner) findViewById(R.id.CSE_2207_ID_spinner);
        CSE_2207_seasonal_Spiner = (Spinner) findViewById(R.id.CSE_2207_Seasonal_ID_spinner);
        MATH_2247_Spiner = (Spinner) findViewById(R.id.MATH_2247_ID_spinner);

        Result = (Button)findViewById(R.id.Result_button_id);
        Reset = (Button)findViewById(R.id.Reset_button_id);



        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.GPA, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        CSE_2200_Spiner.setAdapter(adapter);
        CSE_2201_Spiner.setAdapter(adapter);
        CSE_2202_Spiner.setAdapter(adapter);
        CSE_2203_Spiner.setAdapter(adapter);
        CSE_2203_Spiner.setAdapter(adapter);
        CSE_2204_Spiner.setAdapter(adapter);
        CSE_2205_Spiner.setAdapter(adapter);
        CSE_2206_Spiner.setAdapter(adapter);
        CSE_2207_Spiner.setAdapter(adapter);
        CSE_2207_seasonal_Spiner.setAdapter(adapter);
        MATH_2247_Spiner.setAdapter(adapter);


    }

    @Override
    protected void onStart(){
        super.onStart();
        AllFunctionHere();
    }

    protected void AllFunctionHere()
    {
        SubjectCalling();
        Result();
        //Reset();
    }

    protected void SubjectCalling(){
        CSE_2200();
        CSE_2201();
        CSE_2202();
        CSE_2203();
        CSE_2204();
        CSE_2205();
        CSE_2206();
        CSE_2207();
        CSE_2207_seasonal();
        MATH_2247();
    }

    protected void Result()
    {
        Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double LevelTwoTermOneResult = (CSE_2200+CSE_2201+CSE_2202+CSE_2203+CSE_2204+CSE_2205+CSE_2206+CSE_2207+CSE_2207_seasonal+MATH_2247)/20.25;
                if(LevelTwoTermOneResult>=2.00&&LevelTwoTermOneResult<=4.00)
                {
                    Toast.makeText(getApplicationContext(), LevelTwoTermOneResult+" Hurrah Result Paisire22", Toast.LENGTH_LONG).show();
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

    protected void CSE_2200()
    {
        CSE_2200_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_2200 = sum * 0.75;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_2201()
    {
        CSE_2201_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_2201 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_2202()
    {
        CSE_2202_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_2202 = sum * 1.50;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_2203()
    {
        CSE_2203_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_2203 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_2204()
    {
        CSE_2204_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_2204 = sum * 1.50;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_2205()
    {
        CSE_2205_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_2205 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_2206()
    {
        CSE_2206_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_2206 = sum * 0.75;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_2207()
    {
        CSE_2207_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_2207 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }


    protected void CSE_2207_seasonal()
    {
        CSE_2207_seasonal_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_2207_seasonal = sum * 0.75;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void MATH_2247()
    {
        MATH_2247_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                MATH_2247 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}
