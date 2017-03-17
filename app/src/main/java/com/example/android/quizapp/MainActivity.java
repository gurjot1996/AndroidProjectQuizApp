package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.name;
import static android.R.id.message;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score=0;
    //this method gets invoked on button click
    public void result(View view)
    {
        //calling methods for different questions
        q1();
        q2();
        q3();
        q4();
        q5();
        //displaying final result string
        TextView res=(TextView)findViewById(R.id.testresult);
        res.setText(resultis());
    }
    //method for question 1
    public void q1()
    {
        RadioButton op1=(RadioButton)findViewById(R.id.q1op1);
        boolean ansop1=op1.isChecked();

        RadioButton op2=(RadioButton)findViewById(R.id.q1op2);
        boolean ansop2=op2.isChecked();

        RadioButton op3=(RadioButton)findViewById(R.id.q1op3);
        boolean ansop3=op3.isChecked();

        RadioButton op4=(RadioButton)findViewById(R.id.q1op4);
        boolean ansop4=op4.isChecked();

        if(ansop1==false && ansop2==false && ansop3==true && ansop4==false)
        {
            Log.v("answer of q1",op3.getText().toString());
            score=score+1;
        }
    }

    //method for question 2
    public void q2()
    {

        RadioButton op1=(RadioButton)findViewById(R.id.q2op1);
        boolean ansop1=op1.isChecked();

        RadioButton op2=(RadioButton)findViewById(R.id.q2op2);
        boolean ansop2=op2.isChecked();

        RadioButton op3=(RadioButton)findViewById(R.id.q2op3);
        boolean ansop3=op3.isChecked();

        RadioButton op4=(RadioButton)findViewById(R.id.q2op4);
        boolean ansop4=op4.isChecked();

        if(ansop1==false && ansop2==false && ansop3==false && ansop4==true)
        {
            Log.v("answer of q1",op4.getText().toString());
            score=score+1;
        }
    }

    //method for question 3
    public void q3()
    {

        RadioButton op1=(RadioButton)findViewById(R.id.q3op1);
        boolean ansop1=op1.isChecked();

        RadioButton op2=(RadioButton)findViewById(R.id.q3op2);
        boolean ansop2=op2.isChecked();

        RadioButton op3=(RadioButton)findViewById(R.id.q3op3);
        boolean ansop3=op3.isChecked();

        RadioButton op4=(RadioButton)findViewById(R.id.q3op4);
        boolean ansop4=op4.isChecked();

        if(ansop1==true && ansop2==false && ansop3==false && ansop4==false)
        {
            Log.v("answer of q1",op1.getText().toString());
            score=score+1;
        }
    }

    //method for question 4
    public void q4()
    {
        CheckBox op1=(CheckBox)findViewById(R.id.q4op1);
        boolean ansop1=op1.isChecked();

        CheckBox op2=(CheckBox)findViewById(R.id.q4op2);
        boolean ansop2=op2.isChecked();

        CheckBox op3=(CheckBox)findViewById(R.id.q4op3);
        boolean ansop3=op3.isChecked();

        CheckBox op4=(CheckBox)findViewById(R.id.q4op4);
        boolean ansop4=op4.isChecked();

        if(ansop1==true && ansop2==true && ansop3==false && ansop4==true)
        {
            Log.v("answer of q1",op3.getText().toString());
            score=score+1;
        }
    }

    //method for question 5
    public void q5()
    {
        EditText obj=(EditText)findViewById(R.id.textanswer);
        String answer= obj.getText().toString();
        if(answer.equalsIgnoreCase("egypt"))
        {
            Log.v("answer of q5",obj.getText().toString());
            score=score+1;
        }
    }

    //method for returning the finalstring result
    public String resultis()
    {
        EditText nameobj=(EditText)findViewById(R.id.namefield);
        String nam=nameobj.getText().toString();
        String finalresult="Name of Participant : "+nam;
        finalresult=finalresult+"\n\nFinal Score is : "+score+"/"+"5";
        finalresult=finalresult+"\n\nCorrect answers :"+score+"\n\nIncorrect answers :"+(5-score);

        //Toast message for user
        if(score<5) {
            Toast.makeText(this, "Score : "+score+"/"+"5", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Not a perfect Score !!!Keep trying", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "TIP:Try Reviewing all your answer's", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Then click END TEST again ", Toast.LENGTH_SHORT).show();
        }
        else if(score==5){
            Toast.makeText(this,"PERFECT SCORE 5/5 !!!",Toast.LENGTH_SHORT).show();
            Toast.makeText(this,"BRILLIANT!!!",Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Hope You Enjoyed Taking the Quiz", Toast.LENGTH_SHORT).show();}
        //clearing the score variable value
        score=0;
        return finalresult;
    }

}
