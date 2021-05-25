package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentA extends Fragment  implements View.OnClickListener{

    Button button;

    int counter=0;
    Communicator communicator;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_a,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

         communicator= (Communicator) getActivity();
         button=(Button)getActivity().findViewById(R.id.btn1);
         button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        counter++;
        communicator.respond("The Button Was Clicked "+ counter + " times");
    }

}
