package com.example.david.viewopenclose;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    View titleArea,appendArea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        titleArea=findViewById(R.id.title_main_activity);
        appendArea=findViewById(R.id.append_layout_main_activity);
        titleArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(appendArea.getVisibility()==View.VISIBLE)
                appendArea.setVisibility(View.GONE);
                else
                    appendArea.setVisibility(View.VISIBLE);
            }
        });
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });
    }
}
