package com.example.interntask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView,friend_rv;
    private ArrayList<userModel> list;
    private ArrayList<FriendModel> friendModelArrayList;
    private View  recentUser,recentUserClose;
    private ImageView recentUserCloseImage,moreFriend,hiedFriend;
    TabLayout tabLayout;
    ViewPager viewPager;
    boolean show = false;
    CardView cardView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.dashboard));
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        recentUserClose = findViewById(R.id.recent_user_close);
        recentUserCloseImage = findViewById(R.id.recent_user_close_image);
        friend_rv = findViewById(R.id.friend_rv);
        moreFriend = findViewById(R.id.more_friends);
        cardView = findViewById(R.id.cardView);
        hiedFriend = findViewById(R.id.hide_friend);




        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        list = new ArrayList<>();
        list.add(new userModel(R.drawable.f3,"First "));
        list.add(new userModel(R.drawable.f4,"First "));
        list.add(new userModel(R.drawable.f5,"second "));
        list.add(new userModel(R.drawable.f6,"third "));
        list.add(new userModel(R.drawable.f3,"First "));
        list.add(new userModel(R.drawable.f4,"First "));
        list.add(new userModel(R.drawable.f5,"second "));
        list.add(new userModel(R.drawable.f6,"third "));
        list.add(new userModel(R.drawable.f3,"First "));
        list.add(new userModel(R.drawable.f4,"First "));
        list.add(new userModel(R.drawable.f5,"second "));
        list.add(new userModel(R.drawable.f6,"third "));
        list.add(new userModel(R.drawable.f3,"First "));
        list.add(new userModel(R.drawable.f4,"First "));
        list.add(new userModel(R.drawable.f5,"second "));
        list.add(new userModel(R.drawable.f6,"third "));
        list.add(new userModel(R.drawable.f3,"First "));
        list.add(new userModel(R.drawable.f4,"First "));
        list.add(new userModel(R.drawable.f5,"second "));
        list.add(new userModel(R.drawable.f6,"third "));
        list.add(new userModel(R.drawable.f3,"First "));
        list.add(new userModel(R.drawable.f4,"First "));
        list.add(new userModel(R.drawable.f5,"second "));
        list.add(new userModel(R.drawable.f6,"nine "));
        list.add(new userModel(R.drawable.f3,"First "));
        list.add(new userModel(R.drawable.f4,"First "));
        list.add(new userModel(R.drawable.f5,"second "));
        list.add(new userModel(R.drawable.f6,"third "));
        list.add(new userModel(R.drawable.f3,"First "));
        list.add(new userModel(R.drawable.f4,"First "));
        list.add(new userModel(R.drawable.f5,"second "));
        list.add(new userModel(R.drawable.f6,"third "));
        list.add(new userModel(R.drawable.f3,"First "));
        list.add(new userModel(R.drawable.f4,"First "));
        list.add(new userModel(R.drawable.f5,"second "));
        list.add(new userModel(R.drawable.f6,"third "));
        list.add(new userModel(R.drawable.f3,"First "));
        list.add(new userModel(R.drawable.f4,"First "));
        list.add(new userModel(R.drawable.f5,"second "));
        list.add(new userModel(R.drawable.f6,"third "));
        list.add(new userModel(R.drawable.f3,"First "));
        list.add(new userModel(R.drawable.f4,"First "));
        list.add(new userModel(R.drawable.f5,"second "));
        list.add(new userModel(R.drawable.f6,"third "));
        list.add(new userModel(R.drawable.f3,"First "));
        list.add(new userModel(R.drawable.f4,"First "));
        list.add(new userModel(R.drawable.f5,"second "));
        list.add(new userModel(R.drawable.f6,"nine "));








        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(5, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        UserAdapter userAdapter = new UserAdapter(getApplicationContext(),list,show);
        recyclerView.setAdapter(userAdapter);


        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);

        recentUser = findViewById(R.id.recent_user);

        recentUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show = true;
                UserAdapter userAdapter = new UserAdapter(getApplicationContext(),list,show);
                recyclerView.setAdapter(userAdapter);
                recentUser.setVisibility(View.GONE);

                recentUserClose.setVisibility(View.VISIBLE);
                recentUserCloseImage.setVisibility(View.VISIBLE);


            }
        });

        recentUserClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                show = false;
                UserAdapter userAdapter = new UserAdapter(getApplicationContext(),list,show);
                recyclerView.setAdapter(userAdapter);

                recentUser.setVisibility(View.VISIBLE);

                recentUserClose.setVisibility(View.GONE);
                recentUserCloseImage.setVisibility(View.GONE);

            }
        });






        friendModelArrayList = new ArrayList<>();

        friendModelArrayList.add(new FriendModel(R.drawable.f5,R.drawable.rupee,"Ananya Rao","last interacted: 7d ago","3,332","due"));
        friendModelArrayList.add(new FriendModel(R.drawable.f3,R.drawable.rupee,"Rajashi Prakash","last interacted: 3d ago","800","due"));
        friendModelArrayList.add(new FriendModel(R.drawable.f6,R.drawable.rupee,"Harshada Nikam","last interacted: 4d ago","250","due"));
        friendModelArrayList.add(new FriendModel(R.drawable.f4,R.drawable.rupee,"John Born","last interacted: 6d ago","50","due"));

 friendModelArrayList.add(new FriendModel(R.drawable.f5,R.drawable.rupee,"Ananya Rao","last interacted: 7d ago","3,332","due"));
        friendModelArrayList.add(new FriendModel(R.drawable.f3,R.drawable.rupee,"Rajashi Prakash","last interacted: 3d ago","800","due"));
        friendModelArrayList.add(new FriendModel(R.drawable.f6,R.drawable.rupee,"Harshada Nikam","last interacted: 4d ago","250","due"));
        friendModelArrayList.add(new FriendModel(R.drawable.f4,R.drawable.rupee,"John Born","last interacted: 6d ago","50","due"));


        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this);
        friend_rv.setLayoutManager(layoutManager1);
        FriendAdapter friendAdapter = new FriendAdapter(getApplicationContext(),friendModelArrayList);
        friend_rv.setAdapter(friendAdapter);



        moreFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "More friends", Toast.LENGTH_SHORT).show();
                hiedFriend.setVisibility(View.VISIBLE);
                moreFriend.setVisibility(View.GONE);
                cardView.setVisibility(View.VISIBLE);
            }
        });
        hiedFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hiedFriend.setVisibility(View.GONE);
                moreFriend.setVisibility(View.VISIBLE);
                cardView.setVisibility(View.GONE);


            }
        });

    }


}