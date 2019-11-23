package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {

    public class HomeFragmentPagerAdapter extends FragmentPagerAdapter {
        private final int PAGE_COUNT = 3;
        private String titles[] = new String[] { "Venice", "Vatican", "Rome" };

        public HomeFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public int getCount() {
            return PAGE_COUNT;
        }

        @Override
        public Fragment getItem(int page) {
            switch (page) {
                case 0: return WeatherAndForecastFragment.newInstance();
                case 1: return WeatherAndForecastFragment.newInstance();
                case 2: return WeatherAndForecastFragment.newInstance();
            }
            return null;
        }
        @Override
        public CharSequence getPageTitle(int page) {
            return titles[page];
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("InfoTag", "onCreate");

        PagerAdapter adapter = new HomeFragmentPagerAdapter(getSupportFragmentManager());
        ViewPager pager = findViewById(R.id.pager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab);

        pager.setOffscreenPageLimit(3);
        pager.setAdapter(adapter);
        tabLayout.setupWithViewPager(pager);
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
