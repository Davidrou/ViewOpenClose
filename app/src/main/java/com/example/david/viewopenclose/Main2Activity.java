package com.example.david.viewopenclose;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    View titleArea,appendArea,arrow;
    ViewOpeningController handSomeOpenController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        titleArea=findViewById(R.id.title_main_activity);
        appendArea=findViewById(R.id.append_layout_main_activity);
        arrow=findViewById(R.id.app_runtime_arrow);
        findViewById(R.id.button).setVisibility(View.GONE);
        handSomeOpenController = new ViewOpeningController(appendArea) {
            @Override
            public void setViewStatus(boolean opened) {
                appendArea.setVisibility(opened ? View.VISIBLE
                        : View.GONE);
                arrow.setSelected(opened);
            }
        };
        handSomeOpenController.measureViewHeightAndInit(false);
        titleArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isSelected=arrow.isSelected();
                handSomeOpenController.opening(!isSelected);
            }
        });
    }
}
