package tech.falcorobotics.overalppedrecyclerview;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.HoldView> {

    private Context mcontext;

    public Adapter(Context mcontext) {
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public HoldView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mcontext).inflate(R.layout.layout , parent , false);
        return new Adapter.HoldView(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HoldView holder, int position) {



    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class HoldView extends RecyclerView.ViewHolder{

        private ImageView mimage;

        public HoldView(@NonNull View itemView) {
            super(itemView);

            mimage = itemView.findViewById(R.id.image);

        }
    }


}