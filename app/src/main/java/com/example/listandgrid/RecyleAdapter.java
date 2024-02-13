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

public class RecyleAdapter extends RecyclerView.Adapter<RecyleAdapter.StudentViewHolder> {

    private final List<Student> studentList;
    private final Context context;


    // Constructor to initialize the adapter with data and context
    public RecyleAdapter(List<Student> userList, Context context) {
        this.studentList = userList;
        this.context = context;
    }

    // Create a new ViewHolder by inflating the layout
    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the layout for each list item
        View view = LayoutInflater.from(context).inflate(R.layout.student_list_grid, parent, false);
        // Return a new UserViewHolder with the inflated view
        return new StudentViewHolder(view);
    }

    // Bind data to the ViewHolder
    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        // Get the Student object at the specified position
        Student student = studentList.get(position);
        // Set the student's image and name to the corresponding views in the ViewHolder
        holder.studentImg.setImageResource(student.getStudentImg());
        holder.studentName.setText(student.getName());
    }

    // Return the total number of items in the data set
    @Override
    public int getItemCount() {
        return studentList.size();
    }

    // ViewHolder class to hold references to views for each list item
    static class StudentViewHolder extends RecyclerView.ViewHolder {

        private final TextView studentName;
        private final ImageView studentImg;

        // Constructor to initialize the views in the ViewHolder
        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            // Find and initialize the TextView and ImageView in the layout
            studentName = itemView.findViewById(R.id.studentName);
            studentImg = itemView.findViewById(R.id.studentImg);
        }
    }
}
