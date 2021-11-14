package com.example.interntask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Screen4 extends AppCompatActivity {

    TextView userName;
    ImageView userProfile,back;
    RecyclerView recyclerVie;
    ArrayList<UpcomingModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.dashboard));
        back = findViewById(R.id.back);

        userName = findViewById(R.id.userName);
        userProfile = findViewById(R.id.profile_image);
        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        userName.setText(name);

        Bundle bundle = getIntent().getExtras();
        if (bundle !=null){
            int res =bundle.getInt("image");
            userProfile.setImageResource(res);
        }


        list = new ArrayList<>();

        list.add(new UpcomingModel(R.drawable.f5,"Re: Paragati","Harshada","To You","22 Aug",R.drawable.rupee,"80"));
        list.add(new UpcomingModel(R.drawable.f5,"Re: Paragati","Harshada","To You","22 Aug",R.drawable.rupee,"80"));
        list.add(new UpcomingModel(R.drawable.f5,"Re: Paragati","Harshada","To You","22 Aug",R.drawable.rupee,"80"));
        list.add(new UpcomingModel(R.drawable.f5,"Re: Paragati","Harshada","To You","22 Aug",R.drawable.rupee,"80"));
        list.add(new UpcomingModel(R.drawable.f5,"Re: Paragati","Harshada","To You","22 Aug",R.drawable.rupee,"80"));

        //recycler view
        recyclerVie = findViewById(R.id.upcomingRV);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerVie.setLayoutManager(layoutManager);
        UpComingAdapter adapter = new UpComingAdapter(getApplicationContext(),list);
        recyclerVie.setAdapter(adapter);







        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

    }
}