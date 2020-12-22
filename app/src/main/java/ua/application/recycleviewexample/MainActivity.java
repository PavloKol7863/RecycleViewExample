package ua.application.recycleviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    FragmentTransaction ft;
    FragmentRecycle fragmentRecycle;
    FragmentLogin fragmentLogin;
    FragmentCreateAccount fragmentCreateAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        if (savedInstanceState == null) {
            ft = getSupportFragmentManager().beginTransaction();
          //  fragmentRecycle = new FragmentRecycle();

           //fragmentLogin = new FragmentLogin();

            fragmentCreateAccount = new FragmentCreateAccount();

            ft.replace(R.id.framagmet,fragmentCreateAccount);

            ft.commit();
        }
    }
}