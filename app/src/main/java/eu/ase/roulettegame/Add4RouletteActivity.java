package eu.ase.roulettegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Add4RouletteActivity extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4;
    Button btn;
    TextView textView;
    ImageView iv_wheel;

    Random r;

    int degree = 0, degree_old = 0;

    private static final float FACTOR = 4.86f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add4_roulette);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);

        String drink1 = getIntent().getStringExtra("keydrink1");
        String drink2 = getIntent().getStringExtra("keydrink2");
        String drink3 = getIntent().getStringExtra("keydrink3");
        String drink4 = getIntent().getStringExtra("keydrink4");

        tv1.setText(drink1);
        tv2.setText(drink2);
        tv3.setText(drink3);
        tv4.setText(drink4);


        btn = findViewById(R.id.btn_spin);
        textView = findViewById(R.id.tvRoulette);
        iv_wheel = findViewById(R.id.ic_wheel);

        r = new Random();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                degree_old = degree % 360;
                degree = r.nextInt(3600) + 720;
                RotateAnimation rotate = new RotateAnimation(degree_old, degree,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(3600);
                rotate.setFillAfter(true);
                rotate.setInterpolator(new DecelerateInterpolator());
                rotate.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        textView.setText("");
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        textView.setText(currentNumber(360 - (degree % 360)));
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                iv_wheel.startAnimation(rotate);
            }
        });
    }

    private String currentNumber(int degrees)
    {
        String text = "";

        if(degrees >= (FACTOR * 1) && degrees < (FACTOR * 3))
        {
            text = "32 red " + tv1.getText().toString();
        }
        if(degrees >= (FACTOR * 3) && degrees < (FACTOR * 5))
        {
            text = "15 black"  + tv4.getText().toString();
        }
        if(degrees >= (FACTOR * 5) && degrees < (FACTOR * 7))
        {
            text = "19 red " + tv2.getText().toString();
        }
        if(degrees >= (FACTOR * 7) && degrees < (FACTOR * 9))
        {
            text = "4 black " + tv1.getText().toString();
        }
        if(degrees >= (FACTOR * 9) && degrees < (FACTOR * 11))
        {
            text = "21 red " + tv3.getText().toString();
        }
        if(degrees >= (FACTOR * 11) && degrees < (FACTOR * 13))
        {
            text = "2 black " + tv2.getText().toString();
        }
        if(degrees >= (FACTOR * 13) && degrees < (FACTOR * 15))
        {
            text = "25 red " + tv1.getText().toString();
        }
        if(degrees >= (FACTOR * 15) && degrees < (FACTOR * 17))
        {
            text = "17 black " + tv4.getText().toString();
        }
        if(degrees >= (FACTOR * 17) && degrees < (FACTOR * 19))
        {
            text = "34 red " + tv2.getText().toString();
        }
        if(degrees >= (FACTOR * 19) && degrees < (FACTOR * 21))
        {
            text = "6 black " + tv1.getText().toString();
        }
        if(degrees >= (FACTOR * 21) && degrees < (FACTOR * 23))
        {
            text = "27 red " + tv1.getText().toString();
        }
        if(degrees >= (FACTOR * 23) && degrees < (FACTOR * 25))
        {
            text = "13 black " + tv3.getText().toString();
        }
        if(degrees >= (FACTOR * 25) && degrees < (FACTOR * 27))
        {
            text = "36 red " + tv4.getText().toString();
        }
        if(degrees >= (FACTOR * 27) && degrees < (FACTOR * 29))
        {
            text = "11 black " + tv3.getText().toString();
        }
        if(degrees >= (FACTOR * 29) && degrees < (FACTOR * 31))
        {
            text = "30 red " + tv1.getText().toString();
        }
        if(degrees >= (FACTOR * 31) && degrees < (FACTOR * 33))
        {
            text = "8 black " + tv4.getText().toString();
        }
        if(degrees >= (FACTOR * 33) && degrees < (FACTOR * 35))
        {
            text = "23 red " + tv4.getText().toString();
        }
        if(degrees >= (FACTOR * 35) && degrees < (FACTOR * 37))
        {
            text = "10 black " + tv3.getText().toString();
        }
        if(degrees >= (FACTOR * 37) && degrees < (FACTOR * 39))
        {
            text = "5 red " + tv4.getText().toString();
        }
        if(degrees >= (FACTOR * 39) && degrees < (FACTOR * 41))
        {
            text = "24 black " + tv2.getText().toString();
        }
        if(degrees >= (FACTOR * 41) && degrees < (FACTOR * 43))
        {
            text = "16 red " + tv4.getText().toString();
        }
        if(degrees >= (FACTOR * 43) && degrees < (FACTOR * 45))
        {
            text = "33 black " + tv3.getText().toString();
        }
        if(degrees >= (FACTOR * 45) && degrees < (FACTOR * 47))
        {
            text = "1 red " + tv1.getText().toString();
        }
        if(degrees >= (FACTOR * 47) && degrees < (FACTOR * 49))
        {
            text = "20 black " + tv3.getText().toString();
        }
        if(degrees >= (FACTOR * 49) && degrees < (FACTOR * 51))
        {
            text = "14 red " + tv2.getText().toString();
        }
        if(degrees >= (FACTOR * 51) && degrees < (FACTOR * 53))
        {
            text = "31 black " + tv1.getText().toString();
        }
        if(degrees >= (FACTOR * 53) && degrees < (FACTOR * 55))
        {
            text = "9 red " + tv4.getText().toString();
        }
        if(degrees >= (FACTOR * 55) && degrees < (FACTOR * 57))
        {
            text = "22 black " + tv3.getText().toString();
        }
        if(degrees >= (FACTOR * 57) && degrees < (FACTOR * 59))
        {
            text = "18 red " + tv1.getText().toString();
        }
        if(degrees >= (FACTOR * 59) && degrees < (FACTOR * 61))
        {
            text = "29 black " + tv2.getText().toString();
        }
        if(degrees >= (FACTOR * 61) && degrees < (FACTOR * 63))
        {
            text = "7 red " + tv4.getText().toString();
        }
        if(degrees >= (FACTOR * 63) && degrees < (FACTOR * 65))
        {
            text = "28 black " + tv2.getText().toString();
        }
        if(degrees >= (FACTOR * 65) && degrees < (FACTOR * 67))
        {
            text = "12 red " + tv3.getText().toString();
        }
        if(degrees >= (FACTOR * 67) && degrees < (FACTOR * 69))
        {
            text = "35 black " + tv2.getText().toString();
        }
        if(degrees >= (FACTOR * 69) && degrees < (FACTOR * 71))
        {
            text = "3 red " + tv3.getText().toString();
        }
        if(degrees >= (FACTOR * 71) && degrees < (FACTOR * 73))
        {
            text = "26 black " + tv2.getText().toString();
        }
        if((degrees >= (FACTOR * 73) && degrees < 360) || (degrees >= 0 && degrees < (FACTOR * 1)))
        {
            text = "0";
        }

        return text;
    }

}