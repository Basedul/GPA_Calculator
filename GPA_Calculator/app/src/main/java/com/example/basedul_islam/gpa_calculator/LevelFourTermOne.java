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

public class LevelFourTermOne extends AppCompatActivity {

    TextView getingText;

    TextView CSE_4100_Text, CSE_4101_Text, CSE_4102_Text, CSE_4103_Text, CSE_4104_Text, CSE_41XX_OPTION_1_Text, CSE_41XX_OPTION_2_Text, CSE_41XX_OPTION_2_SESIONAL_Text, ME_4117_Text;
    Spinner CSE_4100_Spiner, CSE_4101_Spiner, CSE_4102_Spiner, CSE_4103_Spiner, CSE_4104_Spiner, CSE_41XX_OPTION_1_Spiner, CSE_41XX_OPTION_2_Spiner, CSE_41XX_OPTION_2_SESIONAL_Spiner, ME_4117_Spiner;
    Button Result, Reset;
    double CSE_4100, CSE_4101, CSE_4102, CSE_4103, CSE_4104, CSE_41XX_OPTION_1, CSE_41XX_OPTION_2, CSE_41XX_OPTION_2_SESIONAL, ME_4117;
    //int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_four_term_one);
        getingText = (TextView)findViewById(R.id.Show_name_of_Level_and_term);
        CSE_4100_Text = (TextView)findViewById(R.id.CSE_4100_ID_TEXT);
        CSE_4101_Text = (TextView)findViewById(R.id.CSE_4101_ID_TEXT);
        CSE_4102_Text = (TextView)findViewById(R.id.CSE_4102_ID_TEXT);
        CSE_4103_Text = (TextView)findViewById(R.id.CSE_4103_ID_TEXT);
        CSE_4104_Text = (TextView)findViewById(R.id.CSE_4104_ID_TEXT);
        CSE_41XX_OPTION_1_Text = (TextView)findViewById(R.id.CSE_41XX_OPTION_1_ID_TEXT);
        CSE_41XX_OPTION_2_Text = (TextView)findViewById(R.id.CSE_41XX_OPTION_2_ID_TEXT);
        CSE_41XX_OPTION_2_SESIONAL_Text = (TextView)findViewById(R.id.CSE_41XX_OPTION_2_SEASONAL_ID_TEXT);
        ME_4117_Text = (TextView)findViewById(R.id.ME_4117_ID_TEXT);

        CSE_4100_Spiner = (Spinner) findViewById(R.id.CSE_4100_ID_spinner);
        CSE_4101_Spiner = (Spinner) findViewById(R.id.CSE_4101_ID_spinner);
        CSE_4102_Spiner = (Spinner) findViewById(R.id.CSE_4102_ID_spinner);
        CSE_4103_Spiner = (Spinner) findViewById(R.id.CSE_4103_ID_spinner);
        CSE_4104_Spiner = (Spinner) findViewById(R.id.CSE_4104_ID_spinner);
        CSE_41XX_OPTION_1_Spiner = (Spinner) findViewById(R.id.CSE_41XX_OPTION_1_ID_spinner);
        CSE_41XX_OPTION_2_Spiner = (Spinner) findViewById(R.id.CSE_41XX_OPTION_2_ID_spinner);
        CSE_41XX_OPTION_2_SESIONAL_Spiner = (Spinner) findViewById(R.id.CSE_41XX_OPTION_2_SEASONAL_ID_spinner);
        ME_4117_Spiner = (Spinner) findViewById(R.id.ME_4117_ID_spinner);

        Result = (Button)findViewById(R.id.Result_button_id);
        Reset = (Button)findViewById(R.id.Reset_button_id);



        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.GPA, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        CSE_4100_Spiner.setAdapter(adapter);
        CSE_4101_Spiner.setAdapter(adapter);
        CSE_4102_Spiner.setAdapter(adapter);
        CSE_4103_Spiner.setAdapter(adapter);
        CSE_4103_Spiner.setAdapter(adapter);
        CSE_4104_Spiner.setAdapter(adapter);
        CSE_41XX_OPTION_1_Spiner.setAdapter(adapter);
        CSE_41XX_OPTION_2_Spiner.setAdapter(adapter);
        CSE_41XX_OPTION_2_SESIONAL_Spiner.setAdapter(adapter);
        ME_4117_Spiner.setAdapter(adapter);
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
        CSE_4101();
        CSE_4102();
        CSE_4103();
        CSE_4104();
        CSE_41XX_OPTION_1();
        CSE_41XX_OPTION_2();
        CSE_41XX_OPTION_2_SESIONAL();
        ME_4117();
    }

    protected void Result()
    {
        Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double LevelThreeTermTwoResult = (CSE_4100+CSE_4101+CSE_4102+CSE_4103+CSE_4104+CSE_41XX_OPTION_1+CSE_41XX_OPTION_2+CSE_41XX_OPTION_2_SESIONAL+ME_4117)/21.00;
                if(LevelThreeTermTwoResult>=2.00&&LevelThreeTermTwoResult<=4.00)
                {
                    Toast.makeText(getApplicationContext(), LevelThreeTermTwoResult+" Hurrah Result Paisire41", Toast.LENGTH_LONG).show();
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

    protected void CSE_4101()
    {
        CSE_4101_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_4101 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_4102()
    {
        CSE_4102_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_4102 = sum * 0.75;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_4103()
    {
        CSE_4103_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_4103 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_4104()
    {
        CSE_4104_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_4104 = sum * 0.75;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_41XX_OPTION_1()
    {
        CSE_41XX_OPTION_1_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_41XX_OPTION_1 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_41XX_OPTION_2()
    {
        CSE_41XX_OPTION_2_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_41XX_OPTION_2 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void CSE_41XX_OPTION_2_SESIONAL()
    {
        CSE_41XX_OPTION_2_SESIONAL_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                CSE_41XX_OPTION_2_SESIONAL = sum * 1.50;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    protected void ME_4117()
    {
        ME_4117_Spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                ME_4117 = sum * 3.00;
                //Toast.makeText(getApplicationContext(), CSE_1101+" is ur result", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}
