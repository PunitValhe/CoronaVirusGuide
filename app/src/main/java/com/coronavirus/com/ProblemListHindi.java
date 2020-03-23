package com.coronavirus.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ProblemListHindi extends Activity {
    TextView new_txt1,new_txt2,new_txt3,new_txt4,new_txt5,new_txt6;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.problem_list_hindi);

        new_txt1=(TextView)findViewById(R.id.new_txt1);
        new_txt2=(TextView)findViewById(R.id.new_txt2);
        new_txt3=(TextView)findViewById(R.id.new_txt3);
        new_txt4=(TextView)findViewById(R.id.new_txt4);
        new_txt5=(TextView)findViewById(R.id.new_txt5);
        new_txt6=(TextView)findViewById(R.id.new_txt6);


        new_txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProblemListHindi.this,New_TxtDisplayActivity.class);
                intent.putExtra("type","7");
                intent.putExtra("header",new_txt1.getText().toString());
                startActivity(intent);
            }
        });
        new_txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProblemListHindi.this,New_TxtDisplayActivity.class);
                intent.putExtra("type","8");
                intent.putExtra("header",new_txt2.getText().toString());
                startActivity(intent);
            }
        });
        new_txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProblemListHindi.this,New_TxtDisplayActivity.class);
                intent.putExtra("type","9");
                intent.putExtra("header",new_txt3.getText().toString());
                startActivity(intent);
            }
        });
        new_txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProblemListHindi.this,New_TxtDisplayActivity.class);
                intent.putExtra("type","10");
                intent.putExtra("header",new_txt4.getText().toString());
                startActivity(intent);
            }
        });
        new_txt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProblemListHindi.this,New_TxtDisplayActivity.class);
                intent.putExtra("type","12");
                intent.putExtra("header",new_txt5.getText().toString());
                startActivity(intent);
            }
        });
        new_txt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProblemListHindi.this,New_TxtDisplayActivity.class);
                intent.putExtra("type","12");
                intent.putExtra("header",new_txt6.getText().toString());
                startActivity(intent);
            }
        });

    }
}
