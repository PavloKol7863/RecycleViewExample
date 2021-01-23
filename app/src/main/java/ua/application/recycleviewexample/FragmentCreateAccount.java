package ua.application.recycleviewexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

public class FragmentCreateAccount extends Fragment  {
    NavController navController;
    Button btnCreateAcount;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_create_account, parent, false);
        navController = NavHostFragment.findNavController(this);
         btnCreateAcount = (Button) v.findViewById(R.id.buttonAcount);
         btnCreateAcount.setOnClickListener(v1 -> navController.navigate(R.id.fragmentRecycle));
        return v;
    }
}
