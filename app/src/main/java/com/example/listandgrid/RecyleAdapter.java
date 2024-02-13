package com.example.listandgrid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class RecyleAdapter extends RecyclerView.Adapter<RecyleAdapter.UserViewHolder> {

    private final List<Student> userList;
    private final Context context;

    // Constructor to initialize the adapter with data and context
    public RecyleAdapter(List<Student> userList, Context context) {
        this.userList = userList;
        this.context = context;
    }

    // Create a new ViewHolder by inflating the layout
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the layout for each list item
        View view = LayoutInflater.from(context).inflate(R.layout.new_user_list_item, parent, false);
        // Return a new UserViewHolder with the inflated view
        return new UserViewHolder(view);
    }

    // Bind data to the ViewHolder
    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        // Get the Student object at the specified position
        Student student = userList.get(position);
        // Set the student's image and name to the corresponding views in the ViewHolder
        holder.imageView.setImageResource(student.getStudentImg());
        holder.nameView.setText(student.getName());
    }

    // Return the total number of items in the data set
    @Override
    public int getItemCount() {
        return userList.size();
    }

    // ViewHolder class to hold references to views for each list item
    static class UserViewHolder extends RecyclerView.ViewHolder {

        private final TextView nameView;
        private final ImageView imageView;

        // Constructor to initialize the views in the ViewHolder
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            // Find and initialize the TextView and ImageView in the layout
            nameView = itemView.findViewById(R.id.nameViewId);
            imageView = itemView.findViewById(R.id.userImgView);
        }
    }
}
