package com.example.tacademy.fragmentchange;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

public class MainActivity extends FragmentActivity {

    //LinearLayout base;
    Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //base = (LinearLayout)this.findViewById(R.id.base);
        change(0);
    }
    public void on1(View view){
        change(0);
    }
    public void on2(View view){
        change(1);
    }
    public void on3(View view){
        change(2);
    }
    public void change(int index)
    {
        switch (index){
            case 0:
                fragment = new OneFragment();
                break;
            case 1:
                fragment = new TwoFragment();
                break;
            case 2:
                fragment = new ThirdFragment();
                break;
        }
        // 한개의 자리를 다른 fragment로 교체 하는 코드
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.base, fragment);
        transaction.commit();
    }
}
