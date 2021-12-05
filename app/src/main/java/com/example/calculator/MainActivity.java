package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bsum,bsub,bmul,bdiv,bc,bac,bpoint,bcal;
    EditText edtresult;
    float mValueOne, mValueTwo;
    boolean mAddition, mSubtract, mMultiplication, mDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        bc = (Button) findViewById(R.id.bc);
        bac = (Button) findViewById(R.id.bac);
        bcal = (Button) findViewById(R.id.bcal);
        bsum = (Button) findViewById(R.id.bsum);
        bsub = (Button) findViewById(R.id.bsub);
        bmul = (Button) findViewById(R.id.bmul);
        bdiv = (Button) findViewById(R.id.bdiv);
        bpoint = (Button) findViewById(R.id.bpoint);
        edtresult = (EditText) findViewById(R.id.edtresult);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText(edtresult.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText(edtresult.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText(edtresult.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText(edtresult.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText(edtresult.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText(edtresult.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText(edtresult.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText(edtresult.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText(edtresult.getText() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText(edtresult.getText() + "0");
            }
        });

        bsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edtresult == null) {
                    edtresult.setText("");
                } else {
                    mValueOne = Float.parseFloat(edtresult.getText() + "");
                    mAddition = true;
                    edtresult.setText(null);
                }
            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edtresult.getText() + "");
                mSubtract = true;
                edtresult.setText(null);
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edtresult.getText() + "");
                mMultiplication = true;
                edtresult.setText(null);
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edtresult.getText() + "");
                mDivision = true;
                edtresult.setText(null);
            }
        });

        bcal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(edtresult.getText() + "");

                if (mAddition == true) {
                    edtresult.setText(mValueOne + mValueTwo + "");
                    mAddition = false;
                }

                if (mSubtract == true) {
                    edtresult.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (mMultiplication == true) {
                    edtresult.setText(mValueOne * mValueTwo + "");
                    mMultiplication = false;
                }

                if (mDivision == true) {
                    edtresult.setText(mValueOne / mValueTwo + "");
                    mDivision = false;
                }
            }
        });

        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText("");
            }
        });

        bpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtresult.setText(edtresult.getText() + ".");
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                String word = edtresult.getText().toString();
                int input = word.length();
                if (input > 0){
                    edtresult.setText(word.substring(0, input-1));
                }
            }
        });
    }
}