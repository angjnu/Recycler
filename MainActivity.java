package com.example.anil.recycler;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String []a = new String[]{"Bird1","Bird2","Bird3","Deer","Dog"};
        int []b = new int[]{R.drawable.bird1,R.drawable.bird2,R.drawable.bird3,R.drawable.deer,R.drawable.dog };
        xyz adapoter = new xyz(a,b);
        RecyclerView v = (RecyclerView) findViewById(R.id.recycler123);
        v.setAdapter(adapoter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        v.setLayoutManager(linearLayoutManager);


    }
}
