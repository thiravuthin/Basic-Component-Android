package com.example.designui.datetimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import com.example.designui.R;

import java.sql.Time;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimePickerActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2;
    EditText editText1, editText2;
    int mYea;
    int mMonth;
    int mDay;
    EditText edtDate, edtTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time_picker);

        edtDate = findViewById(R.id.editText1);
        edtTime = findViewById(R.id.editText2);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == button1) {

            // select current Date
            Calendar c = Calendar.getInstance();
            mYea = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog dialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                    //String selectedDate = "Day: "+day+"month: "+month+1+ "Year :"+year;
                    String date = String.join("/", String.valueOf(day), String.valueOf(month + 1), String.valueOf(year));
                    edtDate.setText(date);
                }
            }, mYea, mMonth, mDay);
            dialog.show();
        }
        if (view == button2) {
            // Get Current
            Calendar c = Calendar.getInstance();
            int mHours = c.get(Calendar.HOUR_OF_DAY);
            int mMinutes = c.get(Calendar.MINUTE);

            TimePickerDialog dialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timePicker, int hours, int minus) {
                    edtTime.setText(getTime(hours, minus));
                }
            }, mHours, mMinutes, false);
            dialog.show();
        }
    }

    private String getTime(int hr, int min) {
        Time tme = new Time(hr, min, 0);
        Format formater;
        formater = new SimpleDateFormat("h :mm a");
        return formater.format(tme);
    }
}