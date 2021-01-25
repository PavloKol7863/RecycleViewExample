package ua.application.recycleviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       NavHostFragment host = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.navFragment);
       navController = host.getNavController();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        NavigationUI.setupWithNavController(navigationView, navController);

    }
}