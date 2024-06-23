package com.example.project;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity
        implements BottomNavigationView
        .OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView
                = findViewById(R.id.bottomNavigationView);

        bottomNavigationView
                .setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);
    }

    firstFragment firstFragment = new firstFragment();
    secondFragment secondFragment = new secondFragment();
    thirdFragment thirdFragment = new thirdFragment();
    forthFragment forthFragment = new forthFragment();
    fifthFragment fifthFragment = new fifthFragment();
    sixthFragment sixthFragment = new sixthFragment();
    seventhFragment seventhFragment = new seventhFragment();
    eightFragment eightFragment = new eightFragment();
    ninethFragment ninethFragment = new ninethFragment();
    tenthFragment tenthFragment = new tenthFragment();
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.home) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragmentOne, firstFragment).commit();
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragmentTwo, secondFragment).commit();
            return true;
        } else if (item.getItemId() == R.id.person) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragmentOne, sixthFragment).commit();
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragmentTwo, seventhFragment).commit();
            return true;
        }  else if (item.getItemId() == R.id.portfolio) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragmentOne, fifthFragment).commit();
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragmentTwo, eightFragment).commit();
            return true;
        } else if (item.getItemId() == R.id.gallery) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragmentOne, ninethFragment).commit();
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragmentTwo, tenthFragment).commit();
            return true;
        }
        else if (item.getItemId() == R.id.settings) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragmentOne, forthFragment).commit();
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragmentTwo, thirdFragment).commit();
            return true;
        }
        return false;
    }
}