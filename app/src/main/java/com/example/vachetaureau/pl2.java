package com.example.vachetaureau;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
public class pl2 extends Fragment {
    View view;
    ImageButton ok;
    EditText ecran2;
    String pl2nbr;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.pl2, container, false);
        ecran2=(EditText)view.findViewById(R.id.ecran2);
        ok= (ImageButton) view.findViewById(R.id.secondButton);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pl2nbr=ecran2.getText().toString();
                easy m1=(easy)getActivity();
                m1.f1(pl2nbr);
             //   Toast.makeText(getActivity(), "Good Luck 2"+pl2nbr, Toast.LENGTH_LONG).show();
                ecran2.setText("");
            }
        });
        return view;
    }
}

