package com.example.listandgrid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final List<User> userList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        recyclerView = findViewById(R.id.recylerViewId);
        Button listView = findViewById(R.id.listViewBtn);
        Button gridView = findViewById(R.id.gridViewBtn);

        // Create a list of users
        initUserList();

        // Set up RecyclerView with LinearLayoutManager
        setupRecyclerView();

        // Button click listeners for switching between List and Grid layouts
        listView.setOnClickListener(view -> switchToLinearLayoutManager());
        gridView.setOnClickListener(view -> switchToGridLayoutManager());
    }

    // Initialize the list of users
    private void initUserList() {
        userList.add(new User(R.drawable.profile_pic1, "Virat Kohli"));
        userList.add(new User(R.drawable.profile_pic2, "Sachin"));
        userList.add(new User(R.drawable.profile_pic4, "Rohit Sharma"));
        userList.add(new User(R.drawable.profile_pic5, "MS Dhoni"));
        userList.add(new User(R.drawable.profile_pic6, "Ravi Jadeja"));
        userList.add(new User(R.drawable.profile_pic7, "S. Gill"));
        userList.add(new User(R.drawable.profile_pic9, "Steven Smith "));
        userList.add(new User(R.drawable.profile_pic10, "Joe Root"));
        userList.add(new User(R.drawable.profile_pic11, "Jasprit Bumrah"));
        userList.add(new User(R.drawable.profile_pic12, "Mohd. Siraj"));
        userList.add(new User(R.drawable.profile_pic13, "Kuldeep Yadav"));
        userList.add(new User(R.drawable.profile_pic14, "KL Rahul"));
        userList.add(new User(R.drawable.profile_pic1, "Mohd. Shami"));
        userList.add(new User(R.drawable.profile_pic2, "Shikhar Dhawan"));
        userList.add(new User(R.drawable.profile_pic3, "Shreyas Iyer"));
        userList.add(new User(R.drawable.profile_pic4, "Hardik Pandya"));
        userList.add(new User(R.drawable.profile_pic5, "Surya Kumar"));
        userList.add(new User(R.drawable.profile_pic6, "Ben Stokes"));
        userList.add(new User(R.drawable.profile_pic7, "Ravi Ashwin"));
        userList.add(new User(R.drawable.profile_pic9, "Suresh Raina"));
        // Add more users as needed
    }

    // Set up RecyclerView with LinearLayoutManager
    private void setupRecyclerView() {
        RecyleAdapter recycleAdapter = new RecyleAdapter(userList, this);
        recyclerView.setAdapter(recycleAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    // Switch to LinearLayoutManager
    private void switchToLinearLayoutManager() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    // Switch to GridLayoutManager with 2 columns
    private void switchToGridLayoutManager() {
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }
}
