package ua.application.recycleviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    FragmentTransaction ft;
    FragmentRecycle fragmentRecycle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            ft = getSupportFragmentManager().beginTransaction();
            fragmentRecycle = new FragmentRecycle();
            ft.replace(R.id.framagmet,fragmentRecycle);
            ft.commit();
        }
    }
}