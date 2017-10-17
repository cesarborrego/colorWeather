package com.example.cesar.colorweather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public static final String TAG = MainActivity.class.getSimpleName();

    TextView daily;
    TextView hourly;
    TextView minutely;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initElements();
    }

    private void initElements() {
        daily = (TextView)findViewById(R.id.dailyId);
        daily.setOnClickListener(this);
        hourly = (TextView)findViewById(R.id.hourlyId);
        hourly.setOnClickListener(this);
        minutely = (TextView)findViewById(R.id.minutelyId);
        minutely.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.dailyId:
                intent = new Intent(getApplicationContext(), DailyWeatherActivity.class);
                startActivity(intent);
                break;
            case R.id.hourlyId:
                intent = new Intent(getApplicationContext(), HourlyWeatherActivity.class);
                startActivity(intent);
                break;
            case R.id.minutelyId:
                intent = new Intent(getApplicationContext(), MinutelyWeatherActivity.class);
                startActivity(intent);
                break;
        }
    }
}
