package com.android.aaaaa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    //定义一个访问图片的数组
    int[] images = new int[]{
            R.drawable.first,
            R.drawable.second,
            R.drawable.third,
            R.drawable.fourth,};
    int currentImg = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取LinearLayout布局容器
        LinearLayout main = (LinearLayout)findViewById(R.id.root);
        //程序创建ImageView组件
        final ImageView image = new ImageView(this);
        //将ImageView组件添加到LinearLayout布局容器中
        main.addView(image);
        image.setImageResource(images[0]);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //改变ImageView显示的图片
                image.setImageResource(images[++currentImg % images.length]);
            }
        });
    }
}
