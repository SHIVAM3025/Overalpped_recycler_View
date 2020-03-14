package tech.falcorobotics.overalppedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mrecycler;
    private Adapter madapter;
    private LinearLayoutManager mlinear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mrecycler = findViewById(R.id.recycler);

        mrecycler.setHasFixedSize(true);
        mlinear = new LinearLayoutManager(this);
        mrecycler.setLayoutManager(mlinear);

        madapter  =new Adapter(this);

        mrecycler.setAdapter(madapter);


    }
}
