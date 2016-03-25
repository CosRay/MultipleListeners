package com.example.cosmas.multiplelisteners;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView txt;

    private View.OnClickListener myButtonOnClickListener
            =new View.OnClickListener(){
        @Override
    public void onClick(View view){
            txt.setText(R.string.TextViewTxt);
        }
    };

    private View.OnLongClickListener myButtonOnLongClickListener
            =new View.OnLongClickListener(){
        @Override
        public boolean onLongClick(View view){
            txt.setText(R.string.TextViewLongTxt);
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    txt=(TextView)findViewById(R.id.textv);
        Button button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(myButtonOnClickListener);
        button.setOnLongClickListener(myButtonOnLongClickListener);

    }


}
