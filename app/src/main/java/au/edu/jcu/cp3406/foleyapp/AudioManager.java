package au.edu.jcu.cp3406.foleyapp;

import android.content.Context;
import android.media.SoundPool;

public class AudioManager {
    private SoundPool soundPool;
    private int sampleID;
    private boolean loadedOkay;


    AudioManager(Context context){
        soundPool = new SoundPool(5, android.media.AudioManager.STREAM_MUSIC,0);
        soundPool.setOnLoadCompleteListener((soundPool, sampleID, status)->{
            loadedOkay = status ==0;
            if (loadedOkay){
                AudioManager.this.sampleID = sampleID;
            }
        });
    }

    void playSound(float speed, float volume){
        if (!loadedOkay)return;
        soundPool.play(sampleID,volume,volume,1,0,speed);
    }
    void resume(){soundPool.autoResume();}
    void pause(){soundPool.autoPause();}
}
