package com.example.a17589.zyhs_delivery;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class main_interface extends AppCompatActivity {

    private Button get_btn;//接单按钮

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_interface);
        //上面的接单按钮点击事件
        get_btn = (Button) findViewById(R.id.jdan);
        get_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_interface.this, lookorder.class);
                startActivity(intent);
            }
        });
    }
}

