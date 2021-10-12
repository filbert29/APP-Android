package id.ac.umn.uas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.LinkedList;

public class LibraryActivity extends AppCompatActivity {
    RecyclerView rvDaftarAudio;
    DaftarAudioAdapter mAdapter;
    LinkedList<SumberAudio> daftarVideo = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        isiDaftarAudio();
        rvDaftarAudio = (RecyclerView) findViewById(R.id.recyclerView);
        mAdapter = new DaftarAudioAdapter(this, daftarVideo);
        rvDaftarAudio.setAdapter(mAdapter);
        rvDaftarAudio.setLayoutManager(new LinearLayoutManager(this));

        Intent fromLogin = getIntent();
        String username = fromLogin.getStringExtra("username");
        getSupportActionBar().setTitle(username);

        //Toast.makeText("Selamat datang, "+username, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Selamat Datang, "+username, Toast.LENGTH_SHORT).show();
    }

    public void isiDaftarAudio(){
        daftarVideo.add(new SumberAudio("Ara Ara",
                "SFX",
                Integer.toString(R.raw.araara)));
        daftarVideo.add(new SumberAudio("EXPLOTION!!!",
                "SFX",
                Integer.toString(R.raw.explotion)));
        daftarVideo.add(new SumberAudio("Hehe te nandayo",
                "SFX",
                Integer.toString(R.raw.hehetenandayo)));
        daftarVideo.add(new SumberAudio("Hey Hey",
                "SFX",
                Integer.toString(R.raw.heyhey)));
        daftarVideo.add(new SumberAudio("Yowai mo",
                "SFX",
                Integer.toString(R.raw.yowaimo)));
    }

}