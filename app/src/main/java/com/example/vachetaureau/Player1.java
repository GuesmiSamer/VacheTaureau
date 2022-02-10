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
public class Player1 extends Fragment {
    View view;
    ImageButton ok;
EditText ecran1;
    public  String pl1nbr;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_first, container, false);

ecran1=(EditText)view.findViewById(R.id.ecran1);

ok = (ImageButton) view.findViewById(R.id.firstButton);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  pl1nbr=ecran1.getText().toString();
                Intent intent = new Intent(getActivity().getBaseContext(),
                        p2.class);
                intent.putExtra("nbr1", pl1nbr);
                getActivity().startActivity(intent);
               // Toast.makeText(getActivity(), "Good Luck 1"+pl1nbr , Toast.LENGTH_LONG).show();
                ecran1.setText("");
            }

        });
        return view;
    }



}

