package com.coronavirus.com;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (ImageView) findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle((CharSequence) "Choose language");
                builder.setSingleChoiceItems((CharSequence[]) new String[]{"English", "Hindi"}, -1, (DialogInterface.OnClickListener) new ForAddress(MainActivity.this));
                builder.show();
            }
        });
    }

    class ForAddress implements DialogInterface.OnClickListener {
        MainActivity triangle_mainActivity1;

        ForAddress(MainActivity mainActivity) {
            this.triangle_mainActivity1 = mainActivity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AlertDialog alertDialog = (AlertDialog) dialogInterface;
            if (alertDialog.getListView().getCheckedItemPosition() == 0) {
                //MainActivity.stringNew = "English";


                Intent intent = new Intent(MainActivity.this, ProblemListEnglish.class);
                this.triangle_mainActivity1.startActivity(intent);
                dialogInterface.dismiss();
            } else if (alertDialog.getListView().getCheckedItemPosition() == 1) {
                // MainActivity.stringNew = "Hindi";

                Intent intent2 = new Intent(MainActivity.this, ProblemListHindi.class);
                this.triangle_mainActivity1.startActivity(intent2);
                dialogInterface.dismiss();

            }
        }
    }

}
