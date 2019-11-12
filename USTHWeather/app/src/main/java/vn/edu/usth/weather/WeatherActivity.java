package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("InfoTag","onCreate");

        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("InfoTag", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("InfoTag", "onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("InfoTag", "onPause");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("InfoTag", "onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("InfoTag", "onDestroy");
    }
}
