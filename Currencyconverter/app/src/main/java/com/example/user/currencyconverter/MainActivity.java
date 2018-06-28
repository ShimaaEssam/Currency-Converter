package com.example.user.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button clear=(Button)findViewById(R.id.button2);
        final EditText Pound=(EditText)findViewById(R.id.editTextP);
        final EditText Dollar=(EditText)findViewById(R.id.editTextD);


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pound.setText("");
                Dollar.setText("");
            }
        });

        Button convert=(Button)findViewById(R.id.button);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Curr c=new Curr();
                if( Pound.getText().toString().isEmpty() && Dollar.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Invalid data-Try again",Toast.LENGTH_LONG).show();
                }
                else if(!Pound.getText().toString().isEmpty() && !Dollar.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"please clear app",Toast.LENGTH_LONG).show();
                }
                else {
                    if(!Pound.getText().toString().isEmpty())
                    {
                       double p=Double.parseDouble(Pound.getText().toString());
                        c.set_pound(p);
                        p=c.confromPtoD();
                        Dollar.setText(String.valueOf(p));
                    }
                    else if(!Dollar.getText().toString().isEmpty())
                    {
                        double d=Double.parseDouble(Dollar.getText().toString());
                        c.set_dollar(d);
                        d=c.confromDtoP();
                       Pound.setText(String.valueOf(d));

                    }

                }


            }
        });

    }
}
