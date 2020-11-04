package com.example.a0903;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button b1,b2;
    CheckBox cb1,cb2;
    RadioButton r1,r2;
    TextView ta3;
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ta3=(TextView)findViewById(R.id.ta3);
        //new > 사용할 객체는 new 위에 선언
        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ta3.setText("");
            }
        });
        b2=(Button)findViewById(R.id.b2);
        b2.setOnClickListener(this);
        cb1=(CheckBox)findViewById(R.id.cb1);
        cb1.setOnClickListener(new Ck());
        cb2=(CheckBox)findViewById(R.id.cb2);
        cb2.setOnClickListener(new Ck());
        r1=(RadioButton)findViewById(R.id.r1);
        r1.setOnClickListener(new A());
        r2=(RadioButton)findViewById(R.id.r2);
        r2.setOnClickListener(new A());
        ed1=(EditText)findViewById(R.id.ed1);
        ed2=(EditText)findViewById(R.id.ed2);




    }//onCreate


    class A implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            String n=((RadioButton)v).getText().toString();
            ta3.append(n+"선택\n");


        }
    }//A

    class Ck implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            boolean r=((CheckBox)v).isChecked();
            String name=((CheckBox)v).getText().toString();//사과or 바나나
            if(r==true)
                ta3.append(name+"선택");
            else
                ta3.append(name+"해지");

        }
    }//Ck

//b2-this
    @Override
    public void onClick(View v) {
        String name=ed1.getText().toString();
        String pw=ed2.getText().toString();
        ta3.append(name+":"+pw+"\n");
    }
}//class