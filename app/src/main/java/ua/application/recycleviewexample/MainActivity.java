package ua.application.recycleviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    FragmentTransaction ft;
    FragmentRecycle fragmentRecycle;
    FragmentLogin fragmentLogin;
    FragmentCreateAccount fragmentCreateAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ft = getSupportFragmentManager().beginTransaction();
            fragmentRecycle = new FragmentRecycle();
           fragmentLogin = new FragmentLogin();
            fragmentCreateAccount = new FragmentCreateAccount();
        ft.replace(R.id.framagmet, fragmentLogin);
        ft.commit();


    }
    public void onClick(View v) {
        ft = getSupportFragmentManager().beginTransaction();
        switch(v.getId()){
            case R.id.button:
                ft.replace(R.id.framagmet,fragmentCreateAccount);
                break;
            case R.id.buttonAcount:
                ft.replace(R.id.framagmet, fragmentRecycle);
                break;
        }
        ft.addToBackStack(null);
        ft.commit();
    }
}