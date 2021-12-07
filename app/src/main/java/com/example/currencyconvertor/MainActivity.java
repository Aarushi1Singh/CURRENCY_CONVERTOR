+
        package com.example.currencyconvertor;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText enterAmount;
    TextView convertedAmount;
    Button convert;
    TextView currency_name;
    TextView currency_name2;
    String result, result2;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Initialisation of enter amount EditText
        enterAmount = findViewById(R.id.enterAmount);

        //Initialisation of TextView for result
        convertedAmount = findViewById(R.id.convertedAmount);

        //Initialisation of ImageButtons
        ImageButton japan =  findViewById(R.id.japan);
        ImageButton germany = findViewById(R.id.germany);
        ImageButton brazil = findViewById(R.id.brazil);
        ImageButton china = findViewById(R.id.china);
        ImageButton finland = findViewById(R.id.finand);
        ImageButton india = findViewById(R.id.india);
        ImageButton canada = findViewById(R.id.canada);
        ImageButton japan2 = findViewById(R.id.japan2);
        ImageButton germany2 = findViewById(R.id.germany2);
        ImageButton brazil2 = findViewById(R.id.brazil2);
        ImageButton china2 = findViewById(R.id.china2);
        ImageButton finland2 = findViewById(R.id.finland2);
        ImageButton india2 = findViewById(R.id.india2);
        ImageButton canada2 = findViewById(R.id.canada2);

        //Initialisation of convert Button
        convert = findViewById(R.id.convert);

        //Initialisation of TextViews
        currency_name = findViewById(R.id.display_currency);
        currency_name2 = findViewById(R.id.display_currency2);

        //working of ImageButtons in first HorizontalView
        //japan.setOnClickListener(v -> currency_name.setText("JAPAN : YEN"));
        japan.setOnClickListener(v -> {
            result = "japan";
            currency_name.setText("JAPAN : YEN");
        });

        //germany.setOnClickListener(v -> currency_name.setText("GERMANY : EURO"));
        germany.setOnClickListener(v -> {
            result = "germany";
            currency_name.setText("GERMANY : EURO");
        });

        //brazil.setOnClickListener(v -> currency_name.setText("BRAZIL : REAL"));
        brazil.setOnClickListener(v -> {
            result = "brazil";
            currency_name.setText("BRAZIL : REAL");
        });

        //china.setOnClickListener(v -> currency_name.setText("CHINA : RENMINBI"));
        china.setOnClickListener(v -> {
            result = "china";
            currency_name.setText("CHINA : RENMINBI");
        });

        //finland.setOnClickListener(v -> currency_name.setText("FINLAND : EURO"));
        finland.setOnClickListener(v -> {
            result = "finland";
            currency_name.setText("FINLAND : EURO");
        });

        //india.setOnClickListener(v -> currency_name.setText("INDIA : RUPEES"));
        india.setOnClickListener(v -> {
            result = "india";
            currency_name.setText("INDIA : RUPEES");
        });

        //canada.setOnClickListener(v -> currency_name.setText("CANADA : CANADIAN DOLLAR"));
        canada.setOnClickListener(v -> {
            result = "canada";
            currency_name.setText("CANADA : CANADIAN DOLLAR");
        });


        //working of ImageButtons on second HorizontalView
        //japan2.setOnClickListener(v -> currency_name2.setText("JAPAN : YEN"));
        japan2.setOnClickListener(v -> {
            result2 = "japan2";
            currency_name2.setText("JAPAN : YEN");
        });

        //germany2.setOnClickListener(v -> currency_name2.setText("GERMANY : EURO"));
        germany2.setOnClickListener(v -> {
            result2 = "germany2";
            currency_name2.setText("GERMANY : EURO");
        });

        //brazil2.setOnClickListener(v -> currency_name2.setText("BRAZIL : REAL"));
        brazil2.setOnClickListener(v -> {
            result2 = "brazil2";
            currency_name2.setText("BRAZIL : REAL");
        });

        //china2.setOnClickListener(v -> currency_name2.setText("CHINA : RENMINBI"));
        china2.setOnClickListener(v -> {
            result2 = "china2";
            currency_name2.setText("CHINA : RENMINBI");
        });

        //finland2.setOnClickListener(v -> currency_name2.setText("FINLAND : EURO"));
        finland2.setOnClickListener(v -> {
            result2 = "finland2";
            currency_name2.setText("FINLAND : EURO");
        });

        //india2.setOnClickListener(v -> currency_name2.setText("INDIA : RUPEES"));
        india2.setOnClickListener(v -> {
            result2 = "india2";
            currency_name2.setText("INDIA : RUPEES");
        });

        //canada2.setOnClickListener(v -> currency_name2.setText("CANADA : CANADIAN DOLLAR"));
        canada2.setOnClickListener(v -> {
            result2 = "canada2";
            currency_name2.setText("CANADA : CANADIAN DOLLAR");
        });


        //Function of convert Button
        convert.setOnClickListener(v -> {

            if(enterAmount.getText() != null) {

                Double value = Double.parseDouble(enterAmount.getText().toString());

                if(!result.isEmpty() && !result2.isEmpty()) {

                    //FROM JAPAN TO OTHER COUNTRIES
                    if (result.equals("japan") && result2.equals("japan2")) //&& japan2.isSelected()
                    {
                        value = value;
                    }
                    if (result.equals("japan") && result2.equals("germany2")) {
                        value = value * 0.0076;
                    }
                    if (result.equals("japan") && result2.equals("brazil2")) {
                        value = value * 0.045;
                    }
                    if (result.equals("japan") && result2.equals("china2")) {
                        value = value * 0.058;
                    }
                    if (result.equals("japan") && result2.equals("finland2")) {
                        value = value * 0.0076;
                    }
                    if (result.equals("japan") && result2.equals("india2")) {
                        value = value * 0.67;
                    }
                    if (result.equals("japan") && result2.equals("canada2")) {
                        value = value * 0.011;
                    }

                    //FROM GERMANY TO OTHER COUNTRIES
                    if (result.equals("germany") && result2.equals("japan2")) {
                        value = value * 132.25;
                    }
                    if (result.equals("germany") && result2.equals("germany2")) {
                        value = value;
                    }
                    if (result.equals("germany") && result2.equals("brazil2")) {
                        value = value * 5.89;
                    }
                    if (result.equals("germany") && result2.equals("china2")) {
                        value = value * 7.71;
                    }
                    if (result.equals("germany") && result2.equals("finland2")) {
                        value = value;
                    }
                    if (result.equals("germany") && result2.equals("india2")) {
                        value = value * 88.59;
                    }
                    if (result.equals("germany") && result2.equals("canada2")) {
                        value = value * 1.47;
                    }

                    //FROM BRAZIL TO OTHER COUNTRIES
                    if (result.equals("brazil") && result2.equals("japan2")) {
                        value = value * 22.45;
                    }
                    if (result.equals("brazil") && result2.equals("germany2")) {
                        value = value * 0.17;
                    }
                    if (result.equals("brazil") && result2.equals("brazil2")) {
                        value = value;
                    }
                    if (result.equals("brazil") && result2.equals("china2")) {
                        value = value * 1.31;
                    }
                    if (result.equals("brazil") && result2.equals("finland2")) {
                        value = value * 0.17;
                    }
                    if (result.equals("brazil") && result2.equals("india2")) {
                        value = value * 15.04;
                    }
                    if (result.equals("brazil") && result2.equals("canada2")) {
                        value = value * 0.25;
                    }

                    //FROM CHINA TO OTHER COUNTRIES
                    if (result.equals("china") && result2.equals("japan2")) {
                        value = value * 17.16;
                    }
                    if (result.equals("china") && result2.equals("germany2")) {
                        value = value * 0.13;
                    }
                    if (result.equals("china") && result2.equals("brazil2")) {
                        value = value * 0.76;
                    }
                    if (result.equals("china") && result2.equals("china2")) {
                        value = value;
                    }
                    if (result.equals("china") && result2.equals("finland2")) {
                        value = value * 0.13;
                    }
                    if (result.equals("china") && result2.equals("india2")) {
                        value = value * 11.50;
                    }
                    if (result.equals("china") && result2.equals("canada2")) {
                        value = value * 0.19;
                    }

                    //FROM FINLAND TO OTHER COUNTRIES
                    if (result.equals("finland") && result2.equals("japan2")) {
                        value = value * 132.25;
                    }
                    if (result.equals("finland") && result2.equals("germany2")) {
                        value = value;
                    }
                    if (result.equals("finland") && result2.equals("brazil2")) {
                        value = value * 5.86;
                    }
                    if (result.equals("finland") && result2.equals("china2")) {
                        value = value * 7.71;
                    }
                    if (result.equals("finland") && result2.equals("finland2")) {
                        value = value;
                    }
                    if (result.equals("finland") && result2.equals("india2")) {
                        value = value * 88.58;
                    }
                    if (result.equals("finland") && result2.equals("canada2")) {
                        value = value * 1.47;
                    }

                    //FROM INDIA TO OTHER COUNTRIES
                    if (result.equals("india") && result2.equals("japan2")) {
                        value = value * 1.49;
                    }
                    if (result.equals("india") && result2.equals("germany2")) {
                        value = value * 0.011;
                    }
                    if (result.equals("india") && result2.equals("brazil2")) {
                        value = value * 0.066;
                    }
                    if (result.equals("india") && result2.equals("china2")) {
                        value = value * 0.087;
                    }
                    if (result.equals("india") && result2.equals("finland2")) {
                        value = value * 0.011;
                    }
                    if (result.equals("india") && result2.equals("india2")) {
                        value = value;
                    }
                    if (result.equals("india") && result2.equals("canada2")) {
                        value = value * 0.017;
                    }

                    //FROM CANADA TO OTHER COUNTRIES
                    if (result.equals("canada") && result2.equals("japan2")) {
                        value = value * 90.14;
                    }
                    if (result.equals("canada") && result2.equals("germany2")) {
                        value = value * 0.68;
                    }
                    if (result.equals("canada") && result2.equals("brazil2")) {
                        value = value * 3.99;
                    }
                    if (result.equals("canada") && result2.equals("china2")) {
                        value = value * 5.25;
                    }
                    if (result.equals("canada") && result2.equals("finland2")) {
                        value = value * 0.68;
                    }
                    if (result.equals("canada") && result2.equals("india2")) {
                        value = value * 60.39;
                    }
                    if (result.equals("canada") && result2.equals("canada2")) {
                        value = value;
                    }
                    String final_value = String.format("%.2f", value);
                    convertedAmount.setText(final_value.toString());
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Please select county", Toast.LENGTH_SHORT).show();
                }

            }
            else
            {
                Toast.makeText(getApplicationContext(), "Please enter amount", Toast.LENGTH_SHORT).show();
            }
        });



    }
}