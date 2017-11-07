package com.example.basedul_islam.gpa_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class LevelTwoTermOne extends AppCompatActivity {

    TextView getingText;

    TextView CSE_2101_Text, CSE_2102_Text, CSE_2103_Text, CSE_2104_Text, CSE_2105_Text, CSE_2106_Text, EEE_2169_Text, EEE_2170_Text, MATH_2145_Text;
    Spinner CSE_2101_Spiner, CSE_2102_Spiner, CSE_2103_Spiner, CSE_2104_Spiner, CSE_2105_Spiner, CSE_2106_Spiner, EEE_2169_Spiner, EEE_2170_Spiner, MATH_2145_Spiner;
    Button Result, Reset;
    double CSE_2101, CSE_2102, CSE_2103, CSE_2104, CSE_2105, CSE_2106, EEE_2169, EEE_2170, MATH_2145;
    //int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_two_term_one);


        getingText = (TextView)findViewById(R.id.Show_name_of_Level_and_term);



        CSE_2101_Text = (TextView)findViewById(R.id.CSE_2101_ID_TEXT);
        CSE_2102_Text = (TextView)findViewById(R.id.CSE_2102_ID_TEXT);
        CSE_2103_Text = (TextView)findViewById(R.id.CSE_2103_ID_TEXT);
        CSE_2104_Text = (TextView)findViewById(R.id.CSE_2104_ID_TEXT);
        CSE_2105_Text = (TextView)findViewById(R.id.CSE_2105_ID_TEXT);
        CSE_2106_Text = (TextView)findViewById(R.id.CSE_2106_ID_TEXT);
        EEE_2169_Text = (TextView)findViewById(R.id.EEE_2169_ID_TEXT);
        EEE_2170_Text = (TextView)findViewById(R.id.EEE_2170_ID_TEXT);
        MATH_2145_Text = (TextView)findViewById(R.id.MATH_2145_ID_TEXT);

        CSE_2101_Spiner = (Spinner) findViewById(R.id.CSE_2101_ID_spinner);
        CSE_2102_Spiner = (Spinner) findViewById(R.id.CSE_2102_ID_spinner);
        CSE_2103_Spiner = (Spinner) findViewById(R.id.CSE_2103_ID_spinner);
        CSE_2104_Spiner = (Spinner) findViewById(R.id.CSE_2104_ID_spinner);
        CSE_2105_Spiner = (Spinner) findViewById(R.id.CSE_2105_ID_spinner);
        CSE_2106_Spiner = (Spinner) findViewById(R.id.CSE_2106_ID_spinner);
        EEE_2169_Spiner = (Spinner) findViewById(R.id.EEE_2169_ID_spinner);
        EEE_2170_Spiner = (Spinner) findViewById(R.id.EEE_2170_ID_spinner);
        MATH_2145_Spiner = (Spinner) findViewById(R.id.MATH_2145_ID_spinner);

        Result = (Button)findViewById(R.id.Result_button_id);
        Reset = (Button)findViewById(R.id.Reset_button_id);



        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.GPA, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        CSE_2101_Spiner.setAdapter(adapter);
        CSE_2102_Spiner.setAdapter(adapter);
        CSE_2103_Spiner.setAdapter(adapter);
        CSE_2104_Spiner.setAdapter(adapter);
        CSE_2105_Spiner.setAdapter(adapter);
        CSE_2106_Spiner.setAdapter(adapter);
        EEE_2169_Spiner.setAdapter(adapter);
        EEE_2170_Spiner.setAdapter(adapter);
        MATH_2145_Spiner.setAdapter(adapter);

    }

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
        CSE_2101();
        CSE_2102();
        CSE_2103();
        CSE_2104();
        CSE_2105();
        CSE_2106();
        EEE_2169();
        EEE_2170();
        MATH_2145();
    }

    protected void Result()
    {
        Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double LevelTwoTermOneResult = (CSE_2101+CSE_2102+CSE_2103+CSE_2104+CSE_2105+CSE_2106+EEE_2169+EEE_2170+MATH_2145)/20.25;
                if(LevelTwoTermOneResult>=2.00&&LevelTwoTermOneResult<=4.00)
                {
                    Toast.makeText(getApplicationContext(), LevelTwoTermOneResult+" Hurrah Result Paisire", Toast.LENGTH_LONG).show();
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

    protected void CSE_2101()
    {
        CSE_2101_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_2101 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_2102()
    {
        CSE_2102_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_2102 = sum * 1.50;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_2103()
    {
        CSE_2103_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_2103 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_2104()
    {
        CSE_2104_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_2104 = sum * 1.50;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_2105()
    {
        CSE_2105_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_2105 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_2106()
    {
        CSE_2106_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_2106 = sum * 1.50;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void EEE_2169()
    {
        EEE_2169_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                EEE_2169 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }


    protected void EEE_2170()
    {
        EEE_2170_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                EEE_2170 = sum * 0.75;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void MATH_2145()
    {
        MATH_2145_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                MATH_2145 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

}
