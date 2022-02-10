package com.example.vachetaureau;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class training extends AppCompatActivity {
    ImageButton button0;
    ImageButton button1;
    ImageButton button2;
    ImageButton button3;
    ImageButton button4;
    ImageButton button5;
    ImageButton button6;
    ImageButton button7;
    ImageButton button8;
    ImageButton button9;
    ImageButton buttonC;
    ImageButton submit;
    EditText ecran;
    ArrayList<String> listItems=new ArrayList<String>();
    ArrayAdapter<String> adapter;
    int clickCounter=0;
    private double chiffre1;
    private boolean update = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);
        adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                listItems);
        final ListView lv=(ListView)findViewById(R.id.l) ;
        lv.setAdapter(adapter);
       // setListAdapter(adapter);
        button0 = (ImageButton) findViewById(R.id.Button0);
        button1 = (ImageButton) findViewById(R.id.Button1);
        button2 = (ImageButton) findViewById(R.id.Button2);
        button3 = (ImageButton) findViewById(R.id.Button3);
        button4 = (ImageButton) findViewById(R.id.Button4);
        button5 = (ImageButton) findViewById(R.id.Button5);
        button6 = (ImageButton) findViewById(R.id.Button6);
        button7 = (ImageButton) findViewById(R.id.Button7);
        button8 = (ImageButton) findViewById(R.id.Button8);
        button9 = (ImageButton) findViewById(R.id.Button9);
        buttonC = (ImageButton) findViewById(R.id.ButtonC);
        ecran = (EditText) findViewById(R.id.editText2);
        submit=(ImageButton) findViewById(R.id.Submitbtn) ;
        final int nombre  = 1023 + (int)(Math.random() * ((9876 - 1023) + 1));
        buttonC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resetClick();
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int t = 0, i = 0, j = 0,x= 0 ;
                String res;
                String n =ecran.getText().toString();
                String p=Integer.toString(nombre);
                for (i = 0; i < n.length(); i++) {
                    j = -1;
                    do {
                        j++;
                    } while ((n.charAt(i) != p.charAt(j))
                            && (n.charAt(i) == p.charAt(j)));
                    if (n.charAt(i) == p.charAt(i)) {
                        t++;
                    } else if ((j != i) && (n.charAt(i) == p.charAt(j))) {
                        x++;
                    }

                }
                res = t+"T"+x+"V" ;


                Toast.makeText(getApplicationContext(), "nbr:  "+p, Toast.LENGTH_LONG).show();
                // Toast.makeText(getApplicationContext(), "result:  "+res, Toast.LENGTH_LONG).show();
                 if (t==4){
                     Intent intent = new Intent(training.this,win.class);
                     startActivity(intent);}
                 else Toast.makeText(getApplicationContext(), "try again", Toast.LENGTH_LONG).show();
                listItems.add(n+" : "+res);
                adapter.notifyDataSetChanged();
                ecran.setText("");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("9");
            }
        });
    }
    public void chiffreClick(String str) {
        if(update){
            update = false;
        }else{
            if(!ecran.getText().equals("0"))
                str = ecran.getText() + str;
        }
        ecran.setText(str);
    }
    public void resetClick(){

        update = true;
        chiffre1 = 0;

        ecran.setText("");
    }


}
