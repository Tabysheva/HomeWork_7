package com.example.homework_7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements IEdetTextFR,IRecyclerFr{
 Edit_Text_Fragment edittextFragment = Edit_Text_Fragment.createTextFragment(this);
 Text_Fragment textFragment = Text_Fragment.createRecyclerFfagment(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeFragment(edittextFragment);
    }

    public void changeFragment(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container,fragment);
        transaction.commit();
    }

    @Override
    public void getInfoToRecycler(Task task) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("key",task);
        textFragment.setArguments(bundle);
        changeFragment(textFragment);

    }

    @Override
    public void goToEditTextFr() {
        changeFragment(edittextFragment);

    }
}
