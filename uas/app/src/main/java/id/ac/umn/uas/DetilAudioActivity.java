package id.ac.umn.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DetilAudioActivity extends AppCompatActivity {
    private TextView Detil_Judul;
    private TextView Detil_Keterangan;
    private Button btn_play;
    private Integer URI;
    private MediaPlayer playAudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detil_audio);
        Detil_Judul = findViewById(R.id.Detil_Judul);
        Detil_Keterangan = findViewById(R.id.Detil_Keterangan);
        btn_play = findViewById(R.id.btn_play);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        SumberAudio sa = (SumberAudio) bundle.getSerializable(
                "DetilAudio");
        URI = Integer.parseInt(sa.getURI());
        Detil_Judul.setText(sa.getJudul());
        Detil_Keterangan.setText(sa.getKeterangan());
    }

    public void play_sfx(View view){
        if (playAudio == null) {
            playAudio = MediaPlayer.create(this, URI);
        }
        playAudio.start();
    }
}