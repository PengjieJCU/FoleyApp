package au.edu.jcu.cp3406.foleyapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import java.util.Locale;

public class Secondary extends AppCompatActivity {
    ImageView image;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        image = findViewById(R.id.imageView);
        Intent intent = getIntent();
        final String buttonText = intent.getStringExtra("buttonName");
        showImage(buttonText);

        if (buttonText.toLowerCase().equals("airplanelanding")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.airplanelanding);
        } else if (buttonText.toLowerCase().equals("bomb")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.bomb);
        } else if (buttonText.toLowerCase().equals("dixiehorn")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.dixiehorn);
        } else if (buttonText.toLowerCase().equals("firetruck")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.firetruck);
        } else if (buttonText.toLowerCase().equals("heavyrain")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.heavyrain);
        } else if (buttonText.toLowerCase().equals("labradorbarking")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.labradorbarking);
        } else if (buttonText.toLowerCase().equals("musclecar")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.musclecar);
        } else if (buttonText.toLowerCase().equals("policewhistle")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.policewhistle);
        } else if (buttonText.toLowerCase().equals("rebel")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.rebel);
        } else if (buttonText.toLowerCase().equals("tomcat")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.tomcat);
        } else if (buttonText.toLowerCase().equals("watchalarm")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.watchalarm);
        } else if (buttonText.toLowerCase().equals("waterdrops")) {
            mediaPlayer = MediaPlayer.create(this, R.raw.waterdrops);
        }
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
    }

    private void showImage(String buttonName){
        switch (buttonName.toLowerCase()){
            case "airplanelanding":
                image.setImageResource(R.drawable.airplanelanding);
                break;
            case "bomb":
                image.setImageResource((R.drawable.bomb));
                break;
            case "dixiehorn":
                image.setImageResource((R.drawable.dixiehorn));
                break;
            case "firetruck":
                image.setImageResource((R.drawable.firetruck));
                break;
            case "heavyrain":
                image.setImageResource((R.drawable.heavyrain));
                break;
            case "labradorbarking":
                image.setImageResource((R.drawable.labradorbarking));
                break;
            case "musclecar":
                image.setImageResource((R.drawable.musclecar));
                break;
            case "policewhistle":
                image.setImageResource((R.drawable.policewhistle));
                break;
            case "rebel":
                image.setImageResource((R.drawable.rebel));
                break;
            case "tomcat":
                image.setImageResource((R.drawable.tomcat));
                break;
            case "watchalarm":
                image.setImageResource((R.drawable.watchalarm));
                break;
            case "waterdrops":
                image.setImageResource((R.drawable.waterdrops));
                break;
        }
    }
            @Override
    public boolean onTouchEvent(MotionEvent event){
        float x=event.getX();
        float y=event.getY();
        String action = "";
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                action = "started";
                break;
            case MotionEvent.ACTION_MOVE:
                action = "moved";
                break;
            case MotionEvent.ACTION_UP:
                action = "ended";
                break;
        }
        Log.i("TouchableActivity", String.format(Locale.getDefault(),"%.2f %.2f %s",x,y,action));
        return true;


    }

}
