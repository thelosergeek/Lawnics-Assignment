package in.thelosergeek.lawnicsassignment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

     Context context;
     List<Model> uploads;

    public MyAdapter(Context context, List<Model> uploads) {
        this.uploads = uploads;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Model upload = uploads.get(position);
        String uDP = uploads.get(position).getpImage();

        holder.textViewName.setText(upload.getpID()); //

        holder.textViewDate.setText(upload.getpTime());
        try {
            Picasso.get().load(uDP).placeholder(R.drawable.ic_baseline_insert_drive_file_24).into(holder.imageView);
        }
        catch (Exception e){

        }
    }

    @Override
    public int getItemCount() {
        return uploads.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewName;
        public ImageView imageView;
        public TextView textViewDate;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewName = (TextView) itemView.findViewById(R.id.document_name);
            imageView = (ImageView) itemView.findViewById(R.id.document_image);
            textViewDate = itemView.findViewById(R.id.document_time);
        }
    }
}
