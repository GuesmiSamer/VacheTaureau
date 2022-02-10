package com.example.vachetaureau;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
public class Player2 extends Fragment {
    View view;
    ImageButton ok;
    EditText ecran2;
    String pl2nbr;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_second, container, false);
        ecran2=(EditText)view.findViewById(R.id.ecran2);
        ok= (ImageButton) view.findViewById(R.id.secondButton);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pl2nbr=ecran2.getText().toString();
               // Intent intent = new Intent(getActivity().getBaseContext(),
                //        p2.class);
              //  intent.putExtra("nbr2", pl2nbr);
               // getActivity().startActivity(intent);
               p2 m1=(p2)getActivity();
               m1.f1(pl2nbr);
              Toast.makeText(getActivity(), "choisir votre difficulté:  ", Toast.LENGTH_LONG).show();

                ecran2.setText("");
            }
        });
        return view;
    }
}

