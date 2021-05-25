package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

   /* @Override
    public void respond(String data) {

        FragmentManager fm=getSupportFragmentManager();
        FragmentB fragmentB= (FragmentB) fm.findFragmentById(R.id.fragment_2);
        fragmentB.changeText(data);
    }*/

    @Override
    public void respond(String data) {

        FragmentManager fm=getSupportFragmentManager();
        FragmentRetriveData fragmentRetriveData= (FragmentRetriveData) fm.findFragmentById(R.id.fragment_2);
        fragmentRetriveData.changeText(data);
    }
}
