package com.example.sp20_bse_024_assi_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private String saved_key = "1231";
    int counter=0;
    private TextView txt;
    private Button back;
    private Button open;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;

    @Override
    protected void onStart()
    {
        super.onStart();
        txt = findViewById(R.id.txt);
        back = findViewById(R.id.btnback);
        open = findViewById(R.id.btnopen);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }

    private void set_txt(int i)
    {
//        Toast.makeText(getApplicationContext(), "Running", Toast.LENGTH_SHORT).show();
        String txtValue = txt.getText().toString();
        if (txtValue.length() >= 4)
        {
            return;
        }
        txt.setText(txtValue + i);
    }

    @Override
    protected void onResume()
    {
        super.onResume();

        btn0.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    set_txt(0);
                }
            }
        );
        btn1.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    set_txt(1);
                }
            }
        );
        btn2.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    set_txt(2);
                }
            }
        );
        btn3.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    set_txt(3);
                }
            }
        );
        btn4.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    set_txt(4);
                }
            }
        );
        btn5.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    set_txt(5);
                }
            }
        );
        btn6.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    set_txt(6);
                }
            }
        );
        btn7.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    set_txt(7);
                }
            }
        );
        btn8.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    set_txt(8);
                }
            }
        );
        btn9.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    set_txt(9);
                }
            }
        );
        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String txtValue = txt.getText().toString();
                if(txtValue.length() > 0)
                {
                    String a = (txtValue.substring(0, txtValue.length() - 1));
                    txt.setText(a);
                }
            }
        });
        open.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String keyTextValue = txt.getText().toString();
                if(keyTextValue.equals(saved_key))
                {
                    Intent intent = new Intent(MainActivity.this, SafeActivity.class);
                    startActivity(intent);
                }
                else
                { counter++;
                    if(counter>=3)
                    {
                        finish();
                    }
                    Toast.makeText(MainActivity.this, "Wrong Key", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}