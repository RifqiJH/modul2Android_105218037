package com.example.fotomodul2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class katalogfotoadapter extends RecyclerView.Adapter<katalogfotoadapter.KatalogFotoViewHolder> {
   private LayoutInflater mInflater;

   public katalogfotoadapter(Context context){
       mInflater=LayoutInflater.from(context);
   }
    @NonNull
    @Override
    public KatalogFotoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View itemView = mInflater.inflate(R.layout.katalog_foto_item,parent);
        return new KatalogFotoViewHolder(itemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull KatalogFotoViewHolder holder, int position) {
        katalogfoto katalogfoto=katalogfotoutil.getkatalogFotoAt(position);
    holder.ivKatalogFoto.setImageResource(katalogfoto.getResID());
    holder.tvFilename.setText(katalogfoto.getFilename());
    }

    @Override
    public int getItemCount() {
        return katalogfotoutil.getKatalogfotoList().size();
    }

    class KatalogFotoViewHolder extends RecyclerView.ViewHolder {
        final Button btncetak;
        final Button[] btnukuranArray;
        final ImageView ivKatalogFoto;
        final TextView tvFilename;

        private katalogfotoadapter mAdapter;
        private int[] resBtnUkuranArray = {
                R.id.btn3r,
                R.id.btn4r,
                R.id.btn6r,
                R.id.btn10r,

        };

        public KatalogFotoViewHolder(@NonNull View itemView, katalogfotoadapter _mAdapter) {
            super(itemView);
            mAdapter = _mAdapter;

            btncetak = itemView.findViewById(R.id.btncetak);
            ivKatalogFoto=itemView.findViewById(R.id.iv_foto_item);
            tvFilename=itemView.findViewById(R.id.tv_filename);

            btnukuranArray = new Button[resBtnUkuranArray.length];


            }
        }}

