package com.example.vachetaureau;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class easy extends AppCompatActivity {
    ImageButton pll1;
    ImageButton pll2;
    ImageButton try1;
    ImageButton try2;
    ArrayList<String> listItems=new ArrayList<String>();
    ArrayAdapter<String> adapter;
    final  String s1 = getIntent().getStringExtra("s1");
    final String s2 = getIntent().getStringExtra("s2");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);
        setContentView(R.layout.activity_easy);
        adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                listItems);
        final ListView lv=(ListView)findViewById(R.id.l) ;
        lv.setAdapter(adapter);
        pll1 = (ImageButton) findViewById(R.id.pll1);
        pll2 = (ImageButton) findViewById(R.id.pll2);

        try1=(ImageButton) findViewById(R.id.try1);
        try2=(ImageButton) findViewById(R.id.try2);


        pll1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loadFragment(new pl1());

            }
        });

        pll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loadFragment(new pl2());
            }
        });
    }
    public String s3(){
        final String nbr1 =  getIntent().getStringExtra("nbr1");
        String s3=nbr1;
        return s3;
    }


    public void f1(final String s4){

        final String s3=s3();
        int t = 0;
        int i = 0;
        int j = 0;
        int x= 0 ;
        final String res1;
        final String res2;

        for (i = 0; i < s3.length(); i++) {
            j = -1;
            do {
                j++;
            } while ((s3.charAt(i) != s2.charAt(j))
                    && (s3.charAt(i) == s2.charAt(j)));
            if (s3.charAt(i) ==s2.charAt(i)) {
                t++;
            } else if ((j != i) && (s3.charAt(i) == s2.charAt(j))) {
                x++;
            }

        }
        res1 = t+"T"+x+"V" ;
        for (i = 0; i < s4.length(); i++) {
            j = -1;
            do {
                j++;
            } while ((s4.charAt(i) != s1.charAt(j))
                    && (s4.charAt(i) == s1.charAt(j)));
            if (s4.charAt(i) == s1.charAt(i)) {
                t++;
            } else if ((j != i) && (s4.charAt(i) == s1.charAt(j))) {
                x++;
            }

        }
        res2 = t+"T"+x+"V" ;
        try1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res1.equals("4T0V")){
                    Intent intent = new Intent(easy.this,win.class);
                    startActivity(intent);}
                else Toast.makeText(getApplicationContext(), "try again", Toast.LENGTH_LONG).show();
                listItems.add(s3+" : "+res1);
                adapter.notifyDataSetChanged();



            }
        });
        try2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (res2.equals("4T0V")){
                    Intent intent = new Intent(easy.this,win.class);
                    startActivity(intent);}
                else Toast.makeText(getApplicationContext(), "try again", Toast.LENGTH_LONG).show();
                listItems.add(s4+" : "+res2);
                adapter.notifyDataSetChanged();


            }
        });
    }
    private void loadFragment(Fragment fragment) {
// create a FragmentManager
        FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }



}
