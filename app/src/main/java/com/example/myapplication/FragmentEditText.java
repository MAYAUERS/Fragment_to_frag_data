package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentEditText extends Fragment  implements View.OnClickListener{

    Button button;
    Communicator communicator;
    EditText editText;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_edit,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

         communicator= (Communicator) getActivity();
         button=(Button)getActivity().findViewById(R.id.btn1);
         editText=(EditText)getActivity().findViewById(R.id.Edit_value);
         button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String s=editText.getText().toString();
        communicator.respond( s);
    }

}
