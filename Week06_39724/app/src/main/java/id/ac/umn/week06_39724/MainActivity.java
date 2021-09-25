package id.ac.umn.week06_39724;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_1, btn_2, btn_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewLingkaran();
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewKudalari();
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewIlmufisika();
            }
        });
    }

    private void viewLingkaran(){
        Intent intent = new Intent(this,LingkaranActivity.class);
        startActivity(intent);
    }

    private void viewKudalari(){
        Intent intent = new Intent(this,kudalariActivity.class);
        startActivity(intent);
    }

    private void viewIlmufisika(){
        Intent intent = new Intent(this,IlmufisikaActivity.class);
        startActivity(intent);
    }

}