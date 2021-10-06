package id.ac.umn.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_profile, btn_library;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_profile = findViewById(R.id.btn_profile);
        btn_library = findViewById(R.id.btn_library);

        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentProfile = new Intent(MainActivity.this, profile.class);
                startActivityForResult(intentProfile, 1);
            }
        });

        btn_library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLogin = new Intent(MainActivity.this, LoginActivity.class);
                startActivityForResult(intentLogin, 1);
            }
        });
    }
}