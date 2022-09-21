package com.example.listview;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btnmonan;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmonan = (Button) findViewById(R.id.buttonmonan);
        btnmonan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh2 = new Intent( MainActivity.this, Activity1.class);
                startActivity(mh2);
            }
        });
    }
}