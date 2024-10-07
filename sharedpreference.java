package com.example.spark.sharedpreference;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button button2;
    EditText edtxt;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main); // Set content view first

        button2 = findViewById(R.id.button2);
        edtxt = findViewById(R.id.edtxt);
        tv = findViewById(R.id.tv);
button2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String txt = edtxt.getText().toString();
         SharedPreferences shrd =getSharedPreferences("demo",MODE_PRIVATE);
         SharedPreferences.Editor edit = shrd.edit();
         edit.putString("txt",txt);
         edit.apply();
         tv.setText(txt);a
    }
});

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}