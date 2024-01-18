package com.example.dateandtimepickers;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    int c_year,c_day,c_month, c_hour,c_min;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void timepicker(View view) {
        Calendar c=Calendar.getInstance();
        c_hour=c.get(Calendar.HOUR);
        c_min=c.get(Calendar.MINUTE);
        TimePickerDialog tp =new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {
                Toast.makeText(MainActivity.this,"TIME:"+i+"-"+i1,Toast.LENGTH_SHORT).show();
            }
        },c_hour,c_min,true);
        tp.show();
        }


    public void datepicker(View view) {
        Calendar c =Calendar.getInstance();
        c_year=c.get(Calendar.YEAR);
        c_month=c.get(Calendar.MONTH);
        c_day=c.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog dp=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                Toast.makeText(MainActivity.this,"DATE:"+i+"-"+(i1+1)+"-"+i2,
                        Toast.LENGTH_SHORT).show();
            }
        },c_year,c_month,c_day);
        dp.show();

    }
}