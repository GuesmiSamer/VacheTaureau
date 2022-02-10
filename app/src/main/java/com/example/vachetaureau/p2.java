package com.example.vachetaureau;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class p2 extends AppCompatActivity {
ImageButton player1;
    ImageButton player2;
    ImageButton easy;
    ImageButton hard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);
        player1 = (ImageButton) findViewById(R.id.player1);
        player2 = (ImageButton) findViewById(R.id.player2);
        easy=(ImageButton)findViewById(R.id.firstButton);
        hard=(ImageButton)findViewById(R.id.secondButton);



       // final String nbr1 =  getIntent().getStringExtra("nbr1");
       // s1=nbr1;
       // final String nbr2 =  getIntent().getStringExtra("nbr2");
//s2=nbr2;
        player1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loadFragment(new Player1());
            }
        });

        player2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loadFragment(new Player2());


            }
        });


    }
    public String s1(){
        final String nbr1 =  getIntent().getStringExtra("nbr1");
        String s1=nbr1;
       return s1;
    }
 //   public String s2(){
  //      final String nbr2 =  getIntent().getStringExtra("nbr2");
   //     s2=nbr2;
    //    return s2;
   // }
    public void f1(final String s2){
final String s1=s1();
        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), easy.class);
                intent.putExtra("s1", s1);
                intent.putExtra("s2", s2);
                startActivity(intent);
            }
        });

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), hard.class);
                intent.putExtra("s1", s1);
                intent.putExtra("s2", s2);
                startActivity(intent);
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

