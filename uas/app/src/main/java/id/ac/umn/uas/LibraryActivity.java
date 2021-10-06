package id.ac.umn.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        Intent fromLogin = getIntent();
        String username = fromLogin.getStringExtra("username");
        getSupportActionBar().setTitle(username);
    }
}