package com.internet.hw_add_et_dis_tv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.AlertDialog.Builder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText editFirstNo, editSecondNo;
    Button btnAdd;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editFirstNo = (EditText) findViewById(R.id.editFirstNo);
        editSecondNo = (EditText) findViewById(R.id.editSecondNo);
        textView3 = (TextView) findViewById(R.id.textView3);
        btnAdd = (Button) findViewById(R.id.btnAdd);



        btnAdd.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        if((editFirstNo.getText().toString().length() == 0 )|| (editSecondNo.getText().toString().length() == 0))
        {
            showMessage("Error","Please enter all values");
            return;
        }
        double a = Double.parseDouble(String.valueOf(editFirstNo.getText()));
        double b = Double.parseDouble(String.valueOf(editSecondNo.getText()));
        double c = a+b;
        textView3.setText("Add:"+c);
    }
    public void showMessage(String title, String Message)
    {
        Builder builder = new Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();

    }
}
