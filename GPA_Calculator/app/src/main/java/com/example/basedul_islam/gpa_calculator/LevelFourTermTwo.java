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

public class LevelFourTermTwo extends AppCompatActivity {

    TextView getingText;

    TextView CSE_4100_Text, CSE_4201_Text, CSE_4202_Text, CSE_4203_Text, CSE_4204_Text, CSE_42XX_OPTION_3_Text, CSE_42XX_OPTION_3_SESIONAL_Text, CSE_42XX_OPTION_4_Text, CSE_42XX_OPTION_4_SESIONAL_Text;
    Spinner CSE_4100_Spiner, CSE_4201_Spiner, CSE_4202_Spiner, CSE_4203_Spiner, CSE_4204_Spiner, CSE_42XX_OPTION_3_Spiner, CSE_42XX_OPTION_3_SESIONAL_Spiner, CSE_42XX_OPTION_4_Spiner, CSE_42XX_OPTION_4_SESIONAL_Spiner;
    Button Result, Reset;
    double CSE_4100, CSE_4201, CSE_4202, CSE_4203, CSE_4204, CSE_42XX_OPTION_3, CSE_42XX_OPTION_3_SESIONAL, CSE_42XX_OPTION_4, CSE_42XX_OPTION_4_SESIONAL;
    //int count = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_four_term_two);

        getingText = (TextView)findViewById(R.id.Show_name_of_Level_and_term);
        CSE_4100_Text = (TextView)findViewById(R.id.CSE_4100_ID_TEXT);
        CSE_4201_Text = (TextView)findViewById(R.id.CSE_4201_ID_TEXT);
        CSE_4202_Text = (TextView)findViewById(R.id.CSE_4202_ID_TEXT);
        CSE_4203_Text = (TextView)findViewById(R.id.CSE_4203_ID_TEXT);
        CSE_4204_Text = (TextView)findViewById(R.id.CSE_4204_ID_TEXT);
        CSE_42XX_OPTION_3_Text = (TextView)findViewById(R.id.CSE_42XX_OPTION_3_ID_TEXT);
        CSE_42XX_OPTION_3_SESIONAL_Text = (TextView)findViewById(R.id.CSE_42XX_OPTION_3_Sesionsal_ID_TEXT);
        CSE_42XX_OPTION_4_Text = (TextView)findViewById(R.id.CSE_42XX_OPTION_4_ID_TEXT);
        CSE_42XX_OPTION_4_SESIONAL_Text = (TextView)findViewById(R.id.CSE_42XX_OPTION_4_Seasional_ID_TEXT);

        CSE_4100_Spiner = (Spinner) findViewById(R.id.CSE_4100_ID_spinner);
        CSE_4201_Spiner = (Spinner) findViewById(R.id.CSE_4201_ID_spinner);
        CSE_4202_Spiner = (Spinner) findViewById(R.id.CSE_4202_ID_spinner);
        CSE_4203_Spiner = (Spinner) findViewById(R.id.CSE_4203_ID_spinner);
        CSE_4204_Spiner = (Spinner) findViewById(R.id.CSE_4204_ID_spinner);
        CSE_42XX_OPTION_3_Spiner = (Spinner) findViewById(R.id.CSE_42XX_OPTION_3_ID_spinner);
        CSE_42XX_OPTION_3_SESIONAL_Spiner = (Spinner) findViewById(R.id.CSE_42XX_OPTION_3_Seasional_ID_spinner);
        CSE_42XX_OPTION_4_Spiner = (Spinner) findViewById(R.id.CSE_42XX_OPTION_4_ID_spinner);
        CSE_42XX_OPTION_4_SESIONAL_Spiner = (Spinner) findViewById(R.id.CSE_42XX_OPTION_4_Seasional_ID_spinner);

        Result = (Button)findViewById(R.id.Result_button_id);
        Reset = (Button)findViewById(R.id.Reset_button_id);



        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.GPA, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        CSE_4100_Spiner.setAdapter(adapter);
        CSE_4201_Spiner.setAdapter(adapter);
        CSE_4202_Spiner.setAdapter(adapter);
        CSE_4203_Spiner.setAdapter(adapter);
        CSE_4203_Spiner.setAdapter(adapter);
        CSE_4204_Spiner.setAdapter(adapter);
        CSE_42XX_OPTION_3_Spiner.setAdapter(adapter);
        CSE_42XX_OPTION_3_SESIONAL_Spiner.setAdapter(adapter);
        CSE_42XX_OPTION_4_Spiner.setAdapter(adapter);
        CSE_42XX_OPTION_4_SESIONAL_Spiner.setAdapter(adapter);
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
        CSE_4100();
        CSE_4201();
        CSE_4202();
        CSE_4203();
        CSE_4204();
        CSE_42XX_OPTION_3();
        CSE_42XX_OPTION_3_SESIONAL();
        CSE_42XX_OPTION_4();
        CSE_42XX_OPTION_4_SESIONAL();
    }
    protected void Result()
    {
        Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double LevelThreeTermTwoResult = (CSE_4100+CSE_4201+CSE_4202+CSE_4203+CSE_4204+CSE_42XX_OPTION_3+CSE_42XX_OPTION_3_SESIONAL+CSE_42XX_OPTION_4+CSE_42XX_OPTION_4_SESIONAL)/18.75;
                if(LevelThreeTermTwoResult>=2.00&&LevelThreeTermTwoResult<=4.00)
                {
                    Toast.makeText(getApplicationContext(), LevelThreeTermTwoResult+" Hurrah Result Paisire42", Toast.LENGTH_LONG).show();
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

    protected void CSE_4100()
    {
        CSE_4100_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_4100 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_4201()
    {
        CSE_4201_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_4201 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_4202()
    {
        CSE_4202_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_4202 = sum * 0.75;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_4203()
    {
        CSE_4203_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_4203 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_4204()
    {
        CSE_4204_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_4204 = sum * 1.50;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_42XX_OPTION_3()
    {
        CSE_42XX_OPTION_3_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_42XX_OPTION_3 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_42XX_OPTION_3_SESIONAL()
    {
        CSE_42XX_OPTION_3_SESIONAL_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_42XX_OPTION_3_SESIONAL = sum * 0.75;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_42XX_OPTION_4()
    {
        CSE_42XX_OPTION_4_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_42XX_OPTION_4 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_42XX_OPTION_4_SESIONAL()
    {
        CSE_42XX_OPTION_4_SESIONAL_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_42XX_OPTION_4_SESIONAL = sum * 0.75;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}
