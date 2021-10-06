package id.ac.umn.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private Button btnNext;
    private EditText inputNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnNext = findViewById(R.id.btnNext);
        inputNama = findViewById(R.id.inputNama);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = inputNama.getText().toString();
                if (userName.isEmpty()) {
                    inputNama.setError("Harap diisi");
                }
                else {
                    System.out.println("sini asu");
                    Intent intentLibrary = new Intent(LoginActivity.this, LibraryActivity.class);
                    intentLibrary.putExtra( "username", userName );
                    startActivity(intentLibrary);
//                    startActivityForResult(intentLibrary, 1);
                }
            }
        });
    }
}