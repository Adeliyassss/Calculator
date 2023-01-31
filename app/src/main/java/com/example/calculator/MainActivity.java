package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Integer first, second;
    private boolean isOperationClick;
    private String operation;
    private Button resulty;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
        resulty=findViewById(R.id.btn_result);
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("1");
                } else {
                    textView.append("1");
                }
                break;

            case R.id.btn_two:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("2");
                } else {
                    textView.append("2");
                }
                break;

            case R.id.btn_three:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("3");
                } else {
                    textView.append("3");
                }
                break;

            case R.id.btn_four:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("4");
                } else {
                    textView.append("4");
                }
                break;

            case R.id.btn_five:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("5");
                } else {
                    textView.append("5");
                }
                break;

            case R.id.btn_six:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("6");
                } else {
                    textView.append("6");
                }
                break;

            case R.id.btn_seven:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("7");
                } else {
                    textView.append("7");
                }
                break;

            case R.id.btn_eight:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("8");
                } else {
                    textView.append("8");
                }
                break;

            case R.id.btn_nine:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("9");
                } else {
                    textView.append("9");
                }
                break;

                case R.id.btn_clear:
                textView.setText("0");
                first=0;
                second=0;
                break;

        }

        isOperationClick = false;

    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                first = Integer.valueOf(textView.getText().toString());
                isOperationClick = true;
                operation="+";
                break;


            case R.id.btn_minus:
                first = Integer.valueOf(textView.getText().toString());
                isOperationClick = true;
                operation="-";
                break;

            case R.id.btn_del:
                first = Integer.valueOf(textView.getText().toString());
                isOperationClick = true;
                operation="/";
                break;

            case R.id.btn_umn:
                first = Integer.valueOf(textView.getText().toString());
                isOperationClick = true;
                operation="*";
                break;

            case R.id.btn_equal:
                second = Integer.valueOf(textView.getText().toString());
                Integer result = 0;
               switch (operation){
                   case "+":
                       result=first+second;
                   textView.setText(result.toString());
                   resulty.setVisibility(View.VISIBLE);

                   break;

                   case "-":
                       result=first-second;
                       textView.setText(result.toString());
                       resulty.setVisibility(View.VISIBLE);
                       break;

                   case "*":
                       result=first*second;
                       textView.setText(result.toString());
                       resulty.setVisibility(View.VISIBLE);
                       break;

                   case "/":
                       result=first/second;
                       textView.setText(result.toString());
                       resulty.setVisibility(View.VISIBLE);
                       break;

               }

                break;


        }
    }



    public void onButtonClick(View view) {
        resulty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("KEY",textView.getText());
                textView.setText("0");
                resulty.setVisibility(View.GONE);
                startActivity(intent);
            }
        });
    }
}