package com.example.student.lamhonghuy_16011221;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnShow(View v){
        EditText a = (EditText)findViewById(R.id.etxtname);
        String ten = a.getText().toString();
        TextView kq = (TextView)findViewById(R.id.txtvName);
        kq.setText("Xin chao " + ten);
    }
    public void btnGoodbye(View v){
        EditText a = (EditText)findViewById(R.id.etxtname);
        String ten = a.getText().toString();
        TextView kq = (TextView)findViewById(R.id.txtvName);
        kq.setText("Goodbye " + ten);
    }
}
