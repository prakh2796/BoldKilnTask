package flower_task.prakhar.example.com.boldkiln.Controller.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import flower_task.prakhar.example.com.boldkiln.R;

/**
 * Created by Prakhar Gupta on 14/11/2016.
 */

public class SecondActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;
    private Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imageView = (ImageView) findViewById(R.id.imageView);
        textView = (TextView) findViewById(R.id.textView);

        intent = getIntent();
        Glide.with(this).load(intent.getStringExtra("imageurl"))
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);

        textView.setText(intent.getStringExtra("flower_name"));
    }
}
