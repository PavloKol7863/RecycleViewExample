package ua.application.recycleviewexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentLogin extends Fragment {
NavController navController;
Button btnLogin;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_login, parent, false);
navController = NavHostFragment.findNavController(this);
btnLogin = (Button)v.findViewById(R.id.button);
btnLogin.setOnClickListener(new View.OnClickListener() {
       @Override
    public void onClick(View v) {
        navController.navigate(R.id.fragmentCreateAccount);
    }
});
        return v;
    }
}
