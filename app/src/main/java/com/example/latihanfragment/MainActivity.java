package com.example.latihanfragment;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){
                    case R.id.menu_home:
                         getFragmentPage(new HomeFragment());
                        break;


                    case R.id.menu_favorite:
                        getFragmentPage(new FavoriteFragment());
                        break;


                    case R.id.menu_mahasiswa:
                        getFragmentPage(new MahasiswaFragment());
                        break;
                }


                return true;
            }
        });

    }

    private boolean getFragmentPage(Fragment fragment){
        if (fragment!= null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.main_container,fragment)
                    .commit();
            return true;
        }

        return false;
    }
}
