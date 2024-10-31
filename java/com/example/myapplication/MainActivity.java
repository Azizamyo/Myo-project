package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ImageView images = findViewById(R.id.imageView);
        EditText man = findViewById(R.id.editTextText);
        EditText femail = findViewById(R.id.editTextText2);
        TextView result = findViewById(R.id.textView);
        Button randomHeart = findViewById(R.id.button);



        randomHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int [] randomresult = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,
                51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
               int [] imagesOfHeart = {R.drawable.love02,R.drawable.love3,R.drawable.love4,R.drawable.love5,R.drawable.love6,R.drawable.love7,
                       R.drawable.love8, R.drawable.love9, R.drawable.love10, R.drawable.love11, R.drawable.love12, R.drawable.love13, R.drawable.love14,
                       R.drawable.love15, R.drawable.love16, R.drawable.love17, R.drawable.love18, R.drawable.love19, R.drawable.love20, R.drawable.love21,
                       R.drawable.love22, R.drawable.love23, R.drawable.love24, R.drawable.love25, R.drawable.love26, R.drawable.love27, R.drawable.love28,
                       R.drawable.love29, R.drawable.love30, R.drawable.love31, R.drawable.love32, R.drawable.love33, R.drawable.love34, R.drawable.love35, R.drawable.love36,
                       R.drawable.love37, R.drawable.love38, R.drawable.love39, R.drawable.love40, R.drawable.love41, R.drawable.love42, R.drawable.love43, R.drawable.love44,
                       R.drawable.love45, R.drawable.love46, R.drawable.love47, R.drawable.love48, R.drawable.love49, R.drawable.love50, R.drawable.love51, R.drawable.love52,
                       R.drawable.love53, R.drawable.love54, R.drawable.love55, R.drawable.love56, R.drawable.love57, R.drawable.love58, R.drawable.love59, R.drawable.love60,
                       R.drawable.love61, R.drawable.love62, R.drawable.love63, R.drawable.love64, R.drawable.love65, R.drawable.love66, R.drawable.love67, R.drawable.love68,
                       R.drawable.love69, R.drawable.love70, R.drawable.love71, R.drawable.love72, R.drawable.love73, R.drawable.love74, R.drawable.love75, R.drawable.love76,
                       R.drawable.love77, R.drawable.love78, R.drawable.love79, R.drawable.love80, R.drawable.love81, R.drawable.love82, R.drawable.love83, R.drawable.love84,
                       R.drawable.love85, R.drawable.love86, R.drawable.love87, R.drawable.love88, R.drawable.love89, R.drawable.love90, R.drawable.love91, R.drawable.love92,
                       R.drawable.love93, R.drawable.love94, R.drawable.love95, R.drawable.love96, R.drawable.love97, R.drawable.love98, R.drawable.love99, R.drawable.love100

               };

                int num = (int) (Math.random() * randomresult.length);
                result.setText(randomresult[num]);

                Picasso.get()
                        .load(imagesOfHeart[num])
                        .into(images);

            }
        });
    }
}