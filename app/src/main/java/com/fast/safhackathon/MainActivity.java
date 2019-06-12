package com.fast.safhackathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   /* EditText number1;
    EditText number2;
    Button Add_button;
    TextView result;*/

    TextView tvCounter;
    TextView tvCounter1;
    TextView tvCounter2;
    TextView tvCounter3;
    TextView tvCounter4;
    TextView tvCounter5;
    TextView tvCounter6;
    TextView tvCounter7;
    TextView tvCounter8;
    TextView tvCounter9;
    TextView tvCounter10;
    TextView tvCounter11;
    TextView tvCounter12;
    TextView tvCounter13;
    TextView tvCounter14;
    TextView tvCounter15;
    TextView tvCounter16;
    TextView tvCounter17;
    TextView tvCounter18;
    TextView tvCounter19;
    TextView tvCounter20;
    TextView tvCounter21;
    TextView tvCounter22;

    Button btnIncrement;
    Button btndecrement;
    int mint2;
    int mint3;
    int minteger = 50;
    int deposit;
    int total;
    int total1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // by ID we can use each component which id is assign in xml file
       /* number1=(EditText) findViewById(R.id.amount_edittext);
        Add_button=(Button) findViewById(R.id.add_button);
        result = (TextView) findViewById(R.id.textView_answer);*/

        tvCounter = findViewById(R.id.tvCounter);
        tvCounter1 = findViewById(R.id.tvCounter1);
        tvCounter2 = findViewById(R.id.tvCounter2);
        tvCounter3 = findViewById(R.id.tvCounter3);
        tvCounter4 = findViewById(R.id.tvCounter4);
        tvCounter5 = findViewById(R.id.tvCounter5);
        tvCounter6 = findViewById(R.id.tvCounter6);
        tvCounter7 = findViewById(R.id.tvCounter7);
        tvCounter8 = findViewById(R.id.tvCounter8);
        tvCounter9 = findViewById(R.id.tvCounter9);
        tvCounter10 = findViewById(R.id.tvCounter10);
        tvCounter11 = findViewById(R.id.tvCounter11);
        tvCounter12 = findViewById(R.id.tvCounter12);
        tvCounter13 = findViewById(R.id.tvCounter13);
        tvCounter14 = findViewById(R.id.tvCounter14);
        tvCounter15 = findViewById(R.id.tvCounter15);
        tvCounter16 = findViewById(R.id.tvCounter16);
        tvCounter17 = findViewById(R.id.tvCounter17);
        tvCounter18 = findViewById(R.id.tvCounter18);
        tvCounter19 = findViewById(R.id.tvCounter19);
        tvCounter20 = findViewById(R.id.tvCounter20);
        tvCounter21 = findViewById(R.id.tvCounter21);
        tvCounter22 = findViewById(R.id.tvCounter22);


        btnIncrement = findViewById(R.id.btnIncrement);
        btndecrement = findViewById(R.id.btndecrement);

        //on app launch TextView will show zero
        tvCounter.setText("50");
        tvCounter1.setText("50");
        tvCounter2.setText("50");
        tvCounter3.setText("100");


        tvCounter4.setText("150");
        tvCounter5.setText("150");
       tvCounter6.setText("300");
        tvCounter7.setText("200");
       tvCounter8.setText("500");
        tvCounter9.setText("250");
       tvCounter10.setText("750");
        tvCounter11.setText("300");
      tvCounter12.setText("1050");
        tvCounter13.setText("350");
       tvCounter14.setText("1400");
        tvCounter15.setText("400");
       tvCounter16.setText("1800");
        tvCounter17.setText("450");
       tvCounter18.setText("2250");
        tvCounter19.setText("500");
        tvCounter20.setText("2750");
        tvCounter21.setText("550");
        tvCounter22.setText("3300");
        //final int[] counter = {0};


        // Add_button add clicklistener
        /*Add_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // num1 or num2 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(number1.getText().toString());
                // add both number and store it to sum
                double sum = num1+num1;
                // set it ot result textview
                result.setText(Double.toString(sum));
            }
        });*/


            btnIncrement.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    counter[0] = counter[0] + 1;
                    minteger = minteger + 1;
                    tvCounter.setText(String.valueOf(minteger));
                    mint2 = minteger;

                    //week1 deposit
                    deposit = mint2*1;
                    tvCounter1.setText(String.valueOf(deposit));

                    //week2 deposit
                    deposit = mint2*2;
                    tvCounter3.setText(String.valueOf(deposit));

                    //week3 deposit
                    deposit = mint2*3;
                    tvCounter5.setText(String.valueOf(deposit));

                    //week4 deposit
                    deposit = mint2*4;
                    tvCounter7.setText(String.valueOf(deposit));

                    //week5 deposit
                    deposit = mint2*5;
                    tvCounter9.setText(String.valueOf(deposit));

                    //week6 deposit
                    deposit = mint2*6;
                    tvCounter11.setText(String.valueOf(deposit));

                    //week7 deposit
                    deposit = mint2*7;
                    tvCounter13.setText(String.valueOf(deposit));

                    //week8 deposit
                    deposit = mint2*8;
                    tvCounter15.setText(String.valueOf(deposit));

                    //week9 deposit
                    deposit = mint2*9;
                    tvCounter17.setText(String.valueOf(deposit));

                    //week10 deposit
                    deposit = mint2*10;
                    tvCounter19.setText(String.valueOf(deposit));

                    //week11 deposit
                    deposit = mint2*10;
                    tvCounter21.setText(String.valueOf(deposit));

                    mint3 = minteger;

                    total = mint3;
                    total1=total;
                    //counter[0] = counter[0] * 3;
                    tvCounter2.setText(String.valueOf(total));

                    //total


                    mint3 = minteger;

                    total = total1+mint3;
                    //counter[0] = counter[0] * 3;
                    tvCounter4.setText(String.valueOf(total));
                    mint3 = minteger;

                    total = deposit+mint3;
                    //counter[0] = counter[0] * 3;
                    tvCounter6.setText(String.valueOf(total));
                    mint3 = minteger;

                    total = deposit+mint3;
                    //counter[0] = counter[0] * 3;
                    tvCounter8.setText(String.valueOf(total));
                    mint3 = minteger;

                    total = deposit+mint3;
                    //counter[0] = counter[0] * 3;
                    tvCounter10.setText(String.valueOf(total));
                    mint3 = minteger;

                    total = deposit+mint3;
                    //counter[0] = counter[0] * 3;
                    tvCounter12.setText(String.valueOf(total));
                    mint3 = minteger;

                    total = deposit+mint3;
                    //counter[0] = counter[0] * 3;
                    tvCounter14.setText(String.valueOf(total));
                    mint3 = minteger;

                    total = deposit+mint3;
                    //counter[0] = counter[0] * 3;
                    tvCounter16.setText(String.valueOf(total));

                    mint3 = minteger;

                    total = deposit+mint3;
                    //counter[0] = counter[0] * 3;
                    tvCounter18.setText(String.valueOf(total));

                    mint3 = minteger;

                    total = deposit+mint3;
                    //counter[0] = counter[0] * 3;
                    tvCounter20.setText(String.valueOf(total));

                    mint3 = minteger;

                    total = deposit+mint3;
                    //counter[0] = counter[0] * 3;
                    tvCounter22.setText(String.valueOf(total));
                }
            });

        btndecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                    counter[0] = counter[0] + 1;
                minteger = minteger - 1;
                tvCounter.setText(String.valueOf(minteger));

                mint2 = minteger;

                //week1 deposit
                deposit = mint2*1;
                tvCounter1.setText(String.valueOf(deposit));

                //week2 deposit
                deposit = mint2*2;
                tvCounter3.setText(String.valueOf(deposit));

                //week4 deposit
                deposit = mint2*4;
                tvCounter7.setText(String.valueOf(deposit));

                //week5 deposit
                deposit = mint2*5;
                tvCounter9.setText(String.valueOf(deposit));

                //week6 deposit
                deposit = mint2*6;
                tvCounter11.setText(String.valueOf(deposit));

                //week7 deposit
                deposit = mint2*7;
                tvCounter13.setText(String.valueOf(deposit));

                //week8 deposit
                deposit = mint2*8;
                tvCounter15.setText(String.valueOf(deposit));

                //week9 deposit
                deposit = mint2*9;
                tvCounter17.setText(String.valueOf(deposit));

                //week10 deposit
                deposit = mint2*10;
                tvCounter19.setText(String.valueOf(deposit));

                //week11 deposit
                deposit = mint2*10;
                tvCounter21.setText(String.valueOf(deposit));

                mint3 = minteger;
                total = mint3;
                //counter[0] = counter[0] * 3;
                tvCounter2.setText(String.valueOf(total));


                //total

                //total


                mint3 = minteger;

                total = deposit+mint3;
                //counter[0] = counter[0] * 3;
                tvCounter4.setText(String.valueOf(total));
                mint3 = minteger;

                total = deposit+mint3;
                //counter[0] = counter[0] * 3;
                tvCounter6.setText(String.valueOf(total));
                mint3 = minteger;

                total = deposit+mint3;
                //counter[0] = counter[0] * 3;
                tvCounter8.setText(String.valueOf(total));
                mint3 = minteger;

                total = deposit+mint3;
                //counter[0] = counter[0] * 3;
                tvCounter10.setText(String.valueOf(total));
                mint3 = minteger;

                total = deposit+mint3;
                //counter[0] = counter[0] * 3;
                tvCounter12.setText(String.valueOf(total));
                mint3 = minteger;

                total = deposit+mint3;
                //counter[0] = counter[0] * 3;
                tvCounter14.setText(String.valueOf(total));
                mint3 = minteger;

                total = deposit+mint3;
                //counter[0] = counter[0] * 3;
                tvCounter16.setText(String.valueOf(total));

                mint3 = minteger;

                total = deposit+mint3;
                //counter[0] = counter[0] * 3;
                tvCounter18.setText(String.valueOf(total));

                mint3 = minteger;

                total = deposit+mint3;
                //counter[0] = counter[0] * 3;
                tvCounter20.setText(String.valueOf(total));

                mint3 = minteger;

                total = deposit+mint3;
                //counter[0] = counter[0] * 3;
                tvCounter22.setText(String.valueOf(total));
            }
        });

        }


}
