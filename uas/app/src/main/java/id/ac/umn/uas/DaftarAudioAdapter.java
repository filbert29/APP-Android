package id.ac.umn.uas;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class DaftarAudioAdapter extends RecyclerView.Adapter<DaftarAudioAdapter.ItemAudioViewHolder> {

    private LinkedList<SumberAudio> mDaftarAudio;
    private LayoutInflater mInflater;
    private Context mContext;
    public DaftarAudioAdapter(Context context,
                              LinkedList<SumberAudio> daftarAudio){
        this.mContext = context;
        this.mDaftarAudio = daftarAudio;
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ItemAudioViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.layout_sfx ,
                parent , false);
        return new ItemAudioViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAudioViewHolder holder,
                                 int position) {
        SumberAudio mSumberAudio = mDaftarAudio.get(position);
        holder.tvJudul.setText(mSumberAudio.getJudul());
        holder.tvKeterangan.setText(mSumberAudio.getKeterangan());
//        holder.tvUri.setText(mSumberSYX.getURI());
//        holder.kotakAudio.setURI(
//                Uri.parse(mDaftarSFX.getURI()));
//        holder.kotakVideo.seekTo(100);
    }
    @Override
    public int getItemCount() {
        return mDaftarAudio.size();
    }


    class ItemAudioViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {
        private TextView tvJudul;
        private TextView tvKeterangan;
        private DaftarAudioAdapter mAdapter;
        private int mPosisi;
        private SumberAudio mSumberAudio;
        private ImageView btn_delete;
        public ItemAudioViewHolder(@NonNull View itemView,
                                   DaftarAudioAdapter adapter) {
            super(itemView);
            mAdapter = adapter;
            tvJudul = (TextView) itemView.findViewById(R.id.tvJudul);
            tvKeterangan = (TextView) itemView.findViewById(
                    R.id.tvKeterangan);
            itemView.setOnClickListener(this);
            btn_delete = (ImageView) itemView.findViewById(R.id.btn_delete);

            btn_delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mDaftarAudio.remove(getLayoutPosition());
                    notifyItemRemoved(getLayoutPosition());
                    notifyItemRangeChanged(getLayoutPosition(),mDaftarAudio.size());
                }
            });
        }
        @Override
        public void onClick(View v) {
            mPosisi = getLayoutPosition();
            mSumberAudio = mDaftarAudio.get(mPosisi);
            Intent detilInten = new Intent(mContext,
                    DetilAudioActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("DetilAudio",mSumberAudio);
            detilInten.putExtras(bundle);
            mContext.startActivity(detilInten);
        }

    }
}
