package com.coronavirus.com;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class New_TxtDisplayActivity extends AppCompatActivity {
    protected static final String TAG = "New_TxtDisplayActivity";
    LinearLayout adChoicesContainer;
    @Nullable
    private LinearLayout adView;
    String header;
    String type;

    public New_TxtDisplayActivity() {
        String str = "";
        this.header = str;
        this.type = str;
    }


    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_new_txtdisplay_text);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (getIntent() != null) {
            this.type = getIntent().getStringExtra("type");
            this.header = getIntent().getStringExtra("header");
            ((TextView) findViewById(R.id.txtHeader)).setText(this.header);
            if (this.type.equalsIgnoreCase("1")) {
                ((TextView) findViewById(R.id.txtData)).setText(getString(R.string.new_txt1));
            } else if (this.type.equalsIgnoreCase("2")) {
                ((TextView) findViewById(R.id.txtData)).setText(getString(R.string.new_txt2));
            } else if (this.type.equalsIgnoreCase("3")) {
                ((TextView) findViewById(R.id.txtData)).setText(getString(R.string.new_txt3));
            } else if (this.type.equalsIgnoreCase("4")) {
                ((TextView) findViewById(R.id.txtData)).setText(getString(R.string.new_txt4));
            } else if (this.type.equalsIgnoreCase("5")) {
                ((TextView) findViewById(R.id.txtData)).setText(getString(R.string.new_txt5));
            } else if (this.type.equalsIgnoreCase("6")) {
                ((TextView) findViewById(R.id.txtData)).setText(getString(R.string.new_txt6));
            } else if (this.type.equalsIgnoreCase("7")) {
                ((TextView) findViewById(R.id.txtData)).setText(getString(R.string.new_txt7));
            } else if (this.type.equalsIgnoreCase("8")) {
                ((TextView) findViewById(R.id.txtData)).setText(getString(R.string.new_txt8));
            } else if (this.type.equalsIgnoreCase("9")) {
                ((TextView) findViewById(R.id.txtData)).setText(getString(R.string.new_txt9));
            } else if (this.type.equalsIgnoreCase("10")) {
                ((TextView) findViewById(R.id.txtData)).setText(getString(R.string.new_txt10));
            } else if (this.type.equalsIgnoreCase("11")) {
                ((TextView) findViewById(R.id.txtData)).setText(getString(R.string.new_txt11));
            } else if (this.type.equalsIgnoreCase("12")) {
                ((TextView) findViewById(R.id.txtData)).setText(getString(R.string.new_txt12));
            }
        }
    }
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
