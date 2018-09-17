package in.co.cfcs.ppb;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class PolyImageAdapter extends RecyclerView.Adapter<PolyImageAdapter.ViewHolder> {

    ArrayList ployImages;
    Context context;

    public PolyImageAdapter(MainActivity mainActivity, ArrayList ployImages) {

        this.context = mainActivity;
        this.ployImages = ployImages;
    }

    @NonNull
    @Override
    public PolyImageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ploy_image_list,viewGroup, false);

        return new PolyImageAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PolyImageAdapter.ViewHolder viewHolder, int i) {

        viewHolder.ploy_image.setImageResource((Integer) ployImages.get(i));

    }

    @Override
    public int getItemCount() {
        return ployImages.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        ImageView ploy_image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ploy_image = itemView.findViewById(R.id.ploy_image);
        }
    }
}
